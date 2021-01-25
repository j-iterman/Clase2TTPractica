package password;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private final Pattern patron;
    protected String password;

    public Password(String regex) {
        this.patron = Pattern.compile(regex);
    }

    public void setValue(String pwd) throws InputMismatchException{

        Matcher mat = patron.matcher(pwd);
        if (!mat.matches()) throw new InputMismatchException();

        this.password = pwd;

    }
}
