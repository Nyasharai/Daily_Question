// bit manipulation

// get bit - AND function used
// set bit - OR function used(0->1)
// clear bit - AND with NOT bitmask(1->0)
// update bit =
import java.util.*;

public class prog20 {
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int num = bitMask | n;
        System.out.println(num);
        
    }
}


