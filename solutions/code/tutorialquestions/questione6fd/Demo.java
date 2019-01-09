package tutorialquestions.questione6fd;

public class Demo {

  public static void main(String[] args) {

    final BitSet small = new BitSet8();
    final BitSet medium = new BitSet64();
    final BitSet large = new BitSetArray(256);

    for (int i = 0; i < 254; i += 2) {
      large.add(i + 2);
    }

    small.add(3);
    small.add(4);
    small.add(6);
    small.add(0);
    medium.add(12);
    medium.add(15);

    System.out.println("Small bit set is: " + small);
    System.out.println("Medium bit set is: " + medium);
    System.out.println("Large bit set is: " + large);
    large.intersectWith(small);
    System.out.println("Large after intersecting with small is: " + large);

  }

}
