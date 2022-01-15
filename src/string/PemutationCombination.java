package string;

public class PemutationCombination {
    public static void main(String[] args) {
        String a = "abc";
        permute(a, 0, a.length()-1);
    }

    /*
    *                  A  B   C
    *
    *          A B C       B A C   C B A
    *
    *       A B C, A C B   B A C, B C A    C B A, C A B
    *
    *
    *
    * */


    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
