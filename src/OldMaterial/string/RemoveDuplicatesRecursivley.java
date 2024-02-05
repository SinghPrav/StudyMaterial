package OldMaterial.string;

public class RemoveDuplicatesRecursivley {
    public static void main(String[] args) {
        String str = "azxxzy";
        System.out.println(remove(str));
    }

    public static String remove(String str){
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;
        for(char character : str.toCharArray()) {
            if (sbLength != 0 && character == sb.charAt(sbLength - 1))
                sb.deleteCharAt(sbLength-- - 1);
            else {
                sb.append(character);
                sbLength++;
            }
        }
        return sb.toString();

    }


}
