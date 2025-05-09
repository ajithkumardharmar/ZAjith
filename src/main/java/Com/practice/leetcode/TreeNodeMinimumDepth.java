package Com.practice.leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class TreeNodeMinimumDepth {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        // If one child is null, go down the non-null child
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);

        // Both children are present, take the minimum
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
    
    public static void main(String[] args) {
        // Example: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = minDepth(root);
        System.out.println("Minimum depth (DFS): " + result); // Output: 2
    }
}


