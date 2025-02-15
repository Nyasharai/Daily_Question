// G=4
// m=3
// n= 2 3 2 1
// output-> 3 TRAINING
import java.util.*;

public class prog25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        int m = sc.nextInt();
        int currentPassenger = 0;
        int overCrowding = 0;

        for(int i = 0; i < group; i++){
            int groupSize = sc.nextInt();//{2, 3, 2, 1}
            currentPassenger += groupSize;

            if(currentPassenger > m){
                overCrowding++;
            }
        }
        System.out.println(overCrowding);
    }
}