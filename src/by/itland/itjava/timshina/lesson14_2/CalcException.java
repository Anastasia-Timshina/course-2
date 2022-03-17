package by.itland.itjava.timshina.lesson14_2;

public class CalcException extends Exception {
    private final String message;

    public CalcException() {
        this.message = ("Проверь вводимый формат:)");
    }

    public CalcException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
