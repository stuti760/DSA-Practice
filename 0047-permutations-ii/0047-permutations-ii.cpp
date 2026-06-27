class Solution {
public:
    
    void solve(vector<int>& nums,  vector<vector<int>>& ans, int i){
        if(i>= nums.size()){
            ans.push_back(nums);
            return;
        }

        unordered_set<int> st;

        for(int j=i; j<nums.size(); j++){
            if(st.count(nums[j])) continue;

            st.insert(nums[j]);
            swap(nums[j], nums[i]);
            solve(nums, ans, i+1);

            swap(nums[i], nums[j]);
        }
    }

    vector<vector<int>> permuteUnique(vector<int>& nums) {
       sort(nums.begin(), nums.end());
        vector<vector<int>> ans;
        vector<int> temp;
        solve(nums, ans, 0);

        return ans;
    }
};