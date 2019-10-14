package by.epam.secondtask.utils;

import by.epam.secondtask.entity.Fruits;
import by.epam.secondtask.entity.FruitsKind;
import by.epam.secondtask.entity.Vegetables;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SaladCalculatorTest {
    SaladCalculator calculator;
    List<Vegetables> salad = new ArrayList<>();

    @BeforeMethod
    public void setUp() {
        calculator = new SaladCalculator();
    }

    @Test
    public void testCountCalories() {
        int calories = calculator.countCalories(salad);
    }

    @Test
    public void testCountWeight() {
        int weight = calculator.countWeight(salad);
    }
}