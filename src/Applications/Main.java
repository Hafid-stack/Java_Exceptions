package Applications;

import Exceptions.NaturalNumbers;
import Exceptions.NegativeNumbersException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumbersException {
        try {
            NaturalNumbers n1=new NaturalNumbers(5);
            System.out.println("Initial Value " +n1.getValue());
            n1.setValue(-50);
            System.out.println("current value "+n1.getValue());
            for (int i=0;i<60;i++){
                System.out.println("test loop for");
                n1.increaseValue();
            }
            System.out.println("After increase value "+n1.getValue());
            NaturalNumbers n2=new NaturalNumbers(-50);
            System.out.println("Initial Value " +n2.getValue());
            n2.setValue(50);
            System.out.println("current value "+n2.getValue());

        }catch (NegativeNumbersException e){
            System.out.println(e.getMessage());
            System.out.println("NegativeNumbersException "+e.getMessage()+e.negativeValue());
        }

    }
}