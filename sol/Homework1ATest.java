package sol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.Email;
import src.Item;
import src.IFuncList;
import src.FuncList;

public class Homework1ATest {
    private EmailUtilities testUtilities;
    private Email e1, e2, e3, e4, e5, e6, e7;

    @Before
    public void initializeTestList() {
        // This data is populated before running the tests
        // You can use this when testing!

        e1 = new Email("milda@brown.edu", "cs200 is cool", false);
        e2 = new Email("milda@brown.edu", "programming", false);
        e3 = new Email("milda@green.edu", "do your homework", false);
        e4 = new Email("milda@brown.edu", "please read this", true);
        e5 = new Email("seth@brown.edu", "hello", true);
        e6 = new Email("nathan@brown.edu", "Autograder for cs200", false);
        e7 = new Email("cindy@brown.edu", "meandering walks", true);

        IFuncList<Email> testEmailList = new FuncList<Email>().
                link(e1).link(e2).link(e3).link(e4).link(e5).link(e6).link(e7);

        this.testUtilities = new EmailUtilities(testEmailList);
    }

    @Test
    public void testGetAllUnread() {
        // TASK 1-A Email Utility unit test
        IFuncList<Email> expectedResult = new FuncList<Email>().link(e1);
        // TODO: link Emails to expectedResult as necessary
        Assert.assertEquals(expectedResult, this.testUtilities.getAllUnread());
    }

    @Test
    public void testMarkAsUnread() {
        // TASK 1-A Email Utility unit test
        IFuncList<Email> expectedResult = new FuncList<Email>();
        // TODO: link Emails to expectedResult as necessary
        Assert.assertEquals(expectedResult, this.testUtilities.markAsUnread());
    }

    @Test
    public void testUnreadMessagesFrom() {
        // TASK 1-A Email Utility unit test
        IFuncList<Email> expectedResult = new FuncList<Email>();
        // TODO: link Emails to expectedResult as necessary
        Assert.assertEquals(expectedResult, this.testUtilities.unreadMessagesFrom("milda@brown.edu"));
    }

    @Test
    public void testMessagesAbout() {
        // TASK 1-A Email Utility unit test
        IFuncList<Email> expectedResult = new FuncList<Email>();
        // TODO: link Emails to expectedResult as necessary
        Assert.assertEquals(expectedResult, this.testUtilities.messagesAbout("cs200"));
    }

    @Test
    public void testUnreadFrom() {
        // TASK 1-A Email Utility unit test
        IFuncList<String> expectedResult = new FuncList<String>();
        // TODO: link Strings to expectedResult as necessary
        Assert.assertEquals(expectedResult, this.testUtilities.unreadFrom());
    }

    @Test
    public void testRainfall() {
        // TASK 2-A
        double delta = 0.0001;

        // General rainfall test
        IFuncList<Integer> rData1 = new FuncList<Integer>().
                link(8).
                link(-999).
                link(5).
                link(-2).
                link(1);
        Rainfall r1 = new Rainfall(rData1);
        Assert.assertEquals(3, r1.getAverage(), delta);

        // TODO: add more tests
    }

    @Test
    public void testCheckout() {
        // TASK 3-A
        double delta = 0.0001;

        // Test on mix of items
        IFuncList<Item> itemMix = new FuncList<Item>().
                link(new Item("hat", 15)).
                link(new Item("shoes", 85)).
                link(new Item("bag", 50)).
                link(new Item("shoes", 25));
        Cart c1 = new Cart(itemMix);
        Assert.assertEquals((25 + 50 + 85 + 15) - ((25 + 85) * 0.2), c1.checkout(), delta);

        // TODO: add more tests and annotate why you chose the examples that you chose
    }
}
