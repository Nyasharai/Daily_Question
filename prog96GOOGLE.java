import java.util.*;

public class prog96GOOGLE {
    public static void countHashMap(int arr[]) {
        if (arr.length <= 1) {
            return;
        }

        // Step 1: Count the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Get the unique numbers and sort them
        List<Integer> uniqueNumbers = new ArrayList<>(map.keySet());
        Collections.sort(uniqueNumbers);

        // Step 3: Reconstruct the sorted array based on frequency
        int index = 0;
        for (int num : uniqueNumbers) {
            int count = map.get(num);
            for (int j = 0; j < count; j++) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 7, 5, 6, 6, 6, 9, 3};
        countHashMap(arr);
        System.out.println(Arrays.toString(arr)); // Output the sorted array
    }
}