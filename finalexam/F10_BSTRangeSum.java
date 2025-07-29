package finalexam;

import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("Sum: 0");
            return;
        }
        String[] tok = line.split("\\s+");
        List<Integer> vals = new ArrayList<>();
        for (String t : tok) {
            vals.add(Integer.parseInt(t));
        }
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        TreeNode root = buildTree(vals);
        int sum = rangeSumBST(root, L, R);
        System.out.println("Sum: " + sum);
    }

    private static TreeNode buildTree(List<Integer> vals) {
        if (vals.isEmpty() || vals.get(0) == -1) return null;
        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (i < vals.size() && !q.isEmpty()) {
            TreeNode cur = q.poll();
            int v = vals.get(i++);
            if (v != -1) {
                cur.left = new TreeNode(v);
                q.offer(cur.left);
            }
            if (i < vals.size()) {
                v = vals.get(i++);
                if (v != -1) {
                    cur.right = new TreeNode(v);
                    q.offer(cur.right);
                }
            }
        }
        return root;
    }

    private static int rangeSumBST(TreeNode node, int L, int R) {
        if (node == null) return 0;
        if (node.val < L) {
            return rangeSumBST(node.right, L, R);
        }
        if (node.val > R) {
            return rangeSumBST(node.left, L, R);
        }
        return node.val
            + rangeSumBST(node.left,  L, R)
            + rangeSumBST(node.right, L, R);
    }
}

