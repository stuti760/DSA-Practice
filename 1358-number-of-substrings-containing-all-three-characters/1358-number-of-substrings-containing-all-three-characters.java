import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0;
        int ans = 0;
        int n = s.length();
        Map<Character, Integer> mpp = new HashMap<>();

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);

            
            while (mpp.size() == 3) {
               
                ans += (n - r);

                char leftChar = s.charAt(l);
                mpp.put(leftChar, mpp.get(leftChar) - 1);

               
                if (mpp.get(leftChar) == 0) {
                    mpp.remove(leftChar);
                }

                l++;
            }
        }

        return ans;
    }
}