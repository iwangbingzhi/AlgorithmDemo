package com.basedemo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Test1 test1 = new Test1();
        //int[] nums = {2,7,11,15};
      /*  String j = "Aa";
        String s = "AAAaABBBBB";
       int b = test1.diamond("Aa","AAAaABBBBB");
       System.out.println("您一共有："+b+"颗宝石");*/

//       String s = "hello";
//       String reverses = test1.reverseString2(s);
//       System.out.println(reverses);

        /*String J = "AB";
        String S = "AAAAAaBBBB";
        int i = test1.diamond(J,S);
        System.out.println(i);*/

    }
        //给定数组中的两个位置，判断两个数在数组中位置
        public int[] twoSum2(int[] nums,int target) throws Exception {
            int[] result = {0,0};
            for (int i = 0; i <nums.length ; i++) {
                for (int j = i+1; j <nums.length ; j++) {
                    if (nums[i]+nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            throw new IllegalAccessException("没找到两个数之和");
        }
        //判断回文字符串
        public void revertedString() {
            System.out.println("请输入一个字符串:");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String news = new String(sb);
            if (s.equals(news)){
                System.out.println(s+"是回文字符串");
            }else{
                System.out.println(s+"不是回文字符串");

            }
    }

    /*给定字符串J 代表石头中宝石的类型，和字符串S代表你拥有的石头。
    S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
    J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。*/
        public int diamond(String J,String S){
            int i = 0;
            for (int s = 0; s <S.length(); s++) {
                for (int j = 0; j <J.length(); j++) {
                    if(J.charAt(j) == S.charAt(s)){
                        i++;
                    }
                }
            }
            return i;
        }

     /*   //给定一个字符串，反转之后返回反转的字符串
        public String reverseString(String s) {
          StringBuilder sb = new StringBuilder(s);
          String rs = sb.reverse().toString();
          return rs;
        }*/
     public String reverseString2(String s2){
         StringBuilder sb2 = new StringBuilder(s2);
         s2 = sb2.reverse().toString();
         return s2;
     }
}


