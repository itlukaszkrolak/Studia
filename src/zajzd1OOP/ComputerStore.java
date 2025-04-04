package zajzd1OOP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ComputerStore {
    private static List<Product> products = new ArrayList<>();
    private static List<Client> clients = new ArrayList<>();
    private static List<Orders> orders = new ArrayList<>();
    private static int numberOfOrder = 1;


    public static void addProduct(List<Product> productList) {
        products.addAll(productList);
    }

    public static void addClient(List<Client> clientList) {
        clients.addAll(clientList);
    }

    public static Orders creatingOrder(Client client, Map<Product, Integer> orderWithQuantity) {
        Orders newOrder = new Orders(numberOfOrder++, client, orderWithQuantity, String.valueOf(LocalDate.now()), "New");
        orders.add(newOrder);
        Product.actualizingStorage(orderWithQuantity);
        return newOrder;
    }
}