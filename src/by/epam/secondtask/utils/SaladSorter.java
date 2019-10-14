package by.epam.secondtask.utils;

import by.epam.secondtask.entity.Vegetables;

import java.util.Collections;
import java.util.List;

public class SaladSorter {

    public void caloriesSort(List<Vegetables> salad) {
        Collections.sort(salad, new CaloriesComparator());
    }

    public void weightSort(List<Vegetables> salad) {
    Collections.sort(salad, new WeightComparator());
    }

    public void weightAndCaloriesSort(List<Vegetables> salad) {
        Collections.sort(salad, new CaloriesComparator().thenComparing(new WeightComparator()));
    }
}
