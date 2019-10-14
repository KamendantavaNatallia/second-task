package by.epam.secondtask.utils;

import by.epam.secondtask.entity.Vegetables;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Vegetables> {

    @Override
    public int compare(Vegetables o1, Vegetables o2) {
        return o2.getCalories() - o1.getCalories();
    }
}
