package Praktikum14;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        for (String temp : fruits){
            System.out.println(temp);
        }

        System.out.println("First : " + fruits.first());
        System.out.println("Last : " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("\nSetelah remove " + fruits);

        fruits.pollFirst();
        System.out.println("\nSetelah poll first " + fruits);

        fruits.pollLast();
        System.out.println("\nSetelah poll last " + fruits);
    }
}
