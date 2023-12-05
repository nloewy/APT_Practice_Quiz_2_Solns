public class TreeImbalance {
    public int imbalance(TreeNode t) {
        if (t == null) return 0;
        int me = balanceFactor(t);
        return Math.max(me, Math.max(imbalance(t.left), imbalance(t.right)));
    }
    private int balanceFactor(TreeNode t){
        if (t == null) return 0;
        int lcount = count(t.left);
        int rcount = count(t.right);
        return Math.abs(lcount-rcount);
    }
    private int count(TreeNode t) {
        if (t == null) return 0;
        return 1 + count(t.left) + count(t.right);
    }

}