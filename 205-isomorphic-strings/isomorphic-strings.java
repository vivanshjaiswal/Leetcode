class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If lengths are not equal, they can’t be isomorphic
        if (s.length() != t.length()) return false;
        
        // Create two arrays to store character mappings
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        
        int n = s.length();
        
        // Traverse all characters of both strings
        for (int i = 0; i < n; i++) {
            // If the previous mapping is inconsistent, return false
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            
            // Update mapping: store the index (i + 1)
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        
        // If all mappings are consistent, return true
        return true;
    }
}
