package tutorialquestions.question0c21.methodssolution;

import java.util.HashSet;
import java.util.Set;


public class PropertyCollection {

  private final Set<Property> properties;

  public PropertyCollection() {
    properties = new HashSet<>();
  }

  public void addProperty(Property property) {
    properties.add(property);
  }

  public Set<House> getHouses() {
    Set<House> result = new HashSet<>();
    for (Property p : properties) {
      if (p.isHouse()) {
        result.add((House) p);
      }
    }
    return result;
  }

  public Set<Bungalow> getBungalows() {
    Set<Bungalow> result = new HashSet<>();
    for (Property p : properties) {
      if (p.isBungalow()) {
        result.add((Bungalow) p);
      }
    }
    return result;
  }

  public Set<Flat> getFlats() {
    Set<Flat> result = new HashSet<>();
    for (Property p : properties) {
      if (p.isFlat()) {
        result.add((Flat) p);
      }
    }
    return result;
  }

  public Set<Maisonette> getMaisonettes() {
    Set<Maisonette> result = new HashSet<>();
    for (Property p : properties) {
      if (p.isMaisonette()) {
        result.add((Maisonette) p);
      }
    }
    return result;
  }

  public Set<TerracedHouse> getTerracedHouses() {
    Set<TerracedHouse> result = new HashSet<>();
    for (Property p : properties) {
      if (p.isTerraced()) {
        result.add((TerracedHouse) p);
      }
    }
    return result;
  }

}
