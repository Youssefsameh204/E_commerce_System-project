package oob.project;

public class ElectronicProduct extends product {

 private   String brand;
  private  int warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String brand, int warrantyPeriod, int productId, String name, float price) {
        super(productId, name, price);
        setBrand(brand);
        setWarrantyPeriod(warrantyPeriod);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

}
