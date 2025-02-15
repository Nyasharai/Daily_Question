import java.util.*;
public class prog78 {
    public static String cal(String arr[], String input){
        int n = input.length();
        String output = "";
        for(int i = 0; i < n; i++){
            if(input.charAt(i) == ' '){
                output += "0";
            }
            else{
                int position = input.charAt(i) - 'A';
                output += arr[position];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String arr[] ={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        System.out.print(cal(arr, input));
    }//4333355777733366677743333557777
}
