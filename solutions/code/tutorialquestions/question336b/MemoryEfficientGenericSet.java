package tutorialquestions.question336b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemoryEfficientGenericSet<E> implements GenericSet<E> {

  private final List<E> elements;

  public MemoryEfficientGenericSet() {
    elements = new ArrayList<>();
  }

  @Override
  public void add(E item) {
    if (elements.contains(item)) {
      return;
    }
    elements.add(item);
  }

  @Override
  public boolean contains(E item) {
    return elements.contains(item);
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public boolean remove(E item) {
    return elements.remove(item);
  }

  // This overrides the default implementation of addAll to do something more efficient for
  // this kind of set.
  @Override
  public void addAll(E[] items) {
    // Keep track of all the elements that are known to belong to this set, storing them as a
    // HashSet, which supports efficient lookup.
    final Set<E> knownElements = new HashSet<>(elements);
    // Now go through all of the items to be added to our memory-efficient set.
    for (E item : items) {
      // Efficiently check whether we know this element already exists.  If it does,
      // do nothing.
      if (!knownElements.contains(item)) {
        // The element is new, so:
        // (1) Add it directly to the end of 'elements' - don't go through our 'add' method, which
        //     would check (inefficiently) whether the element is already present.
        elements.add(item);
        // (2) Record the fact that we have seen this element, so that if it occurs in 'elements'
        //     again we skip it.
        knownElements.add(item);
      }
    }
  }

}
