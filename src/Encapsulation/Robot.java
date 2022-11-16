package Encapsulation;

public class Robot {
    private String name;
    private int madeYear;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot(String name, int madeYear) {
        this.name = name;
        this.madeYear = madeYear;
    }
}

