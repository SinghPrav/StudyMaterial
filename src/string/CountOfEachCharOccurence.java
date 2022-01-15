package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountOfEachCharOccurence {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        Map<Character, Integer> map = new HashMap<>();
        int n = str.length();
        for (int i=0;i< n;i++){
            if(map.containsKey(str.charAt(i))){
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            int value = ((int)mapElement.getValue());
            Character key = ((Character)mapElement.getKey());
            System.out.println(key+"========="+value);

        }

    }
}
