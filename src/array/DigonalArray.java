package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DigonalArray {
    public static void main(String ar[]){
        int[][] elements = {
                { 1, 2,  3, 4},
                { 5, 6,  7,  8},
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
              /*  { 1,2,3 },
                { 4,5,6 },
                { 7,8,9 }*/
               // {2,3}
             /*   {3},
                {2}*/
        };
        findDiagonalOrder(elements);
    }
    public static int[] findDiagonalOrder(int[][] matrix) {
        List<Integer> interMediate = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int [] result = new int[row*col];
        int k=0;
        for(int d=0; d<(row+col)-1;d++){
            interMediate.clear();

            int r = d < col ? 0: (d-col)+1;
            int c = d < col ? d : col-1;
            while (r < row && c > -1){
                interMediate.add(matrix[r][c]) ;
                r++;
                c --;
            }
            if(d%2 == 0) {
                Collections.reverse(interMediate);
            }
            for (int i = 0; i < interMediate.size(); i++) {
                result[k++] = interMediate.get(i);
            }
        }
        return result;
    }

    public static int[] ex(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int arr[]= new int[row*col];
        System.out.println(" row :"+row);
        System.out.println(" col :"+col);
        System.out.println(" arr :"+arr.length);
        int index =0;

        if(mat == null || mat.length ==0){
            return new int[0];
        }
        if(row < col){
            return mat[0];
        }
        if(row > col){
            for(int i=0 ;i< row;i++){
               arr[i] = mat[i][0];
            }
            return arr;
        }
        for(int i= 0;i<(row+col)-1 ;i++){
            if(i < row){
                int y= i;
                for(int j=0; j<=i;j++){
                    if(i%2 == 0){
                        arr [index]= mat[y][j];
                    }else{
                        arr [index]= mat[j][y];
                    }
                    y--;
                    index++;

                }

            }else{
                int y = (i-row)+1;
                for(int j=row-1; j>i-row;j--){
                    if(i%2 == 0){
                        arr [index]= mat[j][y];
                    }else{
                        arr [index]= mat[y][j];
                    }
                    y++;
                    index++;
                }
            }
        }
        for(int i=0 ;i< arr.length;i++){
            System.out.println(" Final :"+arr[i]);
        }
        return arr;
    }
}
