package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveConcateUncommon {
    public static void main(String[] args) {
        String s1 = "aacdb";
        String s2 = "gafd";
        //cbgf
        System.out.println(concatenatedString(s1, s2));
    }

    public static String concatenatedString(String s1, String s2){
        String result="";

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }else {
                map.put(s1.charAt(i), 1);
            }
        }

        for (int j=0;j<s2.length();j++){
            if(map.containsKey(s2.charAt(j))){
                map.put(s2.charAt(j), map.get(s2.charAt(j))+1);
            }else {
                map.put(s2.charAt(j), 1);
            }
        }

        for (Map.Entry<Character, Integer> data : map.entrySet()) {
            char key = data.getKey();
            int val = data.getValue();
            if(val == 1){
                System.out.println("Key->" + key + "-- value-> " + val);
                result+=key;
            }
        }
        return result;
    }
}
