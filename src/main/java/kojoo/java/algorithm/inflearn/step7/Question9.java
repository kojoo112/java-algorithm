package kojoo.java.algorithm.inflearn.step7;

public class Question9 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(dfs(0, root));
    }

    private static int dfs(int depth, Node root) {
        if (root.left == null && root.right == null) {
            return depth;
        } else {
            return Math.min(dfs(depth + 1, root.left), dfs(depth + 1, root.right));
        }
    }
}
