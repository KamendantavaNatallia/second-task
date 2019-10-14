package by.epam.secondtask.creator;

import by.epam.secondtask.entity.Vegetables;
import com.sun.jdi.InvalidTypeException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SaladCreatorTest {
    SaladCreator saladCreator;
    List<String> ingredients;

    @BeforeMethod
    public void setUp() {
        saladCreator = new SaladCreator();
        ingredients = new ArrayList<>();
        ingredients.add("TOMATO 15 200");
        ingredients.add("CUCUMBER 25 300");
        ingredients.add("BEET 23 120");
        ingredients.add("CARROT 45 400");
        ingredients.add("CABBAGE 32 600");
        ingredients.add("PARSLEY 14 70");
    }

    @Test
    public void testMakeSalad() throws InvalidTypeException {
        List<Vegetables> salad = saladCreator.makeSalad(ingredients);
        int sizeSalad = salad.size();
        Assert.assertEquals(6, sizeSalad);
    }
}