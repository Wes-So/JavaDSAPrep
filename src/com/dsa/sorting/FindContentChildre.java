package com.dsa.sorting;

class FindContentChildren {

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        findContentChildren(g,s);

    }
    public static int findContentChildren(int[] students, int[] cookies) {
        int count = 0;
        int cookiesIdx = 0;
        int cookiesAmnt = 0;
        for(int i = 0; i<students.length; i++){
            System.out.println("Student:" + students[i]);
            while(cookiesIdx < cookies.length) {
                cookiesAmnt += cookies[cookiesIdx];
                System.out.println(cookiesAmnt);
                if(students[i] <= cookiesAmnt){
                    count++;
                    cookiesAmnt = 0;
                    cookiesIdx++;
                    break;
                }
                cookiesIdx++;
            }

        }
        System.out.println("Total count:=" + count);
        return count;
    }

                /*
            1) get student 1
            2) check if cookiesAmnt can satisfy student
            3) if yes increment count, set cookiesAmnt to zero, increment cookiesIdx, break
            4) if no add to cookiesAmnt, increment cookiesIdx
            5) if no more cookies return
            6) once done with students return
            */





    //case1: cookies are same or less then children
    //case2: cookies are more than children
//               if(i >= s.length)
//            return count;
//
//            if(g[i] <= s[i]){
//        count++;
//    } else {
//        if(i+1 < s.length)
//            s[i + 1] += s[i];
//    }

}
