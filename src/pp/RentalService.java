package pp;

public class RentalService {
    //1. constanta
    private static final double DAILY_RATE = 50.0;
    private static final double DISCOUNT_RATE = 0.1;

    private int rentalDays;
    private boolean isMember;

//3. getter seeter
    public RentalService(int rentalDays, boolean isMember) {
        this.rentalDays = rentalDays;
        this.isMember = isMember;
    }


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

// membedakan class
    private double calculateDiscount() {
        return isMember ? DISCOUNT_RATE : 0;
    }

// 4. ekstra logika
    private double calculateTotal() {
        double subtotal = rentalDays * DAILY_RATE;
        return subtotal - (subtotal * calculateDiscount());
    }


    public void printInvoice() {
        System.out.println("Total Rental Cost: " + " RP" + calculateTotal());
    }//Extract Method:


    public static void main(String[] args) {
        RentalService rental = new RentalService(7, true);  // 7 hari, member
        rental.printInvoice();
    }
//2. rename print total menjadi print voice
    public void printTotal() {
    }
}


