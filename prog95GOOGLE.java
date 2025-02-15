import java.util.*;
public class prog95GOOGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = x ^ y;
        int c = 0;
        while(r > 0){
            c += r & 1;
            r >>= 1;
        }
    System.out.print(c);
    }
}
