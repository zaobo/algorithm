package com.zab.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LeetCode95 {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int l, int r) {
        List<TreeNode> res = new ArrayList<>();
        if (l > r) {
            res.add(null);
            return res;
        }

        for (int i = l; i <= r; i++) {
            List<TreeNode> leftTrees = generateTrees(l, i - 1);
            List<TreeNode> rightTrees = generateTrees(i + 1, r);

            // 从左右子树中选一棵拼接上当前节点
            for (TreeNode leftTree : leftTrees) {
                for (TreeNode rightTree : rightTrees) {
                    TreeNode cur = new TreeNode(i);
                    cur.left = leftTree;
                    cur.right = rightTree;
                    res.add(cur);
                }
            }
        }
        return res;

    }

}
