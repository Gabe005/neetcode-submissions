class Solution {
    public int maxArea(int[] heights) {
        int currentMax = 0;
        int trueMax = 0;

        int start = 0;
        int end = heights.length - 1;

        while(start < end){
            currentMax = Math.min(heights[start], heights[end]) * (end - start);
            if(trueMax < currentMax)
                trueMax = currentMax;
            if(heights[start] <= heights[end])
                start++;
            else if(heights[start] > heights[end])
                end--;
        }

        return trueMax;

    }
}
