package examLab;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 *
 * To complete this Lab Final, go to each of these three classes and
 * complete the TODO's within
 *
 * DO NOT alter this file in any way nor any of the other methods
 * provided in the three classes (aside from those with TODO's)
 * DO NOT leave in any extra print statements in your code
 *
 * You may add helper functions in any of the three classes if you
 * wish.
 *
 * When you are ready, raise your hand. One of us will come to you to
 * grade your exam. You only get one chance to have your exam graded.
 * Grading will be done silently, after which you will be dismissed
 * from class so that others can concentrate on completing this exam.
 * If time is called and you are still working on your exam, you will
 * be asked to stop typing and stand next to your machine. Continuing
 * to type will be considered cheating at that point, which will result
 * in you getting a 0 on this exam.
 *
 * Grading:
 * 		3 correct   	100%
 * 		2 correct:		84%
 *      1 correct:      75%
 *
 * 		Only one problem may be submitted for partial credit. For
 * 		example, if you have 1 complete but 2 partially complete, let
 * 		us know which one you want to submit for partial credit. Your
 * 		grade will be between 75 and 81%.
 *
 *
 */
public class LabFinal {

    /**
     * JUnits to run and test the methods you write.
     */

    @Test
    public void question1() {
        // Question 1
        Arrays arrays = new Arrays();
        
        Assert.assertTrue(arrays.inOrderQuestion(new String[] {"2", "4", "8", "16"}));
        Assert.assertFalse(arrays.inOrderQuestion(new String[] {"16", "8", "4", "2"}));
        Assert.assertFalse(arrays.inOrderQuestion(new String[] {"2", "4", "6", "8"}));
        Assert.assertTrue(arrays.inOrderQuestion(new String[] {"2", "4", "6a", "8"}));
        Assert.assertTrue(arrays.inOrderQuestion(new String[] {"zelda", "2", "mario", "samus", "32"}));
        Assert.assertTrue(arrays.inOrderQuestion(new String[] {"1"}));
        Assert.assertFalse(arrays.inOrderQuestion(new String[] {"0"}));
        Assert.assertTrue(arrays.inOrderQuestion(new String[] {}));
    }


    @Test
    public void question2() {
        // Question 2
        Recursion recursion = new Recursion();
        Assert.assertEquals(20, recursion.recursiveQ("2468"), 0.0000001);
        Assert.assertEquals(16, recursion.recursiveQ("-2468"), 0.0000001);
        Assert.assertEquals(16.4, recursion.recursiveQ("2.468"), 0.0000001);
        Assert.assertEquals(20, recursion.recursiveQ("2468.-.-..--"), 0.0000001);
        Assert.assertEquals(0, recursion.recursiveQ("-"), 0.0000001);
        Assert.assertEquals(0, recursion.recursiveQ("."), 0.0000001);        
        Assert.assertEquals(0, recursion.recursiveQ(""), 0.0000001);
    }

    @Test
    public void question3() {
        // Question 3
        MyLinkedList linkedList = new MyLinkedList();
        Assert.assertTrue(linkedList.toString().equals("Forward: donut pie iceCream iceCream pair donut \n" +
                "Backward: donut pair iceCream iceCream pie donut "));
        
        linkedList.duplicateAll(1);
        Assert.assertTrue(linkedList.toString().equals("Forward: donut pie pie iceCream iceCream pair donut \n" +
                "Backward: donut pair iceCream iceCream pie pie donut "));
        
        linkedList.duplicateAll(0);
        Assert.assertTrue(linkedList.toString().equals("Forward: donut donut pie pie iceCream iceCream pair donut \n" +
                "Backward: donut pair iceCream iceCream pie pie donut donut "));

        linkedList.duplicateAll(2);
        Assert.assertTrue(linkedList.toString().equals("Forward: donut donut pie pie pie iceCream iceCream iceCream pair pair donut \n" +
                "Backward: donut pair pair iceCream iceCream iceCream pie pie pie donut donut "));

        try {
            linkedList.duplicateAll(11);
            Assert.fail();
        }
        catch (IndexOutOfBoundsException e) {
            Assert.assertTrue(e != null);
        }
    }
}
