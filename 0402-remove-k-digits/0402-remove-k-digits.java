class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        if (k >= num.length()) return "0";

        for (int i = 0; i < num.length(); i++) {

            char digit = num.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }


        
        StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        int j = 0;

        for (j = 0; j < ans.length() - 1; j++) {
            if (ans.charAt(j) != '0') {
                break;
            }
        }

        String result = ans.substring(j);

        if(result.length() == 0) return "0";

        return result;
    }
}