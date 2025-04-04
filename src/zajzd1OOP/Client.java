package zajzd1OOP;

public class Client {

    private int id;
    private String name;
    private String surname;
    private String email;
    private boolean isRegularCustomer;

    public Client(int id, String name, String surname, String email, boolean isRegularCustomer) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.isRegularCustomer = isRegularCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  boolean isOurRegularCustomer() {
        return isRegularCustomer;
    }

    public void setRegularCustomer(boolean regularCustomer) {
        isRegularCustomer = regularCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", isRegularCustomer=" + isRegularCustomer +
                '}';
    }



    public void getClientInfo() {
        System.out.println("Client info: ");
        System.out.println("Client id: " + getId());
        System.out.println("Client name: " + getName());
        System.out.println("Client surname: " + getSurname());
        System.out.println("Client email: " + getEmail());
        System.out.println("Is this our regular client: " + isOurRegularCustomer());
    }
}
