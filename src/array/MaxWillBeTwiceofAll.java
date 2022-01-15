package array;

public class MaxWillBeTwiceofAll {

    public static void main(String ar[]){
       int i= test();
    }

    public static int test(){
        int[]nums = {3,6,1,0};
        if(nums.length == 1){
            return 0;
        }
        int index = 0;
        int max = nums[0], max1= nums[1];
        if(max > max1){
            int temp = max1;
            max1 = max;
            max = temp;
            index = 1;

        }


        for(int i=2;i< nums.length;i++){
            int temp;
            if(nums[i] > max1){
                temp = max1;
                max1 = nums[i];
                max = temp;
                index = i;
            }else if(max < nums[i] && max!= max1){
                max = nums[i];
            }
        }

        System.out.println("First: "+max1+" and Second :"+max);
        if(max == 0){
            return index;
        }else if( max1/max >= 2){
            return index;
        }

        return -1;
    }
}
