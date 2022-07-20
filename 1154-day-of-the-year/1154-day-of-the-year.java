class Solution {
    public int dayOfYear(String date) {
        int day= Integer.valueOf(date.substring(8));
        int year= Integer.valueOf(date.substring(0,4));
        int month= Integer.valueOf(date.substring(5,7));
        int ans=0;
        int month_arr[]=new int[] {31,isLeapyr(year)? 29 : 28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
            ans += month_arr[i];
            
        }return ans + day;
    }
    
    boolean isLeapyr(int year){
        return (year%4==0 && year%100!=0) || year%400==0;
    }
}