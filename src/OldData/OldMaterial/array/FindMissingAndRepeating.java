package OldData.OldMaterial.array;

import java.util.HashMap;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        HashMap<Integer,Boolean> map = new HashMap<>();

        for (int j : arr) {
            if (map.get(j) == null) {
                map.put(j, true);
            } else {
                System.out.println("Repeating : " + j);
            }
        }

        for(int i=1;i<=arr.length;i++){
            if(map.get(i) == null) {
                System.out.println("Missing : "+i);
            }
        }
    }
}
