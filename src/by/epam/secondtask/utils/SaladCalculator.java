package by.epam.secondtask.utils;

import by.epam.secondtask.entity.Vegetables;

import java.util.List;

public class SaladCalculator {

    public int countCalories(List<Vegetables> salad) {
        int calories = 0;
        for (Vegetables ingredient : salad) {
            calories += ingredient.getCalories();
        }
            return calories;
        }

        public int countWeight(List<Vegetables> salad) {
        int weight = 0;
        for (Vegetables ingredient : salad) {
            weight += ingredient.getWeight();
        }
        return weight;
        }



    }

