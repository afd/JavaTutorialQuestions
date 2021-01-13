package tutorialquestions.questionc822.precondition;

public class TreeNodeTest2 {

  /**
   * Tree node example.
   */
  public static void main(String[] args) {

    TreeNode<String> n3 = new TreeNode<>(2);
    n3.setKey("C");
    TreeNode<String> n4 = new TreeNode<>(1);
    n4.setKey("D");
    TreeNode<String> n5 = new TreeNode<>(0);
    n5.setKey("E");
    n3.setChild(0, n4);
    n3.setChild(1, n5);
    n4.setChild(0, n5);

    // Such warnings are generally important - I am suppressing it because
    // it doesn't matter for this simple demo, and I don't want its presence
    // to make me miss other warnings!
    @SuppressWarnings("unused")
    TreeNode<String> clone = n3.clone();

  }
}
