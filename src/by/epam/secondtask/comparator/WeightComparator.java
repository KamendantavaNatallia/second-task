package by.epam.secondtask.comparator;

import by.epam.secondtask.entity.Vegetables;

import java.util.Comparator;

public class WeightComparator implements Comparator<Vegetables> {

    @Override
    public int compare(Vegetables o1, Vegetables o2) {
        return o2.getWeight() - o1.getWeight();
    }
}
