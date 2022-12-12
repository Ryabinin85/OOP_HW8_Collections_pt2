package productsList;

import java.util.Objects;

public class Product {
    private String name;
    private double value;
    private double cost;

    public Product(String name, double value, double cost) {
        setName(name);
        setValue(value);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public Double getCost() {
        return cost;
    }

    public void setName(String name) {
        if (name == null && name.isEmpty() && name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public void setValue(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.value = value;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " " + value + " " + cost;
    }
}
