package cpen221practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class ResistorTest {

    private Resistor resistor;

    @Before
    public void setup() {
        resistor = new Resistor();
    }

    @Test
    public void testBlackColorCode() {
        String input = "black";
        int expected = 0;

        Assert.assertEquals(expected, resistor.colorCode(input));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testWhiteColorCode() {
        String input = "white";
        int expected = 9;

        Assert.assertEquals(expected, resistor.colorCode(input));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testOrangeColorCode() {
        String input = "orange";
        int expected = 3;

        Assert.assertEquals(expected, resistor.colorCode(input));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testColors() {
        String[] expected = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        Assert.assertEquals(expected, resistor.colors());
    }
    
}
