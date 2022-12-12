package productsList;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private final Set<Product> productList = new HashSet<>();

    public Set<Product> getProductList() {
        return productList;
    }

    public double totalCost(Set<Product> productList) {
        double sum = 0;
        for (Product product : productList) {
            sum = sum + product.getCost();
        }
        return sum;
    }

    public void add(Product product) {
        if (productList.contains(product))
            throw new IllegalArgumentException("Такой продукт уже есть!");
        productList.add(product);
    }

    public void remove(Product product) {
        productList.remove(product);
    }


    @Override
    public String toString() {
        return "ProductList{" +
                "productList=" + productList +
                '}';
    }
}
