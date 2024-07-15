package OldData.OldMaterial.array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        if(numRows == 0){
            return list;
        }
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for(int row=1;row<=numRows; row++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int p=1; p<row;p++){
                    int first = list.get(row-1).get(p-1);
                    int sec = list.get(row-1).get(p);
                    curr.add(first+sec);
            }
            curr.add(1);
            list.add(curr);
        }
        new BigInteger("",2);
        return list;
    }
}
