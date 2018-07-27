package com.basedemo;

/**
 * 选择排序
 * 思路：
 * 1)从序列的第一个开始，后面的元素依次和第一个元素比较，交换较小的元素放在第一个位置，
 * 直到序列的最后一个元素比较完，就确定了序列的最小项
 * 2)接着从序列的第二个元素开始，重复上边步骤,
 * 直到序列只剩下一个元素为止(最后一个元素不需要比较，因为倒数第二个为止的确认就已经说明了其大于倒数第二个元素)
 * 一共比较n -1趟，每趟比较n-1-i次（i为趟的下标）
*/
public class SelectionSort {
    public static void main(String[] args) {
        int a[]={5,3,6,2,10};
        SelectionSort s = new SelectionSort();
        s.selectionSortTest(a);
        for (int i: a) {
            System.out.print(i+" ");
        }

    }
    public void selectionSortTest(int a[]){
        if (a==null||a.length<=0){
            return;
        }
        for(int i = 0; i < a.length -1; i++)//比n-1趟
            for(int j = i+1; j < a.length; j++){
                //每次选择排序都从选定的元素的后一个开始，与选定元素选择排序
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
    }
}
