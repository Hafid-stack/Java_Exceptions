package Exceptions;

public class NaturalNumbers {
    private int value;
//    private int sum;
    public NaturalNumbers(int value) throws NegativeNumbersException {
        if (value < 0) {
            throw new NegativeNumbersException("Initial value cannot be negative (1): " + value);
        }
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws NegativeNumbersException {
        if (value < 0) {
            throw new NegativeNumbersException("Initial value cannot be negative (2): " + value);
        }
           this.value = value;


    }
    public void increaseValue() throws NegativeNumbersException {

        this.value++;
        if (this.value < 0) {
            throw new NegativeNumbersException("Initial value cannot be negative (3): " + value);
        }


    }
}
