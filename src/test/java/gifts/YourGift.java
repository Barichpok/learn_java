package gifts;

//Формируется новогодний подарок. Он включает в себя
//разные сладости (Candy, Jellybean, etc.) У каждой сладости есть
//название, вес, цена и свой уникальный параметр. Необходимо
//собрать подарок из сладостей. Найти общий вес подарка, общую
//стоимость подарка и вывести информацию о всех
//сладостях в подарке.

public class YourGift {
    public static void main(String[] args) {
        Sweets Snickers = new Sweets("Snickers", 45, 55, "brown");
        Sweets Twix = new Sweets("Twix", 40, 40, "gold");
        Sweets Mars = new Sweets("Mars", 35, 45, "black");
        Sweets Nuts = new Sweets("Nuts", 50, 50, "yellow");

        GiftBox Box = new GiftBox("Новогодний", 10, 200);

        System.out.println("Название подарка: " + Box.getBoxName());
        System.out.println("Общий вес подарка: " + (Snickers.getWeight() + Twix.getWeight() + Mars.getWeight() + Nuts.getWeight() + Box.getBoxWeight()) + " грамм");
        System.out.println("Общая стоимость подарка: " + (Snickers.getCost() + Twix.getCost() + Mars.getCost() + Nuts.getCost() + Box.getBoxCost()) + " рублей");
        System.out.println("В подарке \"" + Box.getBoxName() + "\" содержится: " + Snickers.getName() + ", " + Twix.getName() + ", " + Mars.getName() + ", " + Nuts.getName());
    }
}
