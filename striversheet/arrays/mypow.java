package striversheet.arrays;

public class mypow {
    public static void main(String[] args) {
        double x = 1;
        long n = 323883118888L;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x ,long n){
        double result = helper(x , Math.abs(n));
        return n>=0 ? result : 1/result;
    }

    public static double helper(double x , long n){
        if(n==0) return 1;
        double half = helper(x , n/2);
        if (n % 2 == 0) return half * half;
        else return half * half * x;
    }
}
