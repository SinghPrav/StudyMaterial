package OldMaterial.string;

import java.util.Arrays;

public class LongestCommonPref {
    public static void main(String[] args) {
        String [] data = {"floweer","flow","flight"};
      // System.out.println(longestCommonPrefix(data));
        int[] nums ={1,3};
        Arrays.sort(nums);
       System.out.println(longestCommonPrefixBinary(data));
    }
    /*
    Binary search

     */

    public static String longestCommonPrefixBinary(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());
        int low = 0;
        int high = minLen;
        while (low < high) {
            int middle =low+ ( high - low) / 2;
            if (isCommonPrefix(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private static boolean isCommonPrefix(String[] strs, int len){
        String str1 = strs[0].substring(0,len);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(str1))
                return false;
        return true;
    }






    /*
    Divide and conquer approach
     */

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0 , strs.length - 1);
    }

    private static String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = (l + r)/2;
            System.out.println("---L---"+l+" ---R--"+r+"-----Mid---"+mid);
            String lcpLeft =   longestCommonPrefix(strs, l , mid);
            System.out.println("---Left---"+lcpLeft);
            System.out.println("afterLeft---L---"+l+" ---R--"+r+"-----Mid---"+mid);
            String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
            System.out.println("---Right---"+lcpRight);
            System.out.println("After Right---L---"+l+" ---R--"+r+"-----Mid---"+mid);

            System.out.println("---Result---"+commonPrefix(lcpLeft, lcpRight));
            System.out.println(" result---L---"+l+" ---R--"+r+"-----Mid---"+mid);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

   static String commonPrefix(String left,String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) )
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }
}
