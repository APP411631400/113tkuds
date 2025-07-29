package finalexam;

import java.util.*;

public class F11_BSTClosestValue {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tok = line.split("\\s+");
        List<Integer> vals = new ArrayList<>();
        for (String t : tok) {
            vals.add(Integer.parseInt(t));
        }
        int target = sc.nextInt();
        sc.close();

        TreeNode root = buildTree(vals);
        int closest = findClosest(root, target);
        System.out.println(closest);
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

    private static int findClosest(TreeNode node, int target) {
        int closest = node.val;
        while (node != null) {
            int diff = Math.abs(node.val - target);
            int best = Math.abs(closest - target);
            if (diff < best || (diff == best && node.val < closest)) {
                closest = node.val;
            }
            node = (target < node.val ? node.left : node.right);
        }
        return closest;
    }
}

