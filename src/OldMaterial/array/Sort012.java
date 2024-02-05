package OldMaterial.array;

public class Sort012 {
    public static void main(String ar[]){

        int[]a = {0, 2, 1, 2, 0};
        int low=0, mid = 0,high = a.length-1;
        while(mid<high){
            switch(a[mid]){
                case 0:

                    a[low] = a[low]+ a[mid];

                    a[mid] = a[low] - a[mid];

                    a[low] = a[low] - a[mid];

                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:

                    a[high] = a[high]+a[mid];
                    a[mid] = a[high] - a[mid];
                    a[high] = a[high] - a[mid];
                    high--;
                    break;
            }
        }
        for(int i =0; i< a.length ;i++){
            System.out.println(" "+a[i]);
        }
    }
}
