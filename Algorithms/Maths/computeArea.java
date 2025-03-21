/**
Given the coordinates of two rectilinear rectangles in a 2D plane, return the total area covered by the two rectangles.

The first rectangle is defined by its bottom-left corner (ax1, ay1) and its top-right corner (ax2, ay2).

The second rectangle is defined by its bottom-left corner (bx1, by1) and its top-right corner (bx2, by2).

Example 1:

Rectangle Area
Input: ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
Output: 45
 */
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //Areas of rectangle
        int rect1 = (ax2-ax1)*(ay2-ay1);
        int rect2 = (bx2-bx1)*(by2-by1);
        //Intersection
        int intrx1 = Math.max(ax1,bx1);
        int intrx2 = Math.min(ax2,bx2);
        int intry1 = Math.max(ay1,by1);
        int intry2 = Math.min(ay2,by2);
        //Area of Intersection 
        int intrarea = 0;
        if (intrx2 > intrx1 && intry2 > intry1) {
            intrarea = (intrx2 - intrx1) * (intry2 - intry1);
        }
        int totalArea = rect1 + rect2 - intrarea;
        return totalArea;
    }
}