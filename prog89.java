public class prog89 {
    public static String printSequence(String str[], String input){
        int n = input.length();
        String output = "";
        for(int i = 0; i < n; i++){
            char ch = input.charAt(i);
            if(ch == ' '){
                output = output + '0';
            }
            else{
                int pos = ch - 'A';
                output = output + str[pos];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String str[]
            = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
 
        String input = "GEEKSFORGEEKS";
        System.out.println(printSequence(str, input));
    }
}
