public class WrongPasswordException extends RuntimeException {

    private final String message;

    public WrongPasswordException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + message + "\n";
    }

}