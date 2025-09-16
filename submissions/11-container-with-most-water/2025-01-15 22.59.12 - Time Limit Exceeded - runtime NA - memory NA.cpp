class Solution {
public:
    int maxArea(vector<int>& height) {
       int maxwater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
int w=j-i;
int h=min(height[i],height[j]);
int area=w*h;
maxwater=max(maxwater,area);
            }
        }
        return maxwater;
    }
};