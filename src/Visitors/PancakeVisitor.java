package Visitors;

import Fridge.Eggs;
import Fridge.Flour;
import Fridge.Milk;
import Fridge.Sugar;

public class PancakeVisitor implements IngredientVisitor {

    private Milk milk;
    private Sugar sugar;
    private Flour flour;
    private Eggs eggs;

    @Override
    public void visit(Milk milk) {
        this.milk = milk;
    }

    @Override
    public void visit(Sugar sugar) {
        this.sugar = sugar;
    }

    @Override
    public void visit(Flour flour) {
        this.flour = flour;
    }

    @Override
    public void visit(Eggs eggs) {
        this.eggs = eggs;
    }

    public void makePancakes() {

        if (milk == null || sugar == null ||
                flour == null || eggs == null) {
            System.out.println("Missing ingredients!");
            return;
        }

        if (milk.getAmount() >= 200 &&
                sugar.getAmount() >= 20 &&
                flour.getAmount() >= 150 &&
                eggs.getAmount() >= 2) {

            milk.use(200);
            sugar.use(20);
            flour.use(150);
            eggs.use(2);

            System.out.println("5 pancakes created!");

        } else {
            System.out.println("Not enough ingredients!");
        }
    }
}