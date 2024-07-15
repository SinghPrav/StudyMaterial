package OldData.OldMaterial.string;

public class ReverseRecursivly {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        ReverseRecursivly reverseRecursivly = new ReverseRecursivly();
        reverseRecursivly.reverse(str);
    }
    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1)) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
}
