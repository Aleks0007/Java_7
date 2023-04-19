public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Барсик", 5),
            new Cat("Мурзик", 10),
            new Cat("Рыжик", 15)
        };
        
        Plate plate = new Plate(20);
        System.out.println("Изначально в тарелке еды: " + plate.getFood());
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " насытился: " + cat.isSatisfied());
        }
        
        System.out.println("В тарелке после приёма пищи: " + plate.getFood());
        System.out.println("Пополняем тарелку...");
        plate.addFood(25);
        System.out.println("В тарелке после пополнения: " + plate.getFood());
    }
}
