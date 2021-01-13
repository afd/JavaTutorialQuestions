package tutorialquestions.question1171.original;

import java.util.ArrayList;
import java.util.List;

public class GraphNode<E> {

  private E key;
  private final List<GraphNode<E>> successors;

  public GraphNode() {
    successors = new ArrayList<>();
  }

  public int getNumberOfSuccessors() {
    return successors.size();
  }

  public GraphNode<E> getSuccessor(int successorIndex) {
    return successors.get(successorIndex);
  }

  public void addSuccessor(GraphNode<E> successor) {
    successors.add(successor);
  }

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }

}
