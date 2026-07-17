class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] visited = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <n; i++){
            char ch = s.charAt(i);
            if(ch =='('){
                stack.push(i);
            } else if(ch ==')'){
                if(!stack.isEmpty()) {
                    int idx = stack.pop();
                    visited[idx] = 1;
                    visited[i] = 1;
                }
            }
        } 
        int maximumLength = 0;
        int count = 0;
        for(int num : visited) {
            if(num == 1){
                count++;
                maximumLength = Math.max(maximumLength, count);
            } else{
                count = 0;
            }
        }
         return maximumLength;

        
    }
}