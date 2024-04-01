package greedy;

import java.util.Arrays;

public class CoinChange {

        public int coinChange(int[] coins, int amount) {
//            Arrays.sort(coins);
//            int moneyLeft = amount;
//            int count = 0;
//
//            System.out.println("started ");
//
//            for(int i = coins.length-1; i>=0; i--){
//                if(moneyLeft <=0){
//                    System.out.println("break");
//                    break;
//                }
//
//                while (moneyLeft>=coins[i]){
//                        moneyLeft -= coins[i];
//                        count++;
//
//                    System.out.println("money Left :" + moneyLeft +" and count is " + count+ " and coin is " + coins[i]);
//                }
//            }
//
//            if(moneyLeft != 0){
//                System.out.println("printed -1");
//                return -1;
//            }
//            return count;
                Arrays.sort(coins);
                int moneyLeft = amount;
                int count = 0;

                System.out.println("started ");

                for(int i = coins.length-1; i >= 0; i--){
                    if(moneyLeft <= 0){
                        System.out.println("break");
                        break;
                    }

                    while (moneyLeft >= coins[i]){
                        if (moneyLeft >= coins[i]) {
                            moneyLeft -= coins[i];
                            count++;
                            System.out.println("money Left :" + moneyLeft +" and count is " + count+ " and coin is " + coins[i]);
                        }
                    }
                }

                if(moneyLeft != 0){
                    System.out.println("printed -1");
                    return -1;
                }
                return count;

    }
}
