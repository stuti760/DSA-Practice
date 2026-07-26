class Solution {
public:
    bool detectCapitalUse(string s) {
        if(s.size() == 1) return true;
        int cap = 0;
        int low = 0;
        if(s[0] >= 97) {
            low = 1;
        }
        if(s[1] < 97) {
            cap = 1;
        }else{
            low = 1;
        }
        for(int i=1;i<s.size();i++) {
            if(s[i] >= 97 && cap == 1){
                return false;
            }
            if(s[i] < 97 && low == 1) {
                return false;
            }
        }
        return true;
    }
};