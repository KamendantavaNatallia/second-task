package by.epam.secondtask.utils;

import by.epam.secondtask.creator.SaladCreator;
import by.epam.secondtask.entity.Vegetables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class SaladCalculator {
    static Logger log = LogManager.getLogger(SaladCreator.class);

    public int countCalories(List<Vegetables> salad) {
        int calories = 0;
        for (Vegetables ingredient : salad) {
            calories += ingredient.getCalories();
        }
            log.info("We counted salad calories");
            return calories;
        }

        public int countWeight(List<Vegetables> salad) {
        int weight = 0;
        for (Vegetables ingredient : salad) {
            weight += ingredient.getWeight();
        }
        log.info("We counted salad weight");
        return weight;
        }
    }