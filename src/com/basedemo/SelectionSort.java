package com.basedemo;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={4,6,2,1};

        selectionSortTest(a);
        for (int i: a) {
            System.out.print(i+" ");
        }
    }
    public static void selectionSortTest(int a[]){
        for(int i = 0; i < a.length -1; i++) {   //比n-1趟
            int k = i;
            for (int j = k+1; j < a.length; j++) {
                //每次选择排序都从确定的最小的元素的后一个元素开始，与选定元素选择排序
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if(i!=k){
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
    }
}
