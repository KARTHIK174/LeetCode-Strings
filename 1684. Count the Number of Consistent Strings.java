class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] s = new boolean[26];
        for (char c : allowed.toCharArray()) {
            s[c - 'a'] = true;
        }
        int ans = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!s[word.charAt(i) - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                ans++;
            }
        }
        return ans;
    }
}
