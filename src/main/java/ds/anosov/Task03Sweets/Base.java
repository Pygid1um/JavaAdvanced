package ds.anosov.Task03Sweets;

public class Base {
    private String nameOfSweet;
    private double weightOfSweet;
    private double priceOfSweet;

    public Base(String nameOfSweet, double weightOfSweet, double priceOfSweet) {
        this.nameOfSweet = nameOfSweet;
        this.weightOfSweet = weightOfSweet;
        this.priceOfSweet = priceOfSweet;
    }

    public String getNameOfSweet() {
        return nameOfSweet;
    }

    public void setNameOfSweet(String nameOfSweet) {
        this.nameOfSweet = nameOfSweet;
    }

    public double getWeightOfSweet() {
        return weightOfSweet;
    }

    public void setWeightOfSweet(double weightOfSweet) {
        this.weightOfSweet = weightOfSweet;
    }

    public double getPriceOfSweet() {
        return priceOfSweet;
    }

    public void setPriceOfSweet(double priceOfSweet) {
        this.priceOfSweet = priceOfSweet;
    }

    @Override
    public String toString() {
        return "Название: " + nameOfSweet + ", вес = " + weightOfSweet + ", цена = " + priceOfSweet;
    }
}
