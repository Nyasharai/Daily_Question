// Trapped rain water
public class prog11 {
    public static int trappedWater(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        

        int trappedWaterValue = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWaterValue += waterLevel - arr[i];
        }
        return trappedWaterValue;
        
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        System.out.print(trappedWater(arr));
    }
}
