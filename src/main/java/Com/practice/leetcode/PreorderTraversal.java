package Com.practice.leetcode;

import java.util.*;

//TreeNode class definition
//class TreeNode {
// int val;
// TreeNode left, right;
// TreeNode(int x) {
//     val = x;
// }
//}

public class PreorderTraversal {

 // Iterative preorder traversal method
 public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> result = new ArrayList<>();
     if (root == null) return result;

     Stack<TreeNode> stack = new Stack<>();
     stack.push(root);

     while (!stack.isEmpty()) {
         TreeNode curr = stack.pop();          // 1. Pop from stack
         result.add(curr.val);                 // 2. Visit node

         if (curr.right != null) stack.push(curr.right); // 3. Push right
         if (curr.left != null) stack.push(curr.left);   // 4. Push left
     }

     return result;
 }

 // Main method to test the traversal
 public static void main(String[] args) {
     /*
         Building this tree:
             1
              \
               2
              /
             3
     */
     TreeNode root = new TreeNode(1);
     root.right = new TreeNode(2);
     root.right.left = new TreeNode(3);

     PreorderTraversal solution = new PreorderTraversal();
     List<Integer> result = solution.preorderTraversal(root);

     System.out.println("Preorder Traversal: " + result);  // Output: [1, 2, 3]
 }
}

