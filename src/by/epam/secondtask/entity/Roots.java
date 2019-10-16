package by.epam.secondtask.entity;


public class Roots extends Vegetables {
    private RootsKind rootsKind;
    private boolean isPeeled;

    public Roots(int calories, int weight, String color, RootsKind rootsKind, boolean isPeeled) {
        super(calories, weight, color);
        this.rootsKind = rootsKind;
        this.isPeeled = isPeeled;
    }

    public Roots(RootsKind rootsKind, boolean isPeeled) {
        this.rootsKind = rootsKind;
        this.isPeeled = isPeeled;
    }

    public Roots() {
    }

    public Roots(RootsKind rootsKind, int calories, int weight) {
        super(calories, weight);
        this.rootsKind = rootsKind;
    }

    public RootsKind getRootsKind(RootsKind rootsKind) {
        return this.rootsKind;
    }

    public void setRootsKind(RootsKind rootsKind) {
        this.rootsKind = rootsKind;
    }

    public boolean isPeeled() {
        return isPeeled;
    }

    public void setPeeled(boolean peeled) {
        isPeeled = peeled;
    }

    public String getName()
    {
        return rootsKind.name();
    }
}
