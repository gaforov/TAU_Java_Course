package chapter10;

public class Apple extends Fruit {

    public Apple(){
        setCalories(235);
    }

    public void removeSeeds(){
        System.out.println("Apple seeds have been removed.");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is ready!");
    }
}
