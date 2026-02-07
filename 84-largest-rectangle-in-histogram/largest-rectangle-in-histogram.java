class Solution {
    public int largestRectangleArea(int[] heights) {
        int Area=0;
        //next smaller left
        Stack<Integer>s=new Stack<>();
        int nsl[]=new int [heights.length];
        
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
        s.push(i);
        }
        //next smaller in right
        int nsr[]=new int [heights.length];
        s=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=heights.length;
            }
            else{
                nsr[i]=s.peek();
            }
        s.push(i);
        }
        //currArea
        for(int i=0;i<heights.length;i++){
            int width=nsr[i]-nsl[i]-1;
            int height=heights[i];
            int currArea=width*height;
            Area=Math.max(Area,currArea);
        }

   
   return Area; }
}