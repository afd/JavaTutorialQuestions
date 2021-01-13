package tutorialquestions.questionc822.precondition;

public class TreeNodeTest1 {


  public static void main(String[] args) {

    TreeNode<String> n1 = new TreeNode<>(1);
    n1.setKey("A");
    TreeNode<String> n2 = new TreeNode<>(1);
    n2.setKey("B");
    n1.setChild(0, n2);
    n2.setChild(0, n1);

    // Such warnings are generally important - I am suppressing it because
    // it doesn't matter for this simple demo, and I don't want its presence
    // to make me miss other warnings!
    @SuppressWarnings("unused")
    TreeNode<String> clone = n1.clone();

  }

}
