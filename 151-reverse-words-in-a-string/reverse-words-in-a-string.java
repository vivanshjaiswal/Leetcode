class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        String word = "";
        List<String> words = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.isEmpty()) { 
                    words.add(word);
                    word = "";
                }
            }
        }

        if (!word.isEmpty()) {
            words.add(word);
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            reversed.append(words.get(i));
            if (i != 0) reversed.append(" ");
        }

        return reversed.toString();
    }
}
