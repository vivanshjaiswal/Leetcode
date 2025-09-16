class Solution {
public:
    int maxArea(vector<int>& height) {
        int width=0;
       int maxarea=0;
        for(int i=0;i<size.height();i++){
            for(int j=i+1;j<size.height();j++){
width=j-i;
height=min(height[i],height[j]);
maxarea=width*height;
            }
        }
        return maxarea;
    }
};