package com.dsa.topinterview150;

public class StrStr {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "pi";
        System.out.println(strStr(haystack,needle));
    }

    static int strStr(String haystack, String needle) {

        int x = -1;
        int j = 0;
        int i = 0;
        while(i < haystack.length()) {
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;

                if(x == -1)
                    x = i;

                i++;
            } else {
                j = 0;

                if(x > -1) {
                    i = x + 1;
                }  else {
                    i++;
                }

//                if(x > -1 && haystack.charAt(x + 1) != needle.charAt(j)) {
//                    i = x + 1;
//                } else if(x > - 1 && haystack.charAt(i -1) == needle.charAt(j)){
//                    continue;
//                } else {
//                    i++;
//                }
                x=-1;
            }

            if(j >= needle.length()) {
                return x;
            }
        }


        if(j < needle.length())
            return -1;
        return x;
    }

}
