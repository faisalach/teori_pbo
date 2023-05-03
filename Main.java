public class Main {
    public static void main(String[] args) {
        Toyota car1 = new Toyota("Agya", "GR Sport", 1200);
        Honda car2 = new Honda("Civic Turbo", "RS", 1500);
        Subaru car3 = new Subaru("BRZ", "STI", 2400);

        car1.drive();
        car2.drive();
        car3.drive();
    }
}
