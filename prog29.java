import java.util.*;

public class prog29 {
    public static int gridWay(int x, int y, int n, int m){
        if(x == n-1 && y == m-1){
            return 1;
        }
        else if(x == n || y == n){
            return 0;
        }
        int w1 = gridWay(x+1, y, n, m);
        int w2 = gridWay(x, y+1, n, m);
        return w1 + w2;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 3, m = 3;
        System.out.println(gridWay(0,0,n,m));
    }
}