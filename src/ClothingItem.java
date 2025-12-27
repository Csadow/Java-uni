public class ClothingItem {
    private String name;
    private String category;
    private String size;
    private double price;

    public ClothingItem() {
        this.name = "Unknown Item";
        this.category = "General";
        this.size = "M";
        this.price = 0.0;
    }

    public ClothingItem(String name, String category, String size, double price) {
        this.name = name;
        this.category = category;
        this.size = size;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }

    public String getDescription() {
        return name + " (" + category + ") - Size: " + size + " - $" + price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}