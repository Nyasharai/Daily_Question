//catalan number
import java.util.*;
public class prog72 {
    public static int catalan(int n){
        if(n==0||n==1){
            return 1;
        }
        int sum = 0;
        for(int i = 0; i <= n-1;i++){
            sum += catalan(i) * catalan(n-i-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.print(catalan(n));
    }
}
