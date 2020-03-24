package at.xxx.examples.cars;

public class Producer {
    private String name;
    private String country;
    private double discountInPercent;


    public Producer(String name, String country, double discountInPercent) {
        this.name = name;
        this.country = country;
        this.discountInPercent = discountInPercent;
    }

    public double getDiscountInPercent() {
        return discountInPercent;
    }

    @Override
    public String toString() {
        return "\nProducer: " + name +
                "\nMade in: " + country +
                "\nDiscount: " + discountInPercent + "%";
    }
}
