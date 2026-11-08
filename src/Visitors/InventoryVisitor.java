package Visitors;

import Fridge.Eggs;
import Fridge.Flour;
import Fridge.Milk;
import Fridge.Sugar;

public class InventoryVisitor implements IngredientVisitor {

    @Override
    public void visit(Milk milk) {
        System.out.println("Milk: " + milk.getAmount() + " ml");
    }

    @Override
    public void visit(Sugar sugar) {
        System.out.println("Sugar: " + sugar.getAmount() + " g");
    }

    @Override
    public void visit(Flour flour) {
        System.out.println("Flour: " + flour.getAmount() + " g");
    }

    @Override
    public void visit(Eggs eggs) {
        System.out.println("Eggs: " + eggs.getAmount());
    }
}