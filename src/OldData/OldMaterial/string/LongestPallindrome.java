package OldData.OldMaterial.string;

public class LongestPallindrome {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("forgeeksskeegfor");
        int i=0;
        int j= str.length()-1;

        StringBuilder pal=new StringBuilder();
        StringBuilder data=new StringBuilder();
        int max =-1;
        while(i < j){
           if(str.charAt(i) == str.charAt(j)){
               pal.append(str.charAt(i));
           }else {
               max = -1;
               data=new StringBuilder();
           }
            if(data.length() >= max){
                max = pal.length();
                data.append(pal);
                pal = new StringBuilder();
            }
           i++;
           j--;
        }
        System.out.println(data);
    }
}
