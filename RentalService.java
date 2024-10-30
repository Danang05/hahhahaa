class RentalService {
    private static final double DAILY_RATE = 50.0; // Introduce Constant
    private static final double DISCOUNT_RATE = 0.1; // Introduce Constant

    private int rentalDays;  // Encapsulate Field
    private boolean isMember;  // Encapsulate Field

    // Constructor
    public RentalService(int rentalDays, boolean isMember) {
        this.rentalDays = rentalDays;
        this.isMember = isMember;
    }

    // Getter dan Setter (Encapsulate Field)
    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    // Extract Method: Hitung diskon
    private double calculateDiscount() {
        return isMember ? DISCOUNT_RATE : 0;
    }

    // Extract Method: Hitung total biaya
    private double calculateTotal() {
        double subtotal = rentalDays * DAILY_RATE;
        return subtotal - (subtotal * calculateDiscount());  // Replace Temp with Query
    }

    // Rename Variable: printTotal menjadi printInvoice
    public void printInvoice() {
        System.out.println("Total Rental Cost: " + calculateTotal() + " USD");
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        RentalService rental = new RentalService(7, true);  // 7 hari, member
        rental.printInvoice();
    }
}
{
}
