class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];

        // Step 1: Count frequency of every character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        // Step 2: Store all possible characters (0 to 255)
        List<Integer> chars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                chars.add(i);
            }
        }

        // Step 3: Sort characters by frequency (descending)
        Collections.sort(chars, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return freq[b] - freq[a];
            }
        });

        // Step 4: Build the final sorted string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.size(); i++) {
            int ch = chars.get(i);
            for (int j = 0; j < freq[ch]; j++) {
                sb.append((char) ch);
            }
        }

        return sb.toString();
    }
}
