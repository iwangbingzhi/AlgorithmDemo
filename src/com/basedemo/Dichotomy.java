package com.basedemo;

import java.util.Scanner;

/*
二分法查找元素
*/
public class Dichotomy {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 7, 9, 10, 15, 18, 20};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的数字：");
        int item = sc.nextInt();
        int a = binary_search(list, item);
        System.out.println("查找的数字在数组的第"+a+"个位置");
    }

    /**
     * @Description:
     * @param: [list, item]
     * @return: int
     */
    public static int binary_search(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;
        while(low <= high) {
            //如果是int类型的时候，在low和height很大的时候，low+high数值很大可能会得到负数，防止溢出
            int mid = low + ((high - low) / 2);
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            //中位数比要查找的数字大
            if (guess > item) {
                high = mid - 1;
            }else {
                //中位数比要查找的数字小
                low = mid + 1;
            }
        }
        return -1;
    }

}



