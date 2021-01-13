package tutorialquestions.questione6fd;

public class BitSet64 implements BitSet {

  private long representation;

  public BitSet64() {
    representation = 0;
  }

  @Override
  public void add(int item) {
    if (!inRange(item)) {
      throw new RuntimeException("Value " + item + " too large for bit set");
    }
    representation |= ((long) 1 << (long) item);
  }

  @Override
  public void remove(int item) {
    if (inRange(item)) {
      representation &= (~((long) 1 << (long) item));
    }
  }

  @Override
  public boolean contains(int item) {
    if (!inRange(item)) {
      return false;
    }
    return (((long) 1 << (long) item) & representation) != 0;
  }

  @Override
  public void intersectWith(BitSet other) {
    if (other instanceof BitSet64) {
      representation &= ((BitSet64) other).representation;
    } else {
      for (int x = 0; inRange(x); x++) {
        if (!other.contains(x)) {
          remove(x);
        }
      }
    }
  }

  @Override
  public int maxStorableValue() {
    return Long.SIZE;
  }

  @Override
  public String toString() {
    final StringBuilder result = new StringBuilder("{ ");
    boolean first = true;
    for (int x = 0; inRange(x); x++) {
      if (contains(x)) {
        if (first) {
          first = false;
        } else {
          result.append(", ");
        }
        result.append(x);
      }
    }
    return result + " }";
  }

  private boolean inRange(int x) {
    return x >= 0 && x < maxStorableValue();
  }

}
