package by.epam.secondtask.creator;

import com.sun.jdi.InvalidTypeException;
import by.epam.secondtask.entity.Vegetables;
import by.epam.secondtask.validator.StringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class SaladCreator {
    public int size;

    public List<Vegetables> makeSalad(List<String> ingredients) throws InvalidTypeException {
        List<Vegetables> salad = new ArrayList<>();
        FactoryVegetables factoryVegetables = new FactoryVegetables();
        size = ingredients.size();
        StringValidator validator = new StringValidator();
        for (int i = 0; i <= size; i++) {
            String current = ingredients.get(i).toUpperCase().trim();
            if (validator.isValidate(current)) {
                String[] arrayIngredients = current.split(" ");
                salad.add(factoryVegetables.createVegetables(arrayIngredients));
            }
        }
        return salad;
    }
}