package ds.anosov.Task03Sweets;

public class Cake extends Base{
    private String sizeOfCake;

    public Cake(String nameOfSweet, double weightOfSweet, double priceOfSweet, String sizeOfCake) {
        super(nameOfSweet, weightOfSweet, priceOfSweet);
        this.sizeOfCake = sizeOfCake;
    }

    public String getSizeOfCake() {
        return sizeOfCake;
    }

    public void setSizeOfCake(String sizeOfCake) {
        this.sizeOfCake = sizeOfCake;
    }

    @Override
    public String toString() {
        return "Cake [" + super.toString() + ", size = " + sizeOfCake + "]";
    }
}
