package OldData.OldMaterial.string;

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

        Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            int value = itr.next().getValue();
            Character key = itr.next().getKey();
            System.out.println(key+"========="+value);
        }

    }
}
