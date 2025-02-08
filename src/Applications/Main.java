package Applications;

import Exceptions.NaturalNumbers;
import Exceptions.NegativeNumbersException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumbersException {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        NaturalNumbers naturalNumbers=new NaturalNumbers(number);
        try {
            System.out.println("Natural Numbers: " + naturalNumbers.getValue());
        }catch (NegativeNumbersException e){
            System.out.println(e.getMessage());
            System.out.println(e.negativeMessage(naturalNumbers.getValue());
        }

    }
}