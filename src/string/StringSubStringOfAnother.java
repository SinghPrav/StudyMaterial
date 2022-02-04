package string;

import java.util.HashSet;
import java.util.TreeMap;

public class StringSubStringOfAnother {
    public static void main(String[] args) {
        String s1 ="practice";
        String s2 = "geeksforgeeks";
        search(s1, s2);
    }

    public static void search(String s1, String s2){
        int high = s2.length();
        int low = 0;
        int count = s1.length();
        int index =-1;
        TreeMap<String, Integer> map = new TreeMap<>();
        while (count < high){
            map.put(s2.substring(low ,count++), low);
            low++;
        }

        if(map.containsKey(s1)){
            index = map.get(s1);
        }
        System.out.println("Substring index-> "+index);
    }
}
