package by.epam.secondtask.sorter;

import by.epam.secondtask.entity.Fruits;
import by.epam.secondtask.entity.Leafy;
import by.epam.secondtask.entity.Roots;
import by.epam.secondtask.entity.Vegetables;
import by.epam.secondtask.entity.FruitsKind;
import by.epam.secondtask.entity.LeafyKind;
import by.epam.secondtask.entity.RootsKind;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;


public class SaladSorterTest {
    SaladSorter saladSorter;
    List<Vegetables> salad;

    @BeforeClass
    public void setUp() {
        saladSorter = new SaladSorter();
        salad = new ArrayList<>();
        salad.add(new Fruits(FruitsKind.CUCUMBER, 14, 150));
        salad.add(new Fruits(FruitsKind.TOMATO, 24, 220));
        salad.add(new Leafy(LeafyKind.PARSLEY, 40, 10));
        salad.add(new Leafy(LeafyKind.CABBAGE, 25, 500));
        salad.add(new Roots(RootsKind.BEET, 42, 300));
        salad.add(new Roots(RootsKind.CARROT, 35, 250));
    }

    @Test
    public void testCaloriesSort() {
        List<Vegetables> testSalad = new ArrayList<>();
        testSalad.add(new Roots(RootsKind.BEET, 42, 300));
        testSalad.add(new Leafy(LeafyKind.PARSLEY, 40, 10));
        testSalad.add(new Roots(RootsKind.CARROT, 35, 250));
        testSalad.add(new Leafy(LeafyKind.CABBAGE, 25, 500));
        testSalad.add(new Fruits(FruitsKind.TOMATO, 24, 220));
        testSalad.add(new Fruits(FruitsKind.CUCUMBER, 14, 150));
        saladSorter.caloriesSort(salad);
        Assert.assertEquals(testSalad, salad);
    }

    @Test
    public void testWeightSort() {
        List<Vegetables> testSalad = new ArrayList<>();
        testSalad.add(new Leafy(LeafyKind.CABBAGE, 25, 500));
        testSalad.add(new Roots(RootsKind.BEET, 42, 300));
        testSalad.add(new Roots(RootsKind.CARROT, 35, 250));
        testSalad.add(new Fruits(FruitsKind.TOMATO, 24, 220));
        testSalad.add(new Fruits(FruitsKind.CUCUMBER, 14, 150));
        testSalad.add(new Leafy(LeafyKind.PARSLEY, 40, 10));
        saladSorter.weightSort(salad);
        Assert.assertEquals(testSalad, salad);
    }

    @Test
    public void testWeightAndCaloriesSort() {
        List<Vegetables> testSalad = new ArrayList<>();
        testSalad.add(new Roots(RootsKind.BEET, 42, 300));
        testSalad.add(new Leafy(LeafyKind.PARSLEY, 40, 10));
        testSalad.add(new Roots(RootsKind.CARROT, 35, 250));
        testSalad.add(new Leafy(LeafyKind.CABBAGE, 25, 500));
        testSalad.add(new Fruits(FruitsKind.TOMATO, 24, 220));
        testSalad.add(new Fruits(FruitsKind.CUCUMBER, 14, 150));
        saladSorter.weightAndCaloriesSort(salad);
        Assert.assertEquals(testSalad, salad);
    }
}