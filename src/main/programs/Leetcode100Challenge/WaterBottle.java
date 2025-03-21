package Leetcode100Challenge;
/*LeetCode Challenge #1518. Water Bottles
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.



Example 1:

sample 1 1875

Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
Example 2:

sample 2 1875

Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 15 + 3 + 1 = 19.


Constraints:

1 <= numBottles <= 100
2 <= numExchange <= 100*/
public class WaterBottle {

    public static void main(String args[]){
        int numBottle=15;
        int numExchange=4;
        int bottle=numWaterBottle(numBottle,numExchange);
        System.out.println(bottle);
    }

    public static int numWaterBottle(int numBottle,int exchangeBottle){
        int bottle=numBottle;

        while (numBottle >= exchangeBottle){
            int remBottle = numBottle % exchangeBottle;
            int changeBottle = numBottle / exchangeBottle;
            bottle +=changeBottle;
            numBottle=changeBottle+remBottle;
        }
        return bottle;
    }
}
