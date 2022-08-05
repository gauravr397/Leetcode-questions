class Solution {
  public int mySqrt(int x) {
        long xLong = x;
        while (xLong*xLong > x)
            xLong = (xLong + x/xLong) / 2;
        return (int) xLong;
    }
}