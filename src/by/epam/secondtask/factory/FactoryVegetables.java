package by.epam.secondtask.factory;

import by.epam.secondtask.entity.Vegetables;
import by.epam.secondtask.entity.Fruits;
import by.epam.secondtask.entity.FruitsKind;
import by.epam.secondtask.entity.Roots;
import by.epam.secondtask.entity.RootsKind;
import by.epam.secondtask.entity.Leafy;
import by.epam.secondtask.entity.LeafyKind;
import com.sun.jdi.InvalidTypeException;

public class FactoryVegetables {

    public Vegetables createVegetables(String[] parameters) throws InvalidTypeException {
        String typeVegetables = parameters[0].trim();
        switch (typeVegetables) {
            case "CUCUMBER":
            case "TOMATO": {
                Fruits fruit = new Fruits();
                fruit.setFruitsKind(FruitsKind.valueOf(parameters[0].trim()));
                fruit.setCalories(Integer.valueOf(parameters[1].trim()));
                fruit.setWeight(Integer.valueOf(parameters[2].trim()));
                return fruit;
            }
            case "CABBAGE":
            case "PARSLEY": {
                Leafy leaf = new Leafy();
                leaf.setLeafyKind(LeafyKind.valueOf(parameters[0].trim()));
                leaf.setCalories(Integer.valueOf(parameters[1].trim()));
                leaf.setWeight(Integer.valueOf(parameters[2].trim()));
                return leaf;
            }
            case "BEET":
            case "CARROT": {
                Roots root = new Roots();
                root.setRootsKind(RootsKind.valueOf(parameters[0].trim()));
                root.setCalories(Integer.valueOf(parameters[1].trim()));
                root.setWeight(Integer.valueOf(parameters[2].trim()));
                return root;
            }
            default: throw new InvalidTypeException("This isn't suitable for salad.");
        }
    }
}