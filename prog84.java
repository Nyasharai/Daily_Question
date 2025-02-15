// combination sum
import java.util.*;
public class prog84 {
    public static void sumCombination(int target,ArrayList <Integer> arr,ArrayList <Integer> temp,int j){
        if(target == 0){
            for(int i = 0; i < temp.size(); i++){
                System.out.print(temp.get(i)+ " ");
                
            }
            System.out.println();
            return;
        }
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = j; i < arr.size(); i++){
            if(target - arr.get(i) >= 0){
                temp.add(arr.get(i));
                sumCombination(target - arr.get(i),arr,temp,i);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 6, 7));
        sumCombination(target, arr,new ArrayList<>(),0);
    }
}
