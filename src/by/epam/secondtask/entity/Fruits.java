package by.epam.secondtask.entity;

public class Fruits extends Vegetables {
    private FruitsKind fruitsKind;
    private boolean isChopped;

    public Fruits(int calories, int weight, String color, FruitsKind fruitsKind, boolean isChopped) {
        super(calories, weight, color);
        this.fruitsKind = fruitsKind;
        this.isChopped = isChopped;
    }

    public Fruits() {
        super();
    }

    public Fruits(FruitsKind fruitsKind, int calories, int weight) {
        super(calories, weight);
        this.fruitsKind = fruitsKind;
    }

    public FruitsKind getFruitsKind(FruitsKind fruitsKind) {
        return this.fruitsKind;
    }

    public void setFruitsKind(FruitsKind fruitsKind) {
        this.fruitsKind = fruitsKind;
    }

    public boolean isChopped() {
        return isChopped;
    }

    public void setChopped(boolean chopped) {
        isChopped = chopped;
    }

    public String getName()
    {
        return fruitsKind.name();
    }
}