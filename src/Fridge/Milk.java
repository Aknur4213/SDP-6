package Fridge;
import Visitors.IngredientVisitor;

public class Milk implements Ingredient {
    private int amount;

    public Milk(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void use(int quantity) {
        amount -= quantity;
    }

    @Override
    public void accept(IngredientVisitor visitor) {
        visitor.visit(this);
    }
}