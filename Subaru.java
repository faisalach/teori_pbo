class Subaru extends Cars {
    public Subaru(String model, String tipe, int cc) {
        super("Subaru", model, tipe, cc);
    }

    @Override
    public void drive() {
        System.out.println("Driving Subaru : " + model + " Tipe " + tipe + " (" + cc + "CC) ");
    }
}
