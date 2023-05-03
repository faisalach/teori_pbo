class Honda extends Cars {
    public Honda(String model, String tipe, int cc) {

        super("Honda", model, tipe, cc);
    }

    @Override
    public void drive() {
        System.out.println("Driving Honda : " + model + " Tipe " + tipe + " (" + cc + "CC) ");
    }
}
