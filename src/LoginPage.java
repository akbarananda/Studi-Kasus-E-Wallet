import java.util.Scanner;

public class LoginPage {
    Scanner scanner = new Scanner(System.in);

    public LoginPage(){
        run();

    }
   void run(){
        String str = """
                1. Login
                2. Register
                3. Keluar
                """;
        int menu = -1;

        do {
            System.out.printf(str);
            System.out.printf("Piih : ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu){
                case 1:
                    loginMenu();
                    break;
                case 2:
                    registerMenu();
                    break;
                case 3:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan salah !");
                    break;
            }
            System.out.println();
        }while (menu != 0);
   }

   void registerMenu(){
        String nama, username, password, telp, pin;

        do {
            System.out.println("\n------[DAFTAR AKUN]------");
            System.out.printf("Nama     : ");
            nama = scanner.nextLine();

            System.out.printf("USername : ");
            username = scanner.nextLine();

            System.out.printf("No Telp  : ");
            telp = scanner.nextLine();

            System.out.printf("Password : ");
            password = scanner.nextLine();

            System.out.printf("PIN      : ");
            pin = scanner.nextLine();

            User userBaru = new User(nama,pin,telp,username,password);

            if (EWallet.registrasiUser(userBaru)) {
                System.out.println("Berhasil Daftar Akun !");
                break;
            } else {
                System.out.println("Akun sudah terdaftar !");
            }
        }while (true);
   }

   void loginMenu(){
        String username, password;
        boolean status = false;

        do {
            System.out.println("\n------[LOGIN]------");

            System.out.print("Username : ");
            username = scanner.nextLine();

            System.out.printf("Password : ");
            password = scanner.nextLine();

            status = Auth.login(username,password);

            if (status){
                System.out.println("Berhasil Login");
                System.out.println();
                break;
            } else {
                System.out.println("Username atau Password salah !");
                System.out.println();
            }
        }while (status == false);
   }
}
