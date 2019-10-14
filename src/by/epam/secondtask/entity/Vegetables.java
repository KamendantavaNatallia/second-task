package by.epam.secondtask.entity;

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
        return 0;
    }

    public int getWeight() {
        return 0;
    }
}
