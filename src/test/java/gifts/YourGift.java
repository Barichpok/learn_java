package gifts;

//Формируется новогодний подарок. Он включает в себя
//разные сладости (Candy, Jellybean, etc.) У каждой сладости есть
//название, вес, цена и свой уникальный параметр. Необходимо
//собрать подарок из сладостей. Найти общий вес подарка, общую
//стоимость подарка и вывести информацию о всех
//сладостях в подарке.
//Общая стоимость и общий вес.

import java.util.ArrayList;
import java.util.List;

public class YourGift {
    public static void main(String[] args) {
        Sweet Snickers = new Candy("Snickers", 45, 55, "brown");
        Sweet Twix = new Candy("Twix", 40, 40, "gold");
        Sweet Mars = new Candy("Mars", 35, 45, "black");
        Sweet Nuts = new Candy("Nuts", 50, 50, "yellow");

        GiftBox Box = new GiftBox("Новогодний");

        List<Sweet> sweets = new ArrayList<>();
        sweets.add(Snickers);
        sweets.add(Twix);
        sweets.add(Mars);
        sweets.add(Nuts);

        System.out.println("Название подарка: " + Box.getBoxName());
        System.out.println("Общий вес подарка: " + Box.getBoxWeight(sweets));
        System.out.println("Общая стоимость подарка: " + Box.getBoxCost(sweets));
    }
}
