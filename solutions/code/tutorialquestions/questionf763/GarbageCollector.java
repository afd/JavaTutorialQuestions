package tutorialquestions.questionf763;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import tutorialquestions.question1171.original.GraphNode;

public class GarbageCollector {

  public <E> void collectGarbage(Set<GraphNode<E>> heapObjects,
      Set<GraphNode<E>> activeObjectRoots) {

    Set<GraphNode<E>> reachable = new HashSet<>();

    Deque<GraphNode<E>> stack = new ArrayDeque<>();

    for (GraphNode<E> node : activeObjectRoots) {
      stack.push(node);
    }

    while (!stack.isEmpty()) {

      GraphNode<E> node = stack.pop();

      if (!reachable.contains(node)) {

        reachable.add(node);

        for (int i = 0; i < node.getNumberOfSuccessors(); i++) {
          stack.push(node.getSuccessor(i));
        }
      }

    }

    heapObjects.retainAll(reachable);

  }

}
