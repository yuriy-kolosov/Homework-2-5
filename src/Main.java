public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 2-5. Работа с исключениями");
        System.out.println();
        System.out.println("Проверка допустимости формата логина и пароля");
        System.out.println();

        String login = "Login_1";
//        String login = "123456789012345678901";
        String password = "Password_1";
//        String password = "123456789012345678901";
        String confirmPassword = "Password-1";
//        String confirmPassword = "123456789012345678901";

        System.out.println("Логин: " + login);
        System.out.println("Пароль: " + password);
        System.out.println("Подтверждение пароля: " + confirmPassword);
        System.out.println();

        try {
            LoginAndPasswordCompliance.check(login, password, confirmPassword);
        } catch (WrongLoginException eL) {
            System.out.println("Перехвачено исключение: " + eL);
        } catch (WrongPasswordException eP) {
            System.out.println("Перехвачено исключение: " + eP);
        } finally {
            System.out.println("Проверка завершена");
        }

    }

}