public class Item {
    String kode;
    String nama;
    double harga;
    int qty = 0;

    public Item(String kode, String nama, double harga){
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
    }
    public Item(String kode, String nama, double harga, int qty){
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
        this.qty = qty;
    }
    public double calc(int qty){
        return harga * qty;
    }
    public double calc(){
        if(qty != 0) {
            return harga * qty;
        }
        return -1;
    }
}
