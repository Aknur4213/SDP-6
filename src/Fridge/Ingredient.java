package Fridge;
import Visitors.IngredientVisitor;

public interface Ingredient {
    void accept(IngredientVisitor visitor);
}
