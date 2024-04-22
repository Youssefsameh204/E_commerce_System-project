package oob.project;

public class Order {

   private int customerId, nProducts;
   private static int orderId = 0;
   private product[] products = new product[nProducts];
   private float totalPrice;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public Order(Cart a) {
        orderId++;
        products=a.getProducts();
    }   

    public void printOrderInfo(Cart a){
        System.out.println("Here's your order's summary : ");
        System.out.println("Order Id : " + orderId);
        System.out.println("Customer Id : " + customerId);
        System.out.println("Products ");
        for(int i = 0; i < a.products.length; i++) {
            System.out.println(a.products[i].name + " _$ " + products[i].getPrice());
        }
        System.out.println("Total price : $" + totalPrice);

    }

}
