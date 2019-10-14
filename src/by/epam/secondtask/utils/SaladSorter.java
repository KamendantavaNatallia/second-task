package by.epam.secondtask.utils;

import by.epam.secondtask.creator.SaladCreator;
import by.epam.secondtask.entity.Vegetables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class SaladSorter {
    Logger log = LogManager.getLogger(SaladCreator.class);

    public void caloriesSort(List<Vegetables> salad) {
        log.info("Sort vegetables by calories");
        Collections.sort(salad, new CaloriesComparator());
    }

    public void weightSort(List<Vegetables> salad) {
        log.info("Sort vegetables by weight");
        Collections.sort(salad, new WeightComparator());
    }

    public void weightAndCaloriesSort(List<Vegetables> salad) {
        log.info("Sort vegetables by calories and weight");
        Collections.sort(salad, new CaloriesComparator().thenComparing(new WeightComparator()));
    }
}
