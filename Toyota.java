class Toyota extends Cars {
    public Toyota(String model, String tipe, int cc) {
        super("Toyota", model, tipe, cc);
    }

    @Override
    public void drive() {
        System.out.println("Driving Toyota : " + model + " Tipe " + tipe + " (" + cc + "CC) ");
    }
}
