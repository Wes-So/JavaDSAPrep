package com.dsa.grind75;

import java.util.*;

public class Week3 {
    public static void main(String[] args) {
        TreeNode root = getTreeNode();
        System.out.println(levelOrder(root));
        System.out.println("ThreeSum");
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));



    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        map.put(node, new Node(node.val));
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (Node neighbor : current.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                map.get(current).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++; // skip duplicates
                    while (left < right && nums[right] == nums[right - 1]) right--; // skip duplicates
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
   

        return result;
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> masterList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {

                TreeNode node = queue.remove();
                temp.add(node.val);
                System.out.println(node.val);

                if(node.left != null) queue.add(node.left);
                if(node.right != null)queue.add(node.right);
            }
            masterList.add(temp);
        }
        return masterList;

    }

    private static TreeNode getTreeNode() {
        TreeNode root = new TreeNode(1);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        twenty.left = new TreeNode(15);
        twenty.right = new TreeNode(7);
        root.left = nine;
        root.right = twenty;
        return root;
    }


}
