package Factory;

abstract class Price {
    protected double price;
    abstract void setPrice();

    public void calculatePrice(double weight) {
        System.out.println(price*weight);
    }
}
