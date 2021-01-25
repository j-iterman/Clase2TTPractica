package password;

public class PasswordFuerte extends Password{
    public PasswordFuerte(String regex) {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,20}$");
        //entre 8 y 20 caracteres, al menos 1 mayus, 1 minus, 1 número y 1 caracter especial
    }
}
