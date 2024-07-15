package OldData.OldMaterial.array;

public class JavaToCpp {
    public static void main(String[] args) {
        String result;



        //result = convertVariable(input);
       // System.out.println("*****Result*****    "+result);
        printVariable();
    }

    public static void printVariable(){
        StringBuilder result= new StringBuilder();
        //String input = "this_is_a_variable";
        String input = "thisIsAVariable";
        char c[] = input.toCharArray();
        if(input.contains("_")) {
            for (int i = 0; i < c.length; i++) {

                if (c[i] == '_') {

                    i++;

                    char chr = Character.toUpperCase(c[i]);

                    result.append(chr);

                } else {

                    result.append(c[i]);

                }

            }
        }else {
            for(int i=0; i< c.length; i++){
                char curr = Character.toUpperCase(c[i]);
                if(curr == c[i]){
                    result.append("_").append(Character.toLowerCase(c[i]));
                }else {
                    result.append(c[i]);
                }
            }

        }

        System.out.println(result.toString());
    }

    public static String convertVariable(String input) {

        StringBuilder result= new StringBuilder();

        if(input.contains("_"))
        {
            String[] arr = input.split("_");
            for (String s : arr) {
                result.append(Character.toString(s.charAt(0)).toUpperCase());
                for (int j = 1; j < s.length(); j++) {

                    result.append(s.charAt(j));
                }
            }
        }
        else
        {
            result.append(Character.toString(input.charAt(0)).toLowerCase());
            for(int i = 1; i< input.length(); i++)
            {
                if(Character.isUpperCase(input.charAt(i)))
                {
                    result.append("_");
                    result.append(Character.toString(input.charAt(i)).toLowerCase());
                }
                else
                {
                    result.append(input.charAt(i));
                }
            }
        }
        return result.toString();

    }
}
