package OldMaterial.framwork;

import java.util.HashMap;
import java.util.Objects;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Object, Integer> hashMap = new HashMap<>();
        int sizeOfBucket = 16;
        int hasCode = new Key("vishal").hashCode();
        System.out.println("Hashcode:"+hasCode);
        int indexValue = hasCode&(sizeOfBucket-1);
        System.out.println("Index value:"+indexValue);

        hashMap.put(new Key("vishal"), 20);




    }
    static class Key{
        String key;

        public Key(String key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key1 = (Key) o;
            return Objects.equals(key, key1.key);
        }

        @Override
        public int hashCode() {
            return (int)key.charAt(0);
        }
    }
}
