package Queue;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WallGate {
    public static void main(String[] args) {
       int [][] rooms = new int[][] {{2147483647,-1,0,2147483647},
                                        {2147483647,2147483647,2147483647,-1}
                                    ,{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
       wallsAndGates(rooms);
    }
    public static void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        if (m == 0) return;
        int n = rooms[0].length;
        Queue<int[]> dataQ = new LinkedList<>();
        for(int i= 0; i<m; i++){
            for(int j = 0; j< n; j++){
                if(rooms[i][j] == 0)
                dataQ.add(new int[]{i,j});
            }
        }
        List<int[]> DIRECTIONS = Arrays.asList(
                new int[] { 1,  0},
                new int[] {-1,  0},
                new int[] { 0,  1},
                new int[] { 0, -1}
        );
        while (!dataQ.isEmpty()){
            int [] poll = dataQ.poll();
            int pointX = poll[0];
            int pointY = poll[1];
            for (int[] direction : DIRECTIONS){
                int x = direction[0] + pointX;
                int y = direction[1] + pointY;
                if(x < 0 || y < 0 || x >= m || y >= n || rooms[x][y] != Integer.MAX_VALUE){
                    continue;
                }
                rooms[x][y] = rooms[pointX][pointY] + 1;
                dataQ.add(new int[]{x, y});
            }
        }
        for (int i=0 ;i<rooms.length; i++){
            for(int j = 0; j< rooms[0].length; j++){
                System.out.print(rooms[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

}
