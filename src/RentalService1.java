
public class RentalService1 {

    //Jumlah hari penyewaan.

    public int days;

    //Status keanggotaan pelanggan. Jika bernilai true, pelanggan akan mendapatkan diskon khusus anggota.

    public boolean member;

    //Konstruktor untuk menginisialisasi objek RentalService1 dengan durasi hari dan status keanggotaan.

     //@param days   jumlah hari penyewaan
     //@param member status keanggotaan pelanggan

    public RentalService1(int days, boolean member) {
        this.days = days;
        this.member = member;
    }

    //Menghitung dan menampilkan total biaya sewa berdasarkan jumlah hari dan status keanggotaan.
    // Jika pelanggan adalah anggota, mereka mendapatkan diskon 10%.

    public void printTotal() {
        double rate = 50.0;  // Tarif sewa per hari
        double discount = 0;

        // Menetapkan diskon jika pelanggan adalah anggota
        if (member) {
            discount = 0.1;  // Diskon 10% untuk anggota
        }

        // Menghitung subtotal dan total setelah diskon
        double subtotal = days * rate;
        double total = subtotal - (subtotal * discount);

        // Menampilkan total biaya sewa
        System.out.println("Total Rental Cost: " + total + " USD");
    }

    //Metode utama untuk menjalankan contoh layanan penyewaan.
     //@param args argumen baris perintah (tidak digunakan dalam program ini)

    public static void main(String[] args) {
        // Membuat objek RentalService1 dengan 7 hari penyewaan untuk anggota
        RentalService1 rental = new RentalService1(7, true);
        rental.printTotal();  // Memanggil metode untuk mencetak total biaya sewa
    }
}
