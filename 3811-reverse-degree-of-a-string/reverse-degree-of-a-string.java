class Solution {
    public int reverseDegree(String s) {
        int totaldeg = 0;
        for (int i = 0;i < s.length();i++ ){
           char c = s.charAt(i);
           int rev = 26 - (c - 'a');
           int Strpos = i + 1;
           totaldeg += rev *  Strpos ;
        } 
        return totaldeg;      
    }
}