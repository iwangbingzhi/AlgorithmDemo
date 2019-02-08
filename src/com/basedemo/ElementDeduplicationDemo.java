package com.basedemo;

import java.util.*;

/**
 * @Title: ElementDeduplicationDemo.java
 * @Description:元素去重问题，使用左右下标(l,r)移动的方式来判断重复的元素 总时间O(nlogn)
 * 先进行排序预处理
 * @Author 王炳智
 */
public class ElementDeduplicationDemo {
    public static void main(String[] args) {
        int a[] = {7,7,6,2,9,9,3,9};
        Arrays.sort(a);
        int b[] = {7,9,3,9,2,1,7,2};
        paixun2(b);

     /*   Set<Integer> setb = new HashSet<Integer>();
        for (int i = 0; i < b.length; i++) {
            setb.add(b[i]);
        }
        System.out.println(setb);*/
    }
    public static void paixun2(int[] b){
        for (int i = 0; i < b.length-1; i++) {
            for (int j = 0; j <b.length-1-i ; j++) {
                if (b[j]<b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }

            }
        }
    }


    //控制左下标l  O(n)
    public static void ElementDeduplication1(int a[]) {
        int l = 0;
        int r;
        while (l < a.length) {
            for (r = l + 1; r < a.length; r++) {
                if (a[r] != a[l]) {
                    break;
                }
            }
            System.out.println("元素=" + a[l]);
            int c = r - l;
            System.out.println("该元素个数=" + c);
            l = r;
        }
    }

    //控制左下标l  O(n)
    public static void ElementDeduplication2(int a[]) {
        int l, r;
        for (l = 0; l < a.length; l = r) {
            for (r = l + 1; r < a.length; r++) {
                if (a[r] != a[l]) {
                    break;
                }
            }
            System.out.println("元素=" + a[l]);
            int c = r - l;
            System.out.println("该元素个数=" + c);
            l = r;
        }
    }


    /*
    *上述两种算法都要进行两次小于a.length的判断，增加了计算成本
    * 右下标的控制  该方法只需要进行一次a.length的判断  O(n)
    * */
    public static void ElementDeduplication3(int a[]) {
        int l = 0;
        int r;
        for (r=0; r <a.length; r++) {
            if (a[r]!=a[l]){
                System.out.println("元素=" + a[l]);
                int c = r - l;
                System.out.println("该元素个数=" + c);
                l = r;
            }
        }
        /*
        因为该方法只判断了右下标是否达到了末尾，
        左下标是否到达末尾并未判断，当右下标到达末尾时，
        左下标处于末尾前一位(最后几位元素不重复的情况下)，
        如果最后几位元素重复的情况，此时l处于重复元素的第一位，r处于末尾(如图一的倒数第二步)
        这时候循环已经结束，所以需要下面语句输出最后一段元素和差值
        */
        if(a.length > 0){
            System.out.println("元素=" + a[l]);
            int c = r - l;
            System.out.println("该元素个数=" + c);
        }
    }
}

