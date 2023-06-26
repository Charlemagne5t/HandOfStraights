import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        List<List<Integer>> listOfHands = new ArrayList<>();
        for (int i = 0; i < n / groupSize; i++) {
            listOfHands.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int card = hand[i];
            boolean inserted = false;
            for (int j = 0; j < listOfHands.size(); j++) {
                if (listOfHands.get(j).size() == 0) {
                    listOfHands.get(j).add(card);
                    inserted = true;
                    break;
                } else if (listOfHands.get(j).size() < groupSize) {
                    if ((listOfHands.get(j).get(listOfHands.get(j).size() - 1) - card) == -1) {
                        listOfHands.get(j).add(card);
                        inserted = true;
                        break;
                    }
                }

            }
            if (!inserted) return false;

        }
        return true;
    }
}
