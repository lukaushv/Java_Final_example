public class Cars {
 private String brand;
 private String model;
 private int year;
 private String owner;

    public Cars(String brand, String model, int year, String owner) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return owner + " has: " + brand + " " + model + " "+ "of Year: "  + String.valueOf(year) ;
    }
}
