package by.epam.secondtask.entity;

public class Leafy extends Vegetables {
    private LeafyKind leafyKind;
    private boolean isCrumbled;

    public Leafy(int calories, int weight, String color, LeafyKind leafyKind, boolean isCrumbled) {
        super(calories, weight, color);
        this.leafyKind = leafyKind;
        this.isCrumbled = isCrumbled;
    }

    public Leafy(LeafyKind leafyKind, boolean isCrumbled) {
        this.leafyKind = leafyKind;
        this.isCrumbled = isCrumbled;
    }

    public Leafy() {

    }

    public LeafyKind getLeavesKind(LeafyKind leafyKind) {
        return this.leafyKind;
    }

    public void setLeafyKind(LeafyKind leafyKind) {
        this.leafyKind = leafyKind;
    }

    public boolean isCrumbled() {
        return isCrumbled;
    }

    public void setCrumbled(boolean crumbled) {
        isCrumbled = crumbled;
    }
}