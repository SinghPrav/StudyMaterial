package OldData.OldMaterial.string;

public class RotationOfEachOther {
    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }

    public static boolean areRotations(String str1, String str2){
        //AACDAACD
        String out = str1+str1;
        if(str1.length() == str2.length()){
            return out.contains(str2);
        }
        return false;
    }
}
