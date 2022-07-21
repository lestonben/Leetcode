package Two_Pointers;

public class q04_Container_with_Most_Water {

    public int maxArea(int[] height) {
        if (height.length == 0) { return 0; }

        int res = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            int l = right-left;
            int h = Math.min(height[left], height[right]);
            int area = l*h;
            res = Math.max(res, area);
            if (height[left] <= height[right]) { left++; }
            else { right--; }
        }
        return res;
    }
}
