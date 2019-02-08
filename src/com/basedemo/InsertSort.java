package com.basedemo;


public class InsertSort {
    public static void main(String[] args) {
        int[] a = {5,2,4,6,1,3};
        long start = System.nanoTime();
        insertDemo(a);
        long end = System.nanoTime();
        for (int b:a) {
            System.out.print(b+" ");
        }
        long times = end - start;
        System.out.println(" ");
        System.out.println("开始时间="+start);
        System.out.println("结束时间="+end);
        System.out.println("插入排序运行时间= " + times + "纳秒");
    }

    public static void insertDemo(int[] a){
        int temp,j;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i - 1;
            while(temp < a[j]){
                a[j+1] = a[j];
                if (j-- == 0) {
                    break;
                }
            }
            a[j+1] = temp;
        }
    }
}
