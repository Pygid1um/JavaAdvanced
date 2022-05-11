package ds.anosov.Task03Sweets;

public class Chocolate extends Base{

    private String colorOfChocolate;

    public Chocolate(String nameOfSweet, double weightOfSweet, double priceOfSweet, String colorOfChocolate) {
        super(nameOfSweet, weightOfSweet, priceOfSweet);
        this.colorOfChocolate = colorOfChocolate;
    }

    public String getColorOfChocolate() {
        return colorOfChocolate;
    }

    public void setColorOfChocolate(String colorOfChocolate) {
        this.colorOfChocolate = colorOfChocolate;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", color = " + colorOfChocolate + "]";
    }
}
