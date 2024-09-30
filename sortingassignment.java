public class sortingassignment {
    public static void bubblesortdescending(int arr[]){
        for (int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if (arr[j]<arr[j+1]){
                    //swap
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }

    }

    public static void selectionsortdescending(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int max = i;
            for(int j = i+1;j<arr.length;j++){

                if(arr[j]>arr[max]){
                    max=j;
                }
                int temp= arr[i];
                arr[i]=arr[max];
                arr[max]=temp;

                //arr[i]=arr[i]+arr[max];
                //arr[max]=arr[i]-arr[max];
                //arr[i]=arr[i]-arr[max];
            }

        }
    }
    public static void insertionsortingdescending(int arr[]){
        for (int i = 1;i<arr.length;i++){
            int curr= arr[i];
            int prev = i-1;
            //finding out the correct position to inset
            while(prev>=0&&arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void printarr(int arr[]){
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,3,5};
        bubblesortdescending(arr);
         printarr(arr);
         selectionsortdescending(arr);
        System.out.println();
        printarr(arr);
        System.out.println();
        printarr(arr);

    }
}
