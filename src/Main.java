import Fridge.*;
import Visitors.InventoryVisitor;
import Visitors.PancakeVisitor;

public class Main {
    public static void main(String[] args) {

        Milk milk = new Milk(500);
        Sugar sugar = new Sugar(100);
        Flour flour = new Flour(400);
        Eggs eggs = new Eggs(6);

        Ingredient[] ingredients = {milk, sugar, flour, eggs};

        InventoryVisitor inventory = new InventoryVisitor();
        for (Ingredient ingredient : ingredients) {
            ingredient.accept(inventory);
        }

        PancakeVisitor pancake = new PancakeVisitor();
        for (Ingredient ingredient : ingredients) {
            ingredient.accept(pancake);
        }

        pancake.makePancakes();

        System.out.println("Remaining ingredients:");
        for (Ingredient ingredient : ingredients) {
            ingredient.accept(inventory);
        }
    }
}