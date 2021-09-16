package FirstTestCase;

import org.junit.Test;

public class TestClass extends TestBase {






    @Test
    public void userCanSendOrder() {
        openURL();
        RestSelect();
        /*GoMainPage();*/
        mathRandomHead();
        PickRandCards();
        GoBasket();
        fillInFields();
        SelectPayType();
        SendOrder();
        waitForComplete();



    }


}