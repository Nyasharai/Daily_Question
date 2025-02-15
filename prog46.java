import java.util.*;
public class prog46 {
    public static int fibo(int n, int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fibo(n-1, f) + fibo(n-2,f);
        return f[n];
    }
    public static void main(String args[]){
        int n = 6;
        int f[] = new int[n+1];
        System.out.print(fibo(n, f));
    }
}

/*
1. recursion
2. storage (array)

1. iteration
 */
