package kojoo.java.algorithm.inflearn.step7;

import java.util.LinkedList;
import java.util.Queue;

public class Question10 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(bfs(root));
    }

    private static int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node now = queue.poll();
                if (now.left == null && now.right == null) {
                    return depth;
                }
                if (now.left != null) {
                    queue.offer(now.left);
                }
                if (now.right != null) {
                    queue.offer(now.right);
                }


            }
            depth++;
        }
        return 0;
    }
}
