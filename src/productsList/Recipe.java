package productsList;

import java.util.Objects;

public class Recipe {

    private String name;
    private ProductList productList;
    private double cost;

    public Recipe(String name, ProductList productList, double cost) {
        setName(name);
        setProductList(productList);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", productList=" + productList +
                ", cost=" + cost +
                '}';
    }
}
