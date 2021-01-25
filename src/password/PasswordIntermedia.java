package password;

public class PasswordIntermedia extends Password{
    public PasswordIntermedia(String regex) {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,20}$");
        //entre 8 y 20 caracteres, al menos 1 mayus, 1 minus y 1 número
    }
}
