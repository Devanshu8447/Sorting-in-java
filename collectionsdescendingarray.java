import java.util.Arrays;
import java.util.*;
public class collectionsdescendingarray {
    public static void printarr(Integer arr[]){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Integer arr[] = {1,5,4,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printarr(arr);
    }
}
