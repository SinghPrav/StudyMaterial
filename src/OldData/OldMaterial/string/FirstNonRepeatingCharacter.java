package OldData.OldMaterial.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    static final int NO_OF_CHARS = 256;

    static HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(NO_OF_CHARS);
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int index = firstNonRepeating(str);

        System.out.println(
                index == Integer.MAX_VALUE
                        ? "Either all characters are repeating "
                        + " or OldData.OldMaterial.string is empty"
                        : "First non-repeating character is "
                        + str.charAt(index));
    }
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int result = Integer.MAX_VALUE, i;
        for (Map.Entry<Character, CountIndex> entry : hm.entrySet())
        {
            int c=entry.getValue().count;
            int ind=entry.getValue().index;
            if(c==1 && ind < result)
            {
                result=ind;
            }
        }


        return result;
    }

    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            // If character already occurred,
            if (hm.containsKey(str.charAt(i))) {
                // updating count
                hm.get(str.charAt(i)).incCount();
            }

            // If it's first occurrence, then store
            // the index and count = 1
            else {
                hm.put(str.charAt(i), new CountIndex(i));
            }
        }
    }

   static class CountIndex {
        int count, index;

        // constructor for first occurrence
        public CountIndex(int index)
        {
            this.count = 1;
            this.index = index;
        }

        // method for updating count
        public void incCount()
        {
            this.count++;
        }
    }
}
