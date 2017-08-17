package gifts;

public class Candy extends Sweet {
    private String color;

    public Candy(String name, int weight, int cost, String color) {
        super(name, weight, cost);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
