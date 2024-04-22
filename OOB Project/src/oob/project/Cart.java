package oob.project;

public class Cart {

    private int customerId, nProducts;
    private float totalPrice = 0;
    product[] products ;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
            products = new product[nProducts];

    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public void addProduct(product a, int i) {
        if (i >= 0 && i < nProducts) {
            products[i] = a;
            calculatePrice(a);
        } else {
            System.out.println("invalid index");
        }
    }

    public void removeProduct(product a, int i) {
        if (i >= 0 && i < nProducts) {
            products[i] = null;
        } else {
            System.out.println("invalid index");
        }
    }

    public void calculatePrice(product a) {
        totalPrice = totalPrice + a.getPrice();
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public boolean placeOrder(int verify) {
        if (verify == 1) {
            return true;
        } else {
            return false;
        }
    }

}
