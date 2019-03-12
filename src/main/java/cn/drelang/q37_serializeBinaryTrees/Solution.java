package cn.drelang.q37_serializeBinaryTrees;


/**
 * 问题：序列化二叉树
 *   请实现两个函数，分别用来序列化和反序列化二叉树。
 *
 * 解法：
 *   用先序遍历，而且将 null 换为 $ 符号
 *
 * Created by Drelang on 2019/03/12 10:25
 */
class Solution {
    String Serialize(TreeNode root) {
        if (root == null)
            return "";
        StringBuffer sb = new StringBuffer();
        doSerialize(root, sb);
        return sb.toString();
    }

    private void doSerialize(TreeNode root, StringBuffer sb) {
        if (root == null) {
            sb.append("$,");
            return;
        }
        sb.append(root.val);
        sb.append(",");
        doSerialize(root.left, sb);
        doSerialize(root.right, sb);
    }

    TreeNode Deserialize(String str) {
        if (str == null || str.length() < 1)
            return null;
        return doDeserialize(str.replace(",",""));
    }

    private int index = 0;

    private TreeNode doDeserialize(String str) {
        if (str == null)
            return null;
        char ch = str.charAt(index++);

        if (index < str.length() && ch != '$') {
            TreeNode root = new TreeNode(0);
            root.val = Integer.parseInt(ch+"");
            root.left = doDeserialize(str);
            root.right = doDeserialize(str);
            return root;
        }
        return null;
    }
}
