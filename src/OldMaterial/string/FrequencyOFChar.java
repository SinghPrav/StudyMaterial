package OldMaterial.string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOFChar {
    public static void main(String[] args) {
        String input = "ashishgupta";
        //a2g1h2i1p1s2t1u1
        String result = getFrequency(input);
        System.out.println(result);

    }

    public static String getFrequency(String input){
        StringBuilder result =new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i< input.length();i++){
            char ch = input.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }

        for(int i=0;i< input.length();i++){
            if(map.get(input.charAt(i)) != 0){
                result.append(input.charAt(i)).append(map.get(input.charAt(i)));
                map.put(input.charAt(i), 0);
            }
        }
        return result.toString();
    }
}
