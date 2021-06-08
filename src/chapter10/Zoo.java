package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        System.out.println("====================");
        //Polymorphism way
        Animal sasha = new Dog();
        sasha.makeSound();  //Woof
        feed(sasha);

        //real/full polymorphism
        sasha = new Cat();
        sasha.makeSound(); //Meow
        ((Cat)sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Feed dog food");
        }
        else if (animal instanceof Cat){
            System.out.println("Feed cat food");
        }
    }
}
