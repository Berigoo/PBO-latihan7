import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        Item listItem[] = {new Item("a001", "Buku", 3000),
        new Item("a002", "Pensil", 4000),
        new Item("a003", "Pullpen", 5000),
        new Item("a004", "Penghapus", 6000),
        new Item("a005", "Pengserut", 7000),
        new Item("a006", "Penggaris", 8000)};

        System.out.print("\nTOKO SERBA ADA\n" +
                "**************************\n" +
                "Masukan Item Barang\t\t : ");
        int s = input.nextInt();
        input.nextLine();
        if(s < 1){
            System.out.println("\nnext time, lebih dari 0!\n");
            return;
        }
        Struk struk = new Struk(listItem, s);

        for (int i=0; i<s; i++){
            System.out.print("\nData ke " + (i+1) +
                    "\nMasukan Kode\t\t\t : ");
            String kode = input.nextLine();
            System.out.print("Masukan jumlah Beli\t\t : ");
            int jml = input.nextInt();
            input.nextLine();
            if(struk.addItem(kode, jml) < 0){
                System.out.println("\nKode Invalid...\n\n");
                i--;
            }
        }

        struk.display();
    }
}