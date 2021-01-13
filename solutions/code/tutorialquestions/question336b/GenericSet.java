package tutorialquestions.question336b;

public interface GenericSet<E> {

  void add(E item);

  boolean remove(E item);

  boolean isEmpty();

  boolean contains(E item);

  // This is a vanilla method for adding every element in an array to the set, regardless of what
  // the underlying set representation is.  This might end up being very efficient for some set
  // representations, but it is functionally correct.
  default void addAll(E[] items) {
    for (E item : items) {
      add(item);
    }
  }

  // This returns a wrapper object that implements the GenericSet interface and throws an exception
  // if either of the mutator methods are called.  For the other methods, it delegates to the
  // original set's methods.  Think about what happens if you call one of the default methods on
  // the set returned by 'asUnmodifiableSet'.
  default GenericSet<E> asUnmodifiableSet() {

    // This is an example of an *anonymous class* that implements the GenericSet interface.  An
    // alternative to using an anonymous class would be to have a generic class called
    // UnmodifiableWrapperSet that implements the GenericSet interface and provides this
    // functionality.
    return new GenericSet<>() {
      @Override
      public void add(E item) {
        throw new UnsupportedOperationException("Attempt to add to an unmodifiable set.");
      }

      @Override
      public boolean remove(E item) {
        throw new UnsupportedOperationException("Attempt to remove from an unmodifiable set.");
      }

      @Override
      public boolean isEmpty() {
        // Interesting syntax: if we just wrote "return isEmpty()" that would invoke the "isEmpty"
        // method on the anonymous inner class, i.e. the current method, leading to infinite
        // recursion.  By writing "GenericSet.this" we ask for the outer class's version of the
        // method to be invoked.
        return GenericSet.this.isEmpty();
      }

      @Override
      public boolean contains(E item) {
        // See note above about this syntax.
        return GenericSet.this.contains(item);
      }
    };
  }

}
