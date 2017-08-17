package gifts;

import java.util.List;

public class GiftBox {
    private String boxName;
    private int boxWeight;
    private int boxCost;
    private List<Sweet> sweets;

    public GiftBox(String boxName) {
        this.boxName = boxName;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public int getBoxWeight(List<Sweet> sweets) {
        int boxWeight = 0;
        for (Sweet list : sweets)
            boxWeight += list.getWeight();
        return boxWeight;
    }

    public void setBoxWeight(int boxWeight) {
        this.boxWeight = boxWeight;
    }

    public int getBoxCost(List<Sweet> sweets) {
        int boxCost = 0;
        for (Sweet list : sweets)
            boxCost += list.getCost();
        return boxCost;
    }

    public void setBoxCost(int boxCost) {
        this.boxCost = boxCost;
    }

    public void setSweets(List<Sweet> sweets) {
        this.sweets = sweets;
    }

//    public String printSweets(List<Sweet> sweets){
//        for (Sweet list : sweets)
//            list.toString();
//        return toString();
//    }

    @Override
    public String toString() {
        return String.format("Название подарка: %s, Вес: %s, Стоимость: %s", boxName, boxWeight, boxCost);
    }
}
