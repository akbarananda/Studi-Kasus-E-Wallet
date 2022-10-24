public class EWallet {
    static User akunTerdaftar;

    public static User getAkunTerdaftar(){
        return akunTerdaftar;
    }

    public static boolean verifPin(String pin){
        boolean status = akunTerdaftar.pin.equals(pin);

        return status;
    }

    public static boolean registrasiUser(User akunBaru){

        // ...

        if (akunTerdaftar != null){

            // ...

            if ((akunTerdaftar.username.equals(akunBaru.username)) || (akunTerdaftar.telp.equals(akunBaru.telp))) {
                return false;
            } else {
                akunTerdaftar = akunBaru;
                return true;
            }
            } else {
            akunTerdaftar = akunBaru;
            return true;
        }
        }
    }
