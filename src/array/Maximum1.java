package array;

public class Maximum1 {
    public static void main(String arg[]){
        int mat[][] = { { 0, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 1 } };



        System.out.println("Index of row with maximum 1s is "
                + rowWithMax1s(mat));
    }









    static int R = 4, C = 4;
    // Function to find the index of first index
    // of 1 in a boolean array arr[]
   private static int rowWithMax1s(int arr[][]){
       int row = 0;
       int m,n;
           m=n=4;
        int  max_index =-1, index ;
           for(int i=0; i<m;i++){
               index = binarySearchFor1(arr[i],0,n-1);
               if(index!=-1 && n-index > max_index){
                   row = i;
                   max_index = n-index;
               }
           }
       return row;
   }

   private static int binarySearchFor1(int arr[], int low, int high){
       if(low<high){
           int mid = low+(high-low)/2;
           if((mid==0 || arr[mid-1]==0) && arr[mid]==1){
               return mid;
           }else if(arr[mid]==1){
              return binarySearchFor1(arr,low,mid-1);
           }else {
              return binarySearchFor1(arr,mid+1,high);
           }
       }
       return -1;
   }





}
