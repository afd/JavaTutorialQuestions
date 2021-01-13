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
    final StringBuilder result = new StringBuilder(key.toString());
    if (getNumberOfChildren() > 0) {
      result.append("(");
      for (int i = 0; i < getNumberOfChildren(); i++) {
        result.append(getChild(i));
        if (i < getNumberOfChildren() - 1) {
          result.append(", ");
        }
      }
      result.append(")");
    }
    return result.toString();
  }

}
