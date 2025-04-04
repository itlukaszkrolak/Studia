package zajzd1OOP;
import java.util.Map;

public class Orders {
    private int id;
    private Client client;
    private Map<Product, Integer> productsAndQuantity;
    private String date;
    private String status;

    public Orders(int id, Client client, Map<Product,Integer> productsAndQuantity, String date, String status) {
        this.id = id;
        this.client = client;
        this.productsAndQuantity = productsAndQuantity;
        this.date = date;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Product, Integer> getProductsAndQuantity() {
        return productsAndQuantity;
    }

    public void setProductsAndQuantity(Map<Product, Integer> productsAndQuantity) {
        this.productsAndQuantity = productsAndQuantity;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", client=" + client +
                ", productsAndQuantity=" + productsAndQuantity +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public double getOrderPrice() {
        double price = 0;
        for (Map.Entry<Product, Integer> entry : productsAndQuantity.entrySet()) {
            price += entry.getKey().getPrice() * entry.getValue();
        }

        return price;
    }

    public double getDiscount() {
        double priceAfterDiscount = getOrderPrice();
        if (getClient().isOurRegularCustomer()) {
            priceAfterDiscount -= priceAfterDiscount / 10;
        }
        return priceAfterDiscount;

    }


    public void getDetailsOfOrderInfo() {
        System.out.println("Order info: ");
        System.out.println("Order id: " + getId());
        System.out.println("Client: " + getClient()  + "\n");
        System.out.println("Ordered Products: ");
        for (Map.Entry<Product, Integer> entry : productsAndQuantity.entrySet()) {
            System.out.println(entry.getKey() + "*" + entry.getValue() + " = " + entry.getKey().getPrice());
        }
        System.out.println();
        if (client.isOurRegularCustomer()) {
            System.out.println("Final price: " + getOrderPrice());
            System.out.println("Discount - 10% ");
            System.out.println("Price after discount: " + getDiscount());
        } else {
            System.out.println("Final price: " + getOrderPrice());
        }
    }
}
