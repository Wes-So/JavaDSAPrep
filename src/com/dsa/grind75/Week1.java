package com.dsa.grind75;



import java.util.*;

public class Week1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums,target);
        System.out.println(Arrays.toString(output));

        String s = "([]){";
        System.out.println(isValid(s));

        int[] prices = {1,2,4,2,5,7,2,4,9,0,9};
        System.out.println(maxProfit(prices));

        String s2 = "race a car";
        System.out.println(isPalindrome(s2));

        String s3 = "anagram", t = "nagaram";
        System.out.println("Anagram:" + isAnagram(s3,t));

        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 9;
        System.out.println("Binary Search:" + search(nums2,target2));

        ListNode head = getListNode();
        System.out.println("hasCycle:" + hasCycle(head));

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);

        printTree(root);
        TreeNode invertedTree = invertTree(root);
        //printTree(invertedTree);

        int[][] image = {{0,0,0},{0,1,0}};
        int sr = 0, sc = 0, color = 2;

        int[][] new_image = floodFill(image,sr,sc,color);
        for (int[] ints : new_image) {
            System.out.println(Arrays.toString(ints));
        }

        int[] nums3 = {1,2,2,3,3,-1,-1,4,4};
        TreeNode root2 = new TreeNode(1);

        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        System.out.println(isBalanced(root2));


    }


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //Create a recursive function that takes a node and the two values n1 and n2.
        //If the value of the current node is less than both n1 and n2, then LCA lies in the right subtree. Call the recursive function for the right subtree.
        //If the value of the current node is greater than both n1 and n2, then LCA lies in the left subtree. Call the recursive function for the left subtree.
        //If both the above cases are false then return the current node as LCA.

        if(root == null) return null;

        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p,q);
        } else if(root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left,p,q);
        } else {
            return root;
        }
    }


    public static boolean isBalanced(TreeNode root) {
        int output = isBalancedHelper(root);
        return output > -1;
    }

    public static int isBalancedHelper(TreeNode root) {
        //base case
        if(root == null) return 0;

        int left = isBalancedHelper(root.left);
        int right = isBalancedHelper(root.right);

        if(left == -1 || right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;


        return 1 + Math.max(left,right);
    }


    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        System.out.println(image.length);
        System.out.println(image[sr].length);
        return floodFillHelper(image,sr,sc,color,image[sc][sr]);
    }

    private static int[][] floodFillHelper(int[][] image, int sr, int sc, int color, int original) {
        System.out.println("sr:" + sr + "sc:" + sc);

        //Check boundaries
        if(sr < 0 || sc < 0) return image;
        if(sr >= image.length) return image;
        if(sc >= image[0].length) return image;

        if(image[sr][sc] != original) return image;
        if(image[sr][sc] == color) return image;

        //update the current cell
        image[sr][sc] = color;

        //recursive to update adjacent cells
        floodFillHelper(image,sc, sr -1, color,original);
        floodFillHelper(image,sc, sr + 1, color,original);
        floodFillHelper(image,sc + 1, sr, color,original);
        floodFillHelper(image,sc - 1, sr, color,original);

        return image;
    }

    private static void printTree(TreeNode node) {
        if(node == null)  return;
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }



    private static ListNode getListNode() {
        ListNode head = new ListNode(0);
        ListNode dups = new ListNode(2);
        ListNode one = new ListNode(1);
        dups.next = head;
        head.next = one;
        one.next = dups;
        return head;
    }

    public static boolean hasCycle(ListNode head) {
        List<ListNode> lst = new ArrayList<>();
        while(head != null){
            System.out.println(head.val);
            if(lst.contains(head.next)){
                return true;
            }
            lst.add(head.next);
            head = head.next;
        }
        return false;
    }

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        if(s.length() != t.length()) return false;

        for (int i = 0; i < s.length() ; i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0) + 1);

        }

        return map1.equals(map2);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        int left = 0, right = s.length() -1;
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }

        }
        return true;
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int x = 0, y = 1;
        while(y < prices.length) {
            int diff = prices[y] - prices[x];
            if(diff > 0) {
                maxProfit = Math.max(maxProfit, diff);
            } else {
                x = y;
            }
            y++;
        }
        return maxProfit;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(-1);
        ListNode temp = node;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null) temp.next = list1;
        if(list2 != null) temp.next = list2;

        return node.next;
    }

    public static boolean isValid(String s) {
        /*
            1. Loop around string
            2. if the char is opening then add to stack
            3. if the char is closing then pop from stack and ensure that it's the right pair
            4. if any point it's not then return false
            5. last line should return true
         */
        Stack<Character> stack = new Stack<>();
        char[] letters = s.toCharArray();
        for (char letter : letters) {
            if (letter == '(' || letter == '{' || letter == '[') {
                stack.push(letter);
                continue;
            }

            if(stack.empty()) return false;

            char open = stack.pop();
            switch (letter) {
                case (']'):
                    if (open != '[') return false;
                    break;
                case (')'):
                    if (open != '(') return false;
                    break;
                case ('}'):
                    if (open != '{') return false;
                    break;
            }

        }


        return stack.empty();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        int idx =0;
        while(idx < nums.length){
            int key = target - nums[idx];
            if(map.containsKey(key)){
                output[0] = map.get(key);
                output[1] = idx;
            }
            map.putIfAbsent(nums[idx],idx);
            idx++;
        }

        return output;
    }



}
