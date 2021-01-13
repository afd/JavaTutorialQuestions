package tutorialquestions.questione6fd;

public class BitSet8 implements BitSet {

  private byte representation;

  public BitSet8() {
    representation = 0;
  }

  @Override
  public void add(int value) {
    if (!inRange(value)) {
      throw new RuntimeException("Value " + value + " too large for bit set");
    }
    representation |= ((byte) 1 << (byte) value);
  }

  @Override
  public void remove(int value) {
    if (inRange(value)) {
      representation &= (~((byte) 1 << (byte) value));
    }
  }

  @Override
  public boolean contains(int value) {
    if (!inRange(value)) {
      return false;
    }
    return (((byte) 1 << (byte) value) & representation) != 0;
  }

  @Override
  public void intersectWith(BitSet other) {
    if (other instanceof BitSet8) {
      representation &= ((BitSet8) other).representation;
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
    return Byte.SIZE;
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
