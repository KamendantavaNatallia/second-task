package by.epam.secondtask.action;

import by.epam.secondtask.entity.Vegetables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class IngredientFinder {
    static Logger log = LogManager.getLogger(IngredientFinder.class);

    public IngredientFinder() {
    }

    public void findIngredientByCalories(List<Vegetables> salad, int minCalories, int maxCalories) {
        int currentCalories;

        for (Vegetables ingredient : salad) {
            currentCalories = ingredient.getCalories();
            if (currentCalories >= minCalories && currentCalories <= maxCalories) {
                log.info("we're looking for vegetables that match a given calories range");
                System.out.println("We found ingredient with " + currentCalories + " calories. It's - " + ingredient.getName() + " .");
            }
        }
    }
}