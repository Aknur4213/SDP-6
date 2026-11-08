package Fridge;

import Visitors.IngredientVisitor;

public class Sugar implements Ingredient {
    private int amount;

    public Sugar(int amount) {
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