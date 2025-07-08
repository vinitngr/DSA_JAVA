package striversheet;
// 2:30 AM 23 june , 2025
public class Stock121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int diff = 0;
        int node = 0;
        int move = 1;
        while (move < prices.length) {
            int tempdiff = prices[move] - prices[node];

            if (tempdiff > diff) {
                diff = tempdiff;
            } else if (tempdiff <= 0) {
                node = move;
            }
            move++;
        }

        return diff;
    }
}


//tried almost 3 solution , took this in HALKA solved at 4:00 AM
//deserves mid-tough
//beat - Runtime 75% and Memory 64%