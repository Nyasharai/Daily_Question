import java.util.*;

public class prog25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt(); //4
        int m = sc.nextInt();  //3
        int arr[] = {2, 3, 2, 1};
        int overCrowding = 0;
        int sum = 0;
        for(int i = 0; i < group; i++){
            if(sum+arr[i] > m){
                overCrowding++;
                sum = arr[i];
            }
            else{
                sum += arr[i];
            }
        }
        if(sum > 0){
            overCrowding++;
        }
        System.out.println(overCrowding);
    }
}