public class q12_Trapping_Rain_Water {

    public int trap(int[] height) {
        if (height.length == 0) { return 0; }

        int left = 0, right = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                }
                else {
                    totalWater += maxLeft-height[left];
                }
                left++;
            }
            else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                }
                else {
                    totalWater += maxRight-height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}
