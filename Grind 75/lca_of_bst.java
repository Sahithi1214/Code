/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            }else if(p.val > root.val && q.val > root.val){
                root = root.right;
            }else{
                return root;
            }
        }
        return null;
    }
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     ArrayList<TreeNode> pList = new ArrayList<>();
    //     ArrayList<TreeNode> qList = new ArrayList<>();

    //     traverse(root, p, pList);
    //     traverse(root, q, qList);

    //     TreeNode lca = null;
    //     int i = 0;
    //     while (i < pList.size() && i < qList.size()) {
    //         if (pList.get(i) == qList.get(i)) {
    //             lca = pList.get(i);
    //         } else {
    //             break;
    //         }
    //         i++;
    //     }
    //     return lca;
    // }

    // private boolean traverse(TreeNode root, TreeNode target, List<TreeNode> path) {
    //     if (root == null) return false;

    //     path.add(root);

    //     if (root == target) return true;

    //     if (traverse(root.left, target, path) || traverse(root.right, target, path)) {
    //         return true;
    //     }

    //     path.remove(path.size() - 1);
    //     return false;
    // }
}
