package May12.Guided.driver;

import hargatoken.KelasToken;
import hargabuku.KelasHarga;


public class TestPackage {
    public static void main(String[] args) {
        KelasToken token = new KelasToken();
        KelasHarga harga = new KelasHarga();
        token.info();
        harga.info();
    }
}
