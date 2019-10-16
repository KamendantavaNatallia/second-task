package by.epam.secondtask;

import by.epam.secondtask.action.IngredientFinder;
import by.epam.secondtask.creator.SaladCreator;
import by.epam.secondtask.entity.Vegetables;
import by.epam.secondtask.reader.TxtReader;
import com.sun.jdi.InvalidTypeException;

import java.util.List;

public class Runner {
    public static void main(String[] args) throws InvalidTypeException {

        String fileName = "/Users/nkamendantava/IdeaProjects/chef/resources/ingredients.txt";
        TxtReader txtReader = new TxtReader();
        List<String> ingredients = txtReader.readLines(fileName);
        SaladCreator saladCreator = new SaladCreator();
        List<Vegetables> salad = saladCreator.makeSalad(ingredients);

        IngredientFinder finder = new IngredientFinder();
        finder.findIngredientByCalories(salad, 15, 30);
    }
}