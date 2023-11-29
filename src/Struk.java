public class Struk {
    Item[] listItems;
    Item[] items = {};

    public Struk(Item[] listItems, int size){
        this.listItems = listItems;
        items = new Item[size];
    }

    public int isExist(String kode){
        for (int i=0; i<listItems.length; i++) {
            if(listItems[i].kode.equals(kode)) return i;
        }
        return -1;
    }

    public int addItem(String kode, int qty){
        int index = isExist(kode);
        if(index > -1){
            for(int i=0; i<items.length; i++){
                if(items[i]==null){
                    Item itemInfo = listItems[index];
                    items[i] = new Item(itemInfo.kode, itemInfo.nama, itemInfo.harga, qty);
                    return 1;
                }
            }
        }
        return -1;
    }

    public void display(){
        System.out.print("\nTOKO SERBA ADA\n" +
                "**************************\n" +
                "No\tKode Barang\t\tNama Barang\t\t\tHarga\t\tJumlah Beli\t\tJumlah Bayar\t\t\n" +
                "===============================================================================================\n");
        double total = 0;
        for (int i=0; i<items.length; i++){
            if(items[i]!=null){
                System.out.print((i+1) + "\t" + items[i].kode + "\t\t\t" + items[i].nama + "\t\t\t\t" + items[i].harga +
                        "\t\t" + items[i].qty + "\t\t\t\t" + items[i].calc() + "\t\t\n");
                total += items[i].calc();
            }
        }
        System.out.print("===============================================================================================\n");
        System.out.print("Total Bayar\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + total);
        System.out.print("\n===============================================================================================\n");
    }

}
