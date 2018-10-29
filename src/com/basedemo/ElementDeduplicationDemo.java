package com.basedemo;

import java.util.Arrays;
/**
 * @Title: ElementDeduplicationDemo.java
 * @Description:元素去重问题，使用左右下标(l,r)移动的方式来判断重复的元素 总时间O(nlogn)
 * @Author 王炳智
 */
public class ElementDeduplicationDemo {
    public static void main(String[] args) {
        int a[] = {7, 7, 6, 2, 3, 9};
        Arrays.sort(a);
        ElementDeduplicationDemo ed = new ElementDeduplicationDemo();
        ed.ElementDeduplication3(a);
    }

    //控制左下标l  O(n)
    public void ElementDeduplication1(int a[]) {
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
    public void ElementDeduplication2(int a[]) {
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
    //上述两种算法都要进行两次小于a.length的判断，增加了计算时间

    //右下标的控制  该方法只需要进行一次a.length的判断  O(n)
    public void ElementDeduplication3(int a[]) {
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
        左下标是否到达末尾并未判断，当右下标到达末尾时，左下标处于末尾前一位，
        这时候循环已经结束，所以需要下面语句输出最后一段元素和差值
        */
        if(a.length > 0){
            System.out.println("元素=" + a[l]);
            int c = r - l;
            System.out.println("该元素个数=" + c);
        }
    }
}

