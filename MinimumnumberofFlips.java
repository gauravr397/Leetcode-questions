
import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumnumberofFlips {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {

            int positive = 0;
            int negative = 0;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {

                int one = sc.nextInt();
                if (one == 1) {
                    positive++;
                } else {
                    negative++;
                }

            }

            if (n % 2 == 0) {
                int diff = Math.abs(positive - negative);
                System.out.println(diff / 2);
            } else {
                System.out.println(-1);
            }
            tc--;
        }
    }
    /// OR // OR /// OR /// OR // OR /// OR /// OR // OR /// OR /// OR // OR /// OR
    // public static void main (String[] args) throws java.lang.Exception
    // {
    // // your code goes here
    // Codechef cf = new Codechef();
    // //int t=1;
    // int tc=1;
    // Scanner sc = new Scanner(System.in);
    // int t= sc.nextInt();
    // while(tc<=t){
    // cf.solve(tc);
    // tc++;

    // }

    // }
    // public static int solve(int tc){
    // Scanner sc1 = new Scanner(System.in);
    // int n= sc1.nextInt();
    // int sum=0;
    // int[] a = new int[n];

    // for(int i=0 ;i<n;i++){
    // a[i]=sc1.nextInt();
    // sum+=a[i];

    // } if(n%2==1){
    // System.out.println(-1);
    // }
    // else{
    // System.out.println(MAth.abs(sum/2));
    // }return 0;
    // }
}
