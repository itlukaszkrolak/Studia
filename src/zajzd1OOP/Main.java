package zajzd1OOP;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Products
        Product firstProduct = new Product(1, "iiyama G-Master G2466HSU", "Monitor", 699.99, 10);
        Product secondProduct = new Product(2, "SPC GEAR LIX PLUS SPGO79", "Computer Mouse", 259.99, 10);
        Product thirdProduct = new Product(3, "RAZER ORNAT CHROME", "KeyBoard", 499.99, 10);

        List<Product> listOfProducts = Arrays.asList(firstProduct, secondProduct, thirdProduct);
        ComputerStore.addProduct(listOfProducts);

        System.out.println("\n\n");

        //Clients
        Client firstClient = new Client(1, "Lukasz", "Krolak", "s3377@pjwstk.edu.pl", true);
        Client secondClient = new Client(2, "Maciej", "Mroz", "fastRabit123@gmail.com", false);
        Client thirdClient = new Client(3, "Mateusz", "Gamrot", "gamerUFCChamp@wp.pl", false);

        List<Client> listOfClients = Arrays.asList(firstClient, secondClient, thirdClient);
        ComputerStore.addClient(listOfClients);

        //Creating Orders - key is how many items of value which is actually product you want, so k1 = 2 , v1 = first product means 2 * iiyama G-Master G2466HSU

        Map<Product, Integer> firstOrder = new HashMap<>(Map.of(
                firstProduct, 2,
                secondProduct, 1,
                thirdProduct, 3

        ));
        ComputerStore.creatingOrder(firstClient, firstOrder).getDetailsOfOrderInfo();

        Map<Product, Integer> secondOrder = new HashMap<>(Map.of(
                thirdProduct, 4,
                secondProduct, 1,
                firstProduct, 2

        ));
        ComputerStore.creatingOrder(secondClient, secondOrder).getDetailsOfOrderInfo();


    }


}
