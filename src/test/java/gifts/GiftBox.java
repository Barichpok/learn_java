package gifts;

public class GiftBox {
    private String boxName;
    private int boxWeight;
    private int boxCost;

    public GiftBox(String boxName, int boxWeight, int boxCost) {
        this.boxName = boxName;
        this.boxWeight = boxWeight;
        this.boxCost = boxCost;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public int getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(int boxWeight) {
        this.boxWeight = boxWeight;
    }

    public int getBoxCost() {
        return boxCost;
    }

    public void setBoxCost(int boxCost) {
        this.boxCost = boxCost;
    }
}
