class Solution {

    public String longestPalindrome(String s) {

        String ans = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){

                String sub = s.substring(i, j + 1);

                if(isPal(sub) && sub.length() > ans.length()){
                    ans = sub;
                }
            }
        }

        return ans;
    }

    boolean isPal(String s){
        int l = 0, r = s.length()-1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }
}