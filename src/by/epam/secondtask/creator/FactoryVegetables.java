package by.epam.secondtask.creator;

import by.epam.secondtask.entity.Fruits;
import by.epam.secondtask.entity.Leafy;
import by.epam.secondtask.entity.Roots;
import by.epam.secondtask.entity.Vegetables;
import com.sun.jdi.InvalidTypeException;

public class FactoryVegetables {

    public Vegetables createVegetables(String[] parameters) throws InvalidTypeException {
        String typeVegetables = parameters[0].trim();
        switch (typeVegetables) {
            case "CUCUMBER":
            case "TOMATO": {
                Fruits fruit = new Fruits();
               // fruit.getFruitsKind(FruitsKind.valueOf(parameters[0].trim()));
                fruit.getCalories(Integer.valueOf(parameters[1].trim()));
                fruit.getWeight(Integer.valueOf(parameters[2].trim()));
                return fruit;
            }
            case "CABBAGE":
            case "PARSLEY": {
                Leafy leaf = new Leafy();
                // leaf.getLeavesKind(LeafyKind.valueOf(parameters[0].trim()));
                leaf.getCalories(Integer.valueOf(parameters[1].trim()));
                leaf.getWeight(Integer.valueOf(parameters[2].trim()));
                return leaf;
            }
            case "BEET":
            case "CARROT": {
                Roots root = new Roots();
               // root.getRootsKind(RootsKind.valueOf(parameters[0].trim()));
                root.getCalories(Integer.valueOf(parameters[1].trim()));
                root.getWeight(Integer.valueOf(parameters[2].trim()));
                return root;
            }
            default: throw new InvalidTypeException("This vegetable isn't suitable for salad.");
        }
    }
}

