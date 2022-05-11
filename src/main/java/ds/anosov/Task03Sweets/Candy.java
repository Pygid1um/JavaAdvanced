package ds.anosov.Task03Sweets;

public class Candy extends Base {
    private String packageOfCandy;
    public Candy(String nameOfSweet, double weightOfSweet, double priceOfSweet, String packageOfCandy) {
        super(nameOfSweet, weightOfSweet, priceOfSweet);
        this.packageOfCandy = packageOfCandy;
    }

    public String getPackageOfCandy() {
        return packageOfCandy;
    }

    public void setPackageOfCandy(String packageOfCandy) {
        this.packageOfCandy = packageOfCandy;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", package = " + packageOfCandy + "]";
    }
}
