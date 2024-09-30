/***

import java.util.*;
public class selectionsort {
    public static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]<arr[smallest]){
                    smallest = j;
                }

            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
        }

    }
    public static void printarr(int arr[]){
        for(int i = 0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        //printing arr before sorting
        for(int i = 0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionsort(arr);
        printarr(arr);
    }
}
 ***/
import java.util.*;
public class selectionsort {
    public static void selectionsort(int arr[]){
        for(int i = 0 ; i<arr.length-1;i++){
            int smallest = i;
            for(int j = i +1; j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[smallest];
            arr[smallest]= temp;

        }
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5,4,1,3,2};
        selectionsort(arr);
        printarr(arr);
    }
}
