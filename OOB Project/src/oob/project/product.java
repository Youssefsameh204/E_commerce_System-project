package oob.project;

public class product {

   protected int productId;
    protected String name;
    protected float price;

    public product() {
    }

    public product(int productId, String name, float price) {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = Math.abs(productId);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }
}
