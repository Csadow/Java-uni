public class Order {
    private int orderId;
    private ClothingItem item;
    private Customer customer;
    private String status;

    public Order() {
        this.orderId = 0;
        this.status = "Pending";
    }

    public Order(int orderId, ClothingItem item, Customer customer, String status) {
        this.orderId = orderId;
        this.item = item;
        this.customer = customer;
        this.status = status;
    }

    public void processOrder() {
        this.status = "Processed";
        customer.addPoints(item.getPrice());
        System.out.println("Order " + orderId + " processed for " + customer.getFullName());
    }

    public void printInvoice() {
        System.out.println("--- INVOICE ---");
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Item: " + item.getName());
        System.out.println("Total: $" + item.getPrice());
        System.out.println("Status: " + status);
    }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public ClothingItem getItem() { return item; }
    public void setItem(ClothingItem item) { this.item = item; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}