package OOP.week5_day2.patterns.taskAdaptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 11/6/2016.
 */
public class MakingDrink {
    private int totalCost;
    enum Drinks {ESPRESSO, LATTE, BLACK_COFFE};
    private static List<Moloko> milk = new ArrayList<>();
    private static List<Sugar> sugar = new ArrayList<>();
    private static List<Chokolate> chokolates = new ArrayList<>();
    Drinks drink;

    public MakingDrink(List<Moloko> milk, List<Sugar> sugar,
                       List<Chokolate> chokolates,Drinks drink ) {
        this.milk = milk;
        this.sugar = sugar;
        this.chokolates = chokolates;
        this.drink = drink;
    }


}
