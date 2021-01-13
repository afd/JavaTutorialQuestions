package tutorialquestions.questionc822.precondition;


public class TreeNode<E> {

  private E key;
  private final TreeNode<E>[] children;
  private int numberOfParents;

  @SuppressWarnings("unchecked")
  public TreeNode(int numberOfChildren) {
    children = (TreeNode<E>[]) new TreeNode[numberOfChildren];
    numberOfParents = 0;
  }

  public int getNumberOfChildren() {
    return children.length;
  }

  public TreeNode<E> getChild(int childIndex) {
    return children[childIndex];
  }

  public void setChild(int childIndex, TreeNode<E> child) {

    assert child == null || !child.reaches(this);
    assert child == null || child.numberOfParents == 0;

    if (children[childIndex] != null) {
      children[childIndex].numberOfParents--;
    }

    children[childIndex] = child;

    if (children[childIndex] != null) {
      children[childIndex].numberOfParents++;
    }

  }

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }

  public TreeNode<E> clone() {
    TreeNode<E> result = new TreeNode<>(getNumberOfChildren());
    for (int i = 0; i < getNumberOfChildren(); i++) {
      result.setChild(i, getChild(i).clone());
    }
    return result;
  }

  private boolean reaches(TreeNode<E> n) {
    if (this == n) {
      return true;
    }
    for (int i = 0; i < getNumberOfChildren(); i++) {
      if (getChild(i) != null && getChild(i).reaches(n)) {
        return true;
      }
    }
    return false;
  }

}
