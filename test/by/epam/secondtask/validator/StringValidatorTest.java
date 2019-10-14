package by.epam.secondtask.validator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringValidatorTest {
    StringValidator validator;
    boolean check;

    @BeforeMethod
    public void setUp() {
        validator = new StringValidator();
    }

    @Test
    public void testFruitIsValidate() {
        String test = "tomato 24    220 ";
        check = validator.isValidate(test);
        Assert.assertTrue(check);
    }

    @Test
    public void testLeafIsValidate() {
        String test = "CABBAGE   25  500 ";
        check = validator.isValidate(test);
        Assert.assertTrue(check);
    }

    @Test
    public void testRootIsValidate() {
        String test = " Beet 42 450 ";
        check = validator.isValidate(test);
        Assert.assertTrue(check);
    }
}