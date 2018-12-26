package com.basedemo;

public class QuickSort {
    public static void main(String[] args) {
        int a[]={4,2,8,6,1,9};
        quick(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static int getMiddle(int[] a, int low,int high)
    {
        int flag = a[low]; //数组的第一个元素作为中轴
        while(low < high){
            while(low < high && a[high] >= flag){
                System.out.println(a[high]);
                high--;
            }
            a[low] = a[high];//比中轴小的记录移到低端
            while(low < high && a[low] <= flag){
                System.out.println(a[low]);
                low++;
            }
            a[high] = a[low] ; //比中轴大的记录移到高端
        }
        a[low] = flag ; //中轴记录到尾
        return low ; // 返回中轴的位置
    }

    public static void quickSort(int[] a,int low,int high){
        if(low < high) {
            int middle = getMiddle(a,low,high); //将a数组进行一分为二
            quickSort(a, low, middle-1);   //对低字段表进行递归排序
            quickSort(a, middle+1, high); //对高字段表进行递归排序
        }

    }

    public static void quick(int[] a) {
        if(a.length > 0){   //查看数组是否为空
            quickSort(a, 0, a.length-1);
        }
    }
}
