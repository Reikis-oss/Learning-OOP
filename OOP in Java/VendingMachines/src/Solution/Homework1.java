package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework1 {

        public static void main() {
                VendingMachine vendingMachine = new VendingMachine();

                List<Product> products = new ArrayList<>(Arrays.asList(new Product("pepsi", 42),
                                new Product("chocolate", 67), new Product("cola", 70)));
                vendingMachine.intProduct(products);

                products.add(new Product("chocolate", 507));

                List<Product> listProduct = vendingMachine.getProduct("chocolate");

                for (Product p : listProduct) {
                        System.out.println(p.toString());
                }
        }
}
