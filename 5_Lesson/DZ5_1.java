import java.util.Stack;

public class Node {
	Node left;
    Node right;
    Node parent;
    String value;
    public Node(Node p, String v){
        parent=p;
        value=v;
    }
    static void contPreOrder(Node top){
        Stack<Node> stack = new Stack<> (); 
        while (top!=null || !stack.empty()){
            if (!stack.empty()){
                top=stack.pop();
            }
            while (top!=null){
                top.treatment();
                if (top.right!=null) stack.push(top.right);
                top=top.left;
            }
        }
   }

}
// Вертикальный прямой обход
