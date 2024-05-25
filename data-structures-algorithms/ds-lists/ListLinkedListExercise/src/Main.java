import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> shoppingList = new LinkedList<>();

        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");

        System.out.println(shoppingList);

        shoppingList.add(1, "mango");

        System.out.println(shoppingList);

        shoppingList.removeFirst();

        System.out.println(shoppingList);

    }
}