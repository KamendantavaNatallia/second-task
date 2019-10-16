package by.epam.secondtask.entity;

import java.util.Objects;

public abstract class Vegetables {
    private int calories;
    private int weight;
    private String color;

    public Vegetables(int calories, int weight, String color) {
        this.calories = calories;
        this.weight = weight;
        this.color = color;
    }

    public Vegetables() {
    }

    public Vegetables(int calories, int weight) {
        this.calories = calories;
        this.weight = weight;
    }

    public int getCalories(Integer integer) {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWeight(Integer integer) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetables that = (Vegetables) o;
        return calories == that.calories &&
                weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, weight);
    }

    public abstract String getName();
}