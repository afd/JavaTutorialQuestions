package tutorialquestions.question1171.solution;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphNode<E> implements Cloneable {

  private E key;
  private List<GraphNode<E>> successors;

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

  @Override
  public GraphNode<E> clone() {

    Map<GraphNode<E>, GraphNode<E>> oldToNew = new HashMap<>();

    Deque<GraphNode<E>> stack = new ArrayDeque<>();

    stack.push(this);

    while (!stack.isEmpty()) {
      GraphNode<E> oldNode = stack.pop();
      oldToNew.put(oldNode, oldNode.internalClone());
      for (GraphNode<E> oldSuccessor : oldNode.successors) {
        if (!oldToNew.containsKey(oldSuccessor)) {
          stack.push(oldSuccessor);
        }
      }
    }

    for (GraphNode<E> oldNode : oldToNew.keySet()) {
      GraphNode<E> newNode = oldToNew.get(oldNode);
      for (GraphNode<E> oldSuccessor : oldNode.successors) {
        newNode.addSuccessor(oldToNew.get(oldSuccessor));
      }
    }

    return oldToNew.get(this);

  }

  @SuppressWarnings("unchecked")
  private GraphNode<E> internalClone() {
    try {
      GraphNode<E> result = (GraphNode<E>) super.clone();
      result.successors = new ArrayList<>();
      return result;
    } catch (CloneNotSupportedException ex) {
      // This should never be thrown, because
      // GraphNode<E> implements Cloneable
      assert false;
      return null;
    }
  }

}
