package chapter12;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //4 (not 5)
        System.out.println(fruit);  //[banana, orange, apple, lemon] unique elements, duplicates ignored.

        System.out.println("ITERATOR WAY");
        var i = fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("ENHANCED LOOP WAY");
        for (String item: fruit){
            System.out.println(item);
        }

        System.out.println("LAMBDA WAY");
//        fruit.forEach(x -> System.out.println(x)); // OR EVEN SHORTER WAY AS BELOW LINE:
        fruit.forEach(System.out::println); // this is another way to print above result
    }

    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
    }

    public static void queueDemo(){

    }

    public static void mapDemo(){
        Map<String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17); // duplicate allowed(not counted), but overrides preceding value.

        System.out.println("mapDemo STARTS HERE:");
        System.out.println(fruitCalories.size()); // 4
        System.out.println(fruitCalories); // {banana=105, orange=45, apple=95, lemon=17}
        System.out.println(fruitCalories.get("lemon")); // 17 (not 20)
        System.out.println(fruitCalories.entrySet()); // [banana=105, orange=45, apple=95, lemon=17]
        fruitCalories.remove("orange");
        System.out.println(fruitCalories); // {banana=105, apple=95, lemon=17}

        for (var entry:fruitCalories.entrySet()){
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }

        System.out.println("\n*******************");
        fruitCalories.forEach((k,v) -> System.out.println("Fruit: "+ k+ ", Calories: " + v));
    }
}
