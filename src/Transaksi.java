public class Transaksi {

    String jenisTransaksi,tanggalTransaksi,nominalHarga,totalBayar;

    public Transaksi(String jenisTransaksi, String tanggalTransaksi, String nominalHarga, String totalBayar) {
        this.jenisTransaksi = jenisTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.nominalHarga = nominalHarga;
        this.totalBayar = totalBayar;

        this.tanggalTransaksi = DateString.now();
    }

    public void dataTransaksi(){

        System.out.printf("Jenis Transaksi      : "+jenisTransaksi);
        System.out.printf("Tanggal Transaksi    : "+tanggalTransaksi);
        System.out.printf("Nominal Harga        : "+nominalHarga);
        System.out.printf("Total Bayar          : "+totalBayar);
    }
}
