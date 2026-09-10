class Solution {
    public int maxVowels(String s, int k) {
        int mx = 0, cur = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                cur++;
            }
        }
        mx = cur;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                cur--;
            }
            if (isVowel(s.charAt(i))) {
                cur++;
            }
            mx = Math.max(mx, cur);
        }

        return mx;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
