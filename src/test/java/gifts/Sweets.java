package gifts;

public class Sweets {
    private String name;
    private int weight;
    private int cost;
    private String color;

    public Sweets(String name, int weight, int cost, String color) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
