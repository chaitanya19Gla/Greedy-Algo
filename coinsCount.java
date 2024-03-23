import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class coinsCount {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoin = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= amount) {
                if (coins[i] <= amount) {
                    countOfCoin++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }

        System.out.println("countOfCoin = " + countOfCoin);
        for (int j = 0 ;j<ans.size();j++){
            System.out.print(ans.get(j) + " ");
        }
        System.out.println();

    }

}
