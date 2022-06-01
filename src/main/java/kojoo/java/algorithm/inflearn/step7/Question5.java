package kojoo.java.algorithm.inflearn.step7;

public class Question5 {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        solution(node);
    }

    private static void solution(Node node) {
        if (node == null) {
            return;
        } else {
            solution(node.left);
            solution(node.right);
            System.out.print(node.top + " ");
        }
    }
}
