package tutorialquestions.questiona6e7.noinnerclasses;

public interface IntSet {

  void add(int item);

  boolean remove(int item);

  boolean isEmpty();

  boolean contains(int item);

  boolean contains(IntSet other);

  IntSetIterator iterator();

  void addAll(IntSet other);

  void removeAll(IntSet other);

}

