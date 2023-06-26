import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isNStraightHandTest1(){
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        boolean actual = new Solution().isNStraightHand(hand, groupSize);

        Assert.assertTrue(actual);
    }

    @Test
    public void isNStraightHandTest2(){
        int[] hand = {1,2,3,4,5};
        int groupSize = 4;
        boolean actual = new Solution().isNStraightHand(hand, groupSize);

        Assert.assertFalse(actual);
    }

    //8,10,12
    @Test
    public void isNStraightHandTest3(){
        int[] hand = {8,10,12};
        int groupSize = 3;
        boolean actual = new Solution().isNStraightHand(hand, groupSize);

        Assert.assertFalse(actual);
    }

    @Test
    public void isNStraightHandTest4(){
        int[] hand = {1,2};
        int groupSize = 2;
        boolean actual = new Solution().isNStraightHand(hand, groupSize);

        Assert.assertTrue(actual);
    }

    @Test
    public void isNStraightHandTest5(){
        int[] hand = {2,3,1};
        int groupSize = 3;
        boolean actual = new Solution().isNStraightHand(hand, groupSize);

        Assert.assertTrue(actual);
    }

}
