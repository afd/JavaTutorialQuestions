package tutorialquestions.question96df.solution;

public class LeafTreeNode<E> extends AbstractTreeNode<E> {

  @Override
  public TreeNode<E> getChild(int childIndex) {
    assert false;
    return null;
  }

  @Override
  public int getNumberOfChildren() {
    return 0;
  }

  @Override
  public void setChild(int childIndex, TreeNode<E> child) {
    assert false;
  }

}
