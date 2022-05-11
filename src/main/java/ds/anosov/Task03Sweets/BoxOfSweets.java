package ds.anosov.Task03Sweets;

public class BoxOfSweets {
    public static void main(String[] args) {
        Cake cake = new Cake("Прага", 600, 749.9, "Маленький");
        Candy candy = new Candy("Барбарис", 2.3, 0.4, "Простая");
        Chocolate chocolate = new Chocolate("Пикник", 55, 69, "Молочный");
        Base[] boxOfSweets = {cake, candy, chocolate};

        for (Base someBase: boxOfSweets) {
            System.out.println(someBase.toString());
        }
            double totalSum = 0;
            double totalWeight = 0;

            //Поиск общего веса подарка, стоимость подарка
            for (int i = 0; i < boxOfSweets.length; i++) {
                totalSum = totalSum + boxOfSweets[i].getPriceOfSweet();
                totalWeight = totalWeight + boxOfSweets[i].getWeightOfSweet();
            }

            System.out.println("Общая стоимость подарка: " + totalSum);
            System.out.println("Общий вес подарка: " + totalWeight);
    }
}
