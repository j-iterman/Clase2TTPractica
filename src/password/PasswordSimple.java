package password;

public class PasswordSimple extends Password{
    public PasswordSimple() {
        super("[a-zA-Z]{5,10}"); //entre 5 y 10 letras mayúsculas o minúsculas
    }
}
