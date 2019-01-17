package tutorialquestions.question0c21.methodssolution;


public class PropertyDemo {

  public static void main(String[] args) {

    PropertyCollection collection = new PropertyCollection();

    for (int i = 0; i < 1000; i++) {
      collection.addProperty(new SemiDetachedHouse());
      collection.addProperty(new TerracedHouse());
    }

    for (int i = 0; i < 100; i++) {
      collection.addProperty(new DetachedHouse());
      collection.addProperty(new SemiDetachedBungalow());
      collection.addProperty(new Flat());
    }

    for (int i = 0; i < 20; i++) {
      collection.addProperty(new Maisonette());
      collection.addProperty(new DetachedBungalow());
      collection.addProperty(new TerracedBungalow());
    }

    System.out.println("Number of houses: " + collection.getHouses().size());
    assert collection.getHouses().size() == 2240;

    System.out.println("Number of bungalows: " + collection.getBungalows().size());
    assert collection.getBungalows().size() == 140;

    System.out.println("Number of flats: " + collection.getFlats().size());
    assert collection.getFlats().size() == 120;

    System.out.println("Number of maisonettes: " + collection.getMaisonettes().size());
    assert collection.getMaisonettes().size() == 20;

    System.out.println("Number of terraced houses: " + collection.getTerracedHouses().size());
    assert collection.getTerracedHouses().size() == 1020;
  }

}
