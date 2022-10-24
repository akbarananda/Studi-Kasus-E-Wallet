import java.util.Scanner;

public class Saldo {

    int saldo = 0;

    public Saldo() {
    }

    public void tambahSaldo(int nominal){

        saldo += nominal;
    }

    public void AmbilSaldo(int nominal){


    }

    public void dataSaldo(){

        System.out.printf("Saldo : "+saldo);
    }
}
