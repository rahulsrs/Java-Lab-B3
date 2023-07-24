package lab;

class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right;
    }
}
  
class BinaryTree
{
    Node root;
  
    int diff(Node node)
    {

        if (node == null)
            return 0;

        return node.data - diff(node.left) -
                                              diff(node.right);
    }
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(7);
        tree.root.left.right.left = new Node(2);
        tree.root.right.right = new Node(1);
        tree.root.right.right.right = new Node(8);
        tree.root.right.right.left = new Node(9);
        System.out.println(tree.diff(tree.root) + 
                                             " is the required difference");
  
    }
}