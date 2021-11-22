package Observer;

public class main {
    public static void main(String[] args) {
        Product iphone=new Product("iphone");
        Person loay = new Person(" loay ");
        Person samy = new Person(" samy ");
        iphone.add(loay);
        iphone.add(samy);

        iphone.setAvailability(true);

    }
}
