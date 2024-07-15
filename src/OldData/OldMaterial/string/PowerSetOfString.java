package OldData.OldMaterial.string;

public class PowerSetOfString {
    public static void main(String[] args) {
        String str = "abc";
        powerSet(str, 0, "");
    }

    public static void powerSet(String str, int i, String currStr){
        if(i==str.length()){
            System.out.println(currStr);
            return;
        }
        powerSet(str, i+1, currStr+str.charAt(i));
        powerSet(str, i+1, currStr);
    }


    /*
    *           abc
    *         a  ""
    *       ab   a b ""
    *    abc  ab ac a
    *
    *
    *
    *
    * */
}
