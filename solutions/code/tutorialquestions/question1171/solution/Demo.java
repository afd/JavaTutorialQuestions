package tutorialquestions.question1171.solution;


public class Demo {

  public static void main(String[] args) {

    // Make some nodes
    GraphNode<String> original = new GraphNode<>();
    original.setKey("Hello");
    GraphNode<String> child1 = new GraphNode<>();
    child1.setKey("Child 1");
    GraphNode<String> child2 = new GraphNode<>();
    child1.setKey("Child 2");

    // Join them up
    original.addSuccessor(child1);
    original.addSuccessor(child2);
    child1.addSuccessor(original); // Creates a cycle
    child2.addSuccessor(original); // Creates a cycle

    // Clone original
    GraphNode<String> clone = original.clone();

    // Check that the clone uses distinct nodes
    assert original != clone;
    assert original.getSuccessor(0) != clone.getSuccessor(0);
    assert original.getSuccessor(1) != clone.getSuccessor(1);
    assert original.getSuccessor(0).getSuccessor(0) != clone.getSuccessor(0).getSuccessor(0);
    assert original.getSuccessor(1).getSuccessor(0) != clone.getSuccessor(1).getSuccessor(0);

    // Check that original has cycles
    assert original.getSuccessor(0).getSuccessor(0) == original;
    assert original.getSuccessor(1).getSuccessor(0) == original;

    // Check that clone has corresponding cycles
    assert clone.getSuccessor(0).getSuccessor(0) == clone;
    assert clone.getSuccessor(1).getSuccessor(0) == clone;

    // Check that original and clone share same keys
    assert original.getKey() == clone.getKey();
    assert original.getSuccessor(0).getKey() == clone.getSuccessor(0).getKey();
    assert original.getSuccessor(1).getKey() == clone.getSuccessor(1).getKey();

  }

}
