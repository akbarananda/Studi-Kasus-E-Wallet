import java.util.Scanner;

public class User {

    String nama,pin,telp,username,password;
    Dompet dompet;

    public User(String nama, String pin, String telp, String username, String password) {
        this.nama = nama;
        this.pin = pin;
        this.telp = telp;
        this.username = username;
        this.password = password;
        this.dompet = new Dompet();
    }

    public void dataUser(){
        System.out.printf("Nama     : "+nama);
        System.out.printf("Username : "+username);
        System.out.printf("Password : "+password);
        System.out.printf("No Telp  : "+telp);
        System.out.printf("PIN      : "+pin);
        dompet.dataDompet();
    }
}
