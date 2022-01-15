package array;

public class Rotation {
    public static void main(String ar[]){
        int arr[] = { -1,-100,3,99 };
        rotate(arr, 2);
       // rot(arr, 2);
       // gcd(45,60);
    }
  /*  1, 2, 3, 4, 5, 6, 7
      5, 6, 7, 1, 2, 3, 4

    3 0 5 0 7 0 1

    3 4 5 6 4 2 1*/

    public static void rotate(int[] nums, int k) {
         k = k % nums.length;
        int count=0;
        int j=0;
        for(  ;count< nums.length ; j++){
            int current = j;
            int prev = nums[j];
            do{
                int next = (current + k) %nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            }while(j != current);
        }
        for(int i=0; i< nums.length ; i++){
            System.out.println(""+nums[i]);
        }
    }

    private static int gcd(int a, int b){
       if(b==0){
           return a;
       }else {
         return   gcd(b, a%b);
       }
    }

//1, 2, 3, 4, 5, 6, 7
    //-1,-100,3,99

    public static void rot(int[] nums, int k){

        int l = nums.length;
        k = k % l;
        int count = 0;
        for(int i=0; count<l; i++){
            int prev = nums[i];
            int curr = i;
            do{
                int next = (k+ curr) % l;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                curr = next;
                count ++;
            }while(i !=  curr);
        }
    }

}
