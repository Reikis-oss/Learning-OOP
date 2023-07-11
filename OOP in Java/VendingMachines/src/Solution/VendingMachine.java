package Solution;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public void intProduct(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProduct(String name) {
        List<Product> listProduct = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getName().equals(name)) {
                listProduct.add(p);
                
            }

        }
        
        if (listProduct.size() == 0) {
            listProduct.add(new Product("Данного продукта не существует", 0));
        }

        return listProduct;
    }
}
