package Exceptions;

public class NaturalNumbers {
    private int value;
    public NaturalNumbers(int value) throws NegativeNumbersException {
        if (value < 0) {
            throw new NegativeNumbersException("Initial value cannot be negative: " + value);
        }
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws NegativeNumbersException {
       try {
           this.value = value;
       }catch (NegativeNumbersException e){
           if (value < 0) {
               throw new NegativeNumbersException("Initial value cannot be negative: "+ value);
           }

       }

    }
    public void increaseValue() throws NegativeNumbersException {
       try {
           this.value++;
       }catch (NegativeNumbersException e){
           if (value < 0) {
               throw new NegativeNumbersException("Negative value");
           }
       }


    }
}
