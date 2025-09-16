class Solution {
public:
    int maxArea(vector<int>& height) {
      int lp=0; int rp=height.size()-1;
      int maxw=0;
      while(lp<rp){
        int w=rp-lp;
        int h=min(height[lp],height[rp]);
        int a=w*h;
        maxw=max(maxw,a);
      }
    return maxw;
    }
    
};