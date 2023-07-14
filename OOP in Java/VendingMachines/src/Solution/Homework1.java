package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework1 {

        public static void main() {
                VendingMachine vendingMachine = new VendingMachine();

                List<HotDrink> hotDrink = new ArrayList<>(Arrays.asList(new HotDrink("milk", 42, 60),
                                new HotDrink("hot chocolate", 67, 70), new HotDrink("coffee", 70, 98)));
                vendingMachine.intHotDrink(hotDrink);

                List<HotDrink> listHotDrink = vendingMachine.getHotDrink("hot chocolate");

                for (HotDrink p : listHotDrink) {
                        System.out.println(p.toString());
                }
        }
}
