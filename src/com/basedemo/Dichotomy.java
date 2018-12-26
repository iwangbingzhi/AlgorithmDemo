package com.basedemo;

import java.util.Scanner;

/*
二分法查找元素
*/
public class Dichotomy {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 7, 9, 10, 15, 18, 20};
        Dichotomy d = new Dichotomy();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的数字：");
        int item = sc.nextInt();
        int a = d.binary_search(list, item);
        System.out.println(a);
    }

    public int binary_search(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            //猜的数字大了
            if (guess > item) {
                high = mid - 1;
            } else {
                //猜的数字小了
                low = mid + 1;
            }
        }
        return -1;
    }

}



