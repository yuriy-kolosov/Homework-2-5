import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginAndPasswordCompliance {

    public static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        Pattern LoginAndPasswordCompliance = Pattern.compile("[a-zA-Z_0-9]+");
        Matcher loginMatcher = LoginAndPasswordCompliance.matcher(login);
        Matcher passwordMatcher = LoginAndPasswordCompliance.matcher(password);
        Matcher confirmPasswordMatcher = LoginAndPasswordCompliance.matcher(confirmPassword);

        if (login.length() > 20 || !loginMatcher.matches()) {
            throw new WrongLoginException("Login format invalid");
        } else if (password.length() > 20 || confirmPassword.length() > 20 || !password.equals(confirmPassword) ||
                !passwordMatcher.matches() || !confirmPasswordMatcher.matches()) {
            throw new WrongPasswordException("Password format invalid");
        }

    }

}