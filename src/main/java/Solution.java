import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(groupSize == 1) {
            return true;
        }
        int handSize = hand.length;
        if (handSize % groupSize != 0) {
            return false;
        }

        Arrays.sort(hand);

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing((int[] a) -> a[0]).thenComparing((int[] a) -> -a[1]));

        for (int i = 0; i < hand.length; i++) {
            if (pq.isEmpty()) {
                pq.offer(new int[]{hand[i], 1});
            } else {
                if (pq.peek()[0] == hand[i] - 1) {
                    int c = pq.poll()[1];
                    c++;
                    if (c != groupSize) {
                        pq.offer(new int[]{hand[i], c});
                    }
                } else if (pq.peek()[0] == hand[i]) {
                    pq.offer(new int[]{hand[i], 1});
                } else {
                    return false;
                }
            }

        }

        return pq.isEmpty();
    }
}