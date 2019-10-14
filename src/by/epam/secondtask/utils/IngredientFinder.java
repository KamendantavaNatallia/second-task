package by.epam.secondtask.utils;

import by.epam.secondtask.entity.Vegetables;

import java.util.List;

public class IngredientFinder {

    public void findIngredientByCalories(List<Vegetables> salad, int findCalories) {
        int currentCalories;

        for(Vegetables ingredient : salad) {
            currentCalories = ingredient.getCalories();
            if (currentCalories == findCalories) {
                System.out.println("We found ingredient with " + currentCalories + " calories. It's - " + ingredient.toString() + " .");
            }
        }
    }
}