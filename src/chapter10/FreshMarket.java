package chapter10;

public class FreshMarket {

    public static void main(String[] args) {

        Fruit apple = new Fruit();
        apple.getCalories();
        apple.makeJuice();
        //((Apple)apple).removeSeeds(); //ClassCastException

        Fruit apple2 = new Apple();
        System.out.println(apple2.getCalories());
        ((Apple)apple2).removeSeeds();
        apple2.makeJuice();

        Banana banana = new Banana();
        Fruit orange = new Fruit();

        System.out.println("===================");
        squeeze(apple);
        squeeze(apple2);
        squeeze(banana);
        squeeze(orange);
    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
