package Visitors;

import Fridge.Eggs;
import Fridge.Flour;
import Fridge.Milk;
import Fridge.Sugar;

public interface IngredientVisitor {
    void visit(Milk milk);
    void visit(Sugar sugar);
    void visit(Flour flour);
    void visit(Eggs eggs);
}
