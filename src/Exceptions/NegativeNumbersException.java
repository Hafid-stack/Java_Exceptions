package Exceptions;

public class NegativeNumbersException extends Exception{
    private int negativeValue;

    public NegativeNumbersException(String message) {
        super(message);

    }
    public NegativeNumbersException(String message, int negativeValue) {
        super(message);
        this.negativeValue = negativeValue;
    }
    public int negativeValue(){
        return negativeValue;
    }

}
