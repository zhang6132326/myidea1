package com.zxf.strategy;
public class Sorter<T> {
      public  void sort(T[] arr,Comparator<T> comparable){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                minPos=comparable.compare();
            }
            swap(arr,i,minPos);
        }
    }
    void swap(T[]arr,int i,int j){
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}