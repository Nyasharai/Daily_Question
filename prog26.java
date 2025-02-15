// Josephus problem TRAINING
import java.util.*;

public class prog26 {
    public static int josephus(int n, int k){
        if(n == 1){
            return 1;
        }
        return (josephus(n-1, k)+k-1)%n+1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(josephus(7, 3));
    }
}