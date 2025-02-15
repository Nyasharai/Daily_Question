import java.util.*;
public class prog94GOOGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        // ArrayList<Integer> newa = new ArrayList<>();
        for(int i = 0; i < Q; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n == 0){
                a.add(m);
                // newa.add(m);
            }
            else if( n == 1){
                for(int j = 0; j < a.size(); j++){
                    a.set(j, a.get(j) ^ m);
                }
            }
        }
        Collections.sort(a);
        // for (int num : a) {
        //     System.out.print(num + " ");
        // }
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + " ");
        }
    }
}
