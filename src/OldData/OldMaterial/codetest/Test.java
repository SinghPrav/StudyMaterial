package OldData.OldMaterial.codetest;

public class Test  extends Pojo{
    public static void main(String ar[]){
        String str ="1.3.4";



                String [] splitVersion = str.split("\\.");
                if(splitVersion[0] != null) {
                   System.out.println(Integer.parseInt(splitVersion[0]));
                }



    }
}
