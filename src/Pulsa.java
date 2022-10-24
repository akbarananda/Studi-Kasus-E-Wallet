import java.util.Scanner;

public class Pulsa {

  private VoucherPulsa vPulsa;
  private String kodeVoucher;

  public Pulsa(VoucherPulsa vPulsa, int totalBayar){
      this.vPulsa = vPulsa;
      this.kodeVoucher = NumericString.generate(16);
  }

  public void dataPulsa(){
      System.out.println("Nominal Pulsa : "+vPulsa.title);
      System.out.println("Harga Pulsa   : "+vPulsa.harga);
      System.out.println("Voucher       : "+kodeVoucher);
  }
}
