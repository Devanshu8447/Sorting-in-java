import java.util.*;
public class bubblesort {
    public static void bubblesortt(int arr[]){
        int n = arr.length;
        int temp ;
        for(int i = 0; i<=n-2;i++) {
            for (int j = 0; j<=n-2-i;j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void printarr(int arr[]){
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2};
        bubblesortt(arr);
        printarr(arr);
    }
}
