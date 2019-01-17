package tutorialquestions.question96df.solution;

public abstract class AbstractTreeNode<E> implements TreeNode<E> {

  private E key;

  @Override
  public final E getKey() {
    return key;
  }

  @Override
  public final void setKey(E key) {
    this.key = key;
  }

  @Override
  public final String toString() {
    String result = key.toString();
    if (getNumberOfChildren() > 0) {
      result += "(";
      for (int i = 0; i < getNumberOfChildren(); i++) {
        result += getChild(i);
        if (i < getNumberOfChildren() - 1) {
          result += ", ";
        }
      }
      result += ")";
    }
    return result;
  }

}
