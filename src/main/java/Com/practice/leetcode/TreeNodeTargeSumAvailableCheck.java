package Com.practice.leetcode;

/*class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}*/

public class TreeNodeTargeSumAvailableCheck {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // If it's a leaf, check if value equals targetSum
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Recursively check left and right subtrees
        int remainingSum = targetSum - root.val;

        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }

    public static void main(String[] args) {
        // Build the tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        boolean result = hasPathSum(root, targetSum);
        System.out.println("Has path sum: " + result); // Output: true
    }
}
