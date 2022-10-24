import java.util.Scanner;
public class Dompet {

        int pemasukan=0;
        int pengeluaran=0;
        Saldo saldo = new Saldo();

        public Dompet() {
        }

        public void dataDompet(){

                saldo.dataSaldo();
                System.out.printf("Pemasukan   : "+pemasukan);
                System.out.printf("Pengeluaran : "+pengeluaran);
        }
}
