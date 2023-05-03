abstract class Cars {
    String brand;
    String model;
    String tipe;
    int cc;

    public Cars(String brand, String model, String tipe, int cc) {
        this.brand = brand;
        this.model = model;
        this.tipe = tipe;
        this.cc = cc;
    }

    public abstract void drive();
}