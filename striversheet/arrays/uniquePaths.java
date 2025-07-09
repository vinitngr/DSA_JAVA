package striversheet.arrays;

public class uniquePaths {
    public static void main(String[] args) {
        int path = paths(51,9);
        System.out.printf("number of path : %d" , path);
    }

    public static int paths(int m, int n) {
        int steps = n + m - 2;
        int minr = Math.min(m - 1, n - 1);
        long result = 1;

        for (int i = 1 ; i <= minr; i++) {
            result *= (steps - minr + i);
            result /= i;
        }
        return (int) result;
    }


}



///big integer way , just managed to beat 2% in runtime

//public static int paths(int m, int n) {
//    int numRight = n - 1;
//    int numDown = m - 1;
//
//    BigInteger numerator = factorial(numRight + numDown);
//    BigInteger denominator = factorial(numRight).multiply(factorial(numDown));
//    BigInteger result = numerator.divide(denominator);
//
//    return result.intValue();
//}
//
//public static BigInteger factorial(long N) {
//    BigInteger result = BigInteger.ONE;
//    for (long i = 1; i <= N; i++) {
//        result = result.multiply(BigInteger.valueOf(i));
//    }
//    return result;
//}