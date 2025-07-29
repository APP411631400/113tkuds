package finalexam;

import java.util.*;

public class F12_TreeDiameter {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        sc.close();
        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tok = line.split("\\s+");
        List<Integer> vals = new ArrayList<>();
        for (String t : tok) {
            vals.add(Integer.parseInt(t));
        }
        TreeNode root = buildTree(vals);
        depth(root);
        System.out.println(ans);
    }

    private static TreeNode buildTree(List<Integer> vals) {
        if (vals.get(0) == -1) return null;
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

    private static int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L + R);
        return Math.max(L, R) + 1;
    }
}

