package com.zab.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }

}
