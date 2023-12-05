
public class TreeSumTotal {
    public int count(TreeNode tree, int target) {
        if (tree==null){return 0;}
        int sumTree = sum(tree);
        int result = 0;
        if (sumTree==target){
            result+=1;
        }
        return result + count(tree.left,target)+count(tree.right,target);
    }
    public int sum(TreeNode tree){
        if(tree==null){return 0;}
        return tree.info+sum(tree.left)+sum(tree.right);
    }

}