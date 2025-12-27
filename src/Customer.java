public class Customer {
    private String fullName;
    private String email;
    private int loyaltyPoints;
    private boolean isMember;

    public Customer() {
        this.fullName = "Guest";
        this.email = "N/A";
        this.loyaltyPoints = 0;
        this.isMember = false;
    }

    public Customer(String fullName, String email, int loyaltyPoints, boolean isMember) {
        this.fullName = fullName;
        this.email = email;
        this.loyaltyPoints = loyaltyPoints;
        this.isMember = isMember;
    }

    public void addPoints(double purchaseAmount) {
        this.loyaltyPoints += (int) (purchaseAmount / 10);
    }

    public void upgradeMembership() {
        this.isMember = true;
        System.out.println(fullName + " is now a VIP member!");
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
    public boolean isMember() { return isMember; }
    public void setMember(boolean member) { isMember = member; }
}