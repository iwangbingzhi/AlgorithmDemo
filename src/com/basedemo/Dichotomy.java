package com.basedemo;

public class Dichotomy {
    public static void main(String[] args) {
        int[] list = {1,3,5,7,9};
        Dichotomy d = new Dichotomy();
        int a = d.binary_search(list,1);
        System.out.println(a);
    }
    public int binary_search(int[] list,int item){
        int low = 0;
        int high = list.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            int guess = list[mid];
            if (guess == item){
                return mid;
            }
            if (guess>item){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
}
