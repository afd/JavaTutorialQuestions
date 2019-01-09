package tutorialquestions.questione6fd;

public interface BitSet {

  /**
   * Add item to the bit set.  Throw a runtime exception if not in range.
   */
  void add(int item);

  /**
   * If item belongs to the bit set, remove it.
   */
  void remove(int item);

  /**
   * Return true iff item belongs to the bit set.
   */
  boolean contains(int item);

  /**
   * Update the bit set to contain only those values also present in other.
   */
  void intersectWith(BitSet other);

  /**
   * Return the maximum value that the bit set can represent.
   */
  int maxStorableValue();

}
