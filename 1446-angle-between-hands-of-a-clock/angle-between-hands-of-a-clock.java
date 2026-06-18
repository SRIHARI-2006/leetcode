class Solution {
    public double angleClock(int hour, int minutes) {

        double angle = Math.abs(((60*hour)-(11*minutes)) / 2.0);

        return Math.min(angle, 360.0 - angle);
        
    }
}