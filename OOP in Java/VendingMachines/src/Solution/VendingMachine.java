package Solution;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    private List<HotDrink> hotDrink = new ArrayList<>();

    public void intProduct(List<Product> products) {
        this.products = products;
    }

    public void intHotDrink(List<HotDrink> hotDrink) {
        this.hotDrink = hotDrink;
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

    public List<HotDrink> getHotDrink(String name) {
        List<HotDrink> listHotDrink = new ArrayList<>();
        for (int i = 0; i < hotDrink.size(); i++) {
            HotDrink hD = hotDrink.get(i);
            if (hD.getName().equals(name)) {
                listHotDrink.add(hD);
                
            }

        }
        
        if (listHotDrink.size() == 0) {
            listHotDrink.add(new HotDrink("Данного продукта не существует", 0,0));
        }

        return listHotDrink;
    }
}
