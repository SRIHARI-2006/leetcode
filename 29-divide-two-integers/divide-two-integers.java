class Solution {
    public int divide(int d1, int d2) {

        if(d1 == Integer.MIN_VALUE && d2 == -1)
            return Integer.MAX_VALUE;

        long a = Math.abs((long)d1);
        long b = Math.abs((long)d2);
        int ans = 0;

        while(a >= b){

            long t = b;
            int m = 1;

            while(a >= (t << 1)){
                t <<= 1;
                m <<= 1;
            }

            a -= t;
            ans += m;
        }

        if((d1 > 0) ^ (d2 > 0))
            ans = -ans;

        return ans;
    }
}