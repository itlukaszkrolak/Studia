package zajzd1OOP;

import java.util.Map;

public class Product {
    private int id;
    private String nameOfProduct;
    private String category;
    private double price;
    private int amountOfStorage;

    public Product(int id, String nameOfProduct, String category, double price, int amountOfStorage) {
        this.id = id;
        this.nameOfProduct = nameOfProduct;
        this.category = category;
        this.price = price;
        this.amountOfStorage = amountOfStorage;

    }
    public static void actualizingStorage(Map<Product, Integer> order) {
        for (Map.Entry<Product, Integer> entry : order.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            product.setAmountOfStorage(product.getAmountOfStorage() - quantity);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountOfStorage() {
        return amountOfStorage;
    }

    public void setAmountOfStorage(int amountOfStorage) {
        this.amountOfStorage = amountOfStorage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", amountOfStorage=" + amountOfStorage +
                '}';
    }

    public void getProductInfo() {
        System.out.println("Product info: ");
        System.out.println("Product id: " + getId());
        System.out.println("Name of product: " + getNameOfProduct());
        System.out.println("Product category: " + getCategory());
        System.out.println("Product price: " + getPrice());
        System.out.println("Amount of product in storage: " + getAmountOfStorage());

    }
}
