public class Auth {

    static User userLogged = null;

    public static User getUserLogged(){
        return userLogged;
    }
    public static void initialUser(){
        User user = new User("Akbar","12345","081","user","123");

        EWallet.registrasiUser(user);
    }

    public static boolean login(String username, String password){

        if ((EWallet.getAkunTerdaftar().username.equals(username)) && (EWallet.getAkunTerdaftar().password.equals(password))) {
            //Berhhasil Login
            userLogged = EWallet.getAkunTerdaftar();
            return true;
        } else {
            //Gagal
            return false;
        }
        }

    public static void logout() {
        userLogged = null;
    }
}
