public class PathLabel {

    public TreeNode label(TreeNode t) {
        helper(t);
        return t;
    }

    public int helper(TreeNode t){
        if (t==null){return 0;}
        if (t!=null && t.left==null && t.right==null){
            t.info = 1;
        }
        else{
            t.info = helper(t.left)+helper(t.right);
        }
        return t.info;
    }

}