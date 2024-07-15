package OldData.OldMaterial.array;

public class Twosum {
    public static void main(String[] args) {
        int numbers[] ={2,7,11,15};
        int target = 9;
        int low = 0;
        int high = numbers.length-1;
        int a[] = new int[2];
        a[0]= -1;
        a[1]=-1;
        while(low< high){
            int sum = numbers[high]+numbers[low];
            if(sum ==target){
                a[0]= low+1;
                a[1] =high+1;
                break;
            }else if(sum < target){
                ++ low;
            }else
            {
                --high;
            }
        }

        for (int i=0;i<a.length;i++){
            System.out.println("---"+a[i]);
        }
    }
}
