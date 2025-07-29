package finalexam;

import java.util.*;

public class F09_BinaryTreeLeftView {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        sc.close();

        if (line.isEmpty()) {
            System.out.println("LeftView:");
            return;
        }

        String[] tokens = line.split("\\s+");
        List<Integer> vals = new ArrayList<>();
        for (String t : tokens) {
            vals.add(Integer.parseInt(t));
        }

        if (vals.isEmpty() || vals.get(0) == -1) {
            System.out.println("LeftView:");
            return;
        }

        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> buildQ = new LinkedList<>();
        buildQ.offer(root);
        int idx = 1;
        while (idx < vals.size() && !buildQ.isEmpty()) {
            TreeNode node = buildQ.poll();
            int v = vals.get(idx++);
            if (v != -1) {
                node.left = new TreeNode(v);
                buildQ.offer(node.left);
            }
            if (idx < vals.size()) {
                v = vals.get(idx++);
                if (v != -1) {
                    node.right = new TreeNode(v);
                    buildQ.offer(node.right);
                }
            }
        }

        List<Integer> leftView = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                if (i == 0) {
                    leftView.add(cur.val);
                }
                if (cur.left != null)  q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
        }

        System.out.print("LeftView:");
        for (int v : leftView) {
            System.out.print(" " + v);
        }
        System.out.println();
    }
}


