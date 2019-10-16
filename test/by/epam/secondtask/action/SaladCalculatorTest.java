package by.epam.secondtask.action;

import by.epam.secondtask.entity.Vegetables;
import by.epam.secondtask.entity.Fruits;
import by.epam.secondtask.entity.FruitsKind;
import by.epam.secondtask.entity.Leafy;
import by.epam.secondtask.entity.LeafyKind;
import by.epam.secondtask.entity.Roots;
import by.epam.secondtask.entity.RootsKind;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SaladCalculatorTest {
    SaladCalculator calculator;
    List<Vegetables> salad = new ArrayList<>();

    @BeforeClass
    public void setUp() {
        calculator = new SaladCalculator();
        salad.add(new Fruits(FruitsKind.CUCUMBER, 14, 150));
        salad.add(new Fruits(FruitsKind.TOMATO, 24, 220));
        salad.add(new Leafy(LeafyKind.PARSLEY, 40, 10));
        salad.add(new Leafy(LeafyKind.CABBAGE, 25, 500));
        salad.add(new Roots(RootsKind.BEET, 42, 300));
        salad.add(new Roots(RootsKind.CARROT, 35, 250));
    }

    @Test
    public void testCountCalories() {
        int calories = calculator.countCalories(salad);
        Assert.assertEquals(180, calories);
    }

    @Test
    public void testCountWeight() {
        int weight = calculator.countWeight(salad);
        Assert.assertEquals(1430, weight);
    }
}