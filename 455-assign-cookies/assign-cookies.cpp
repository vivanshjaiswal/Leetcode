class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int i =0;
        int j=0;
        int count=0;
        sort(s.begin(),s.end());
        sort(g.begin(),g.end());
        while(j<s.size() && i<g.size()){
if(s[j] >= g[i]){
    count++;
    i++;
    j++;
}
else{
    j++;
}
        }
    return count;}
};