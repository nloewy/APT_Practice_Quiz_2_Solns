public class TreeGrowLeaves {
    public TreeNode grow(TreeNode root, int value) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            root.left = new TreeNode(value + root.info);
        } else {
            root.left = grow(root.left, value + root.info);
        }
        if (root.right == null) {
            root.right = new TreeNode(value + root.info);
        } else {
            root.right = grow(root.right, value + root.info);
        }
        return root;
    }
}
