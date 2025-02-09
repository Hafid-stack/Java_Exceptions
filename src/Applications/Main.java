package Applications;

import Exceptions.NaturalNumbers;
import Exceptions.NegativeNumbersException;



public class Main {
    public static void main(String[] args) throws NegativeNumbersException {
        try {
            NaturalNumbers n1=new NaturalNumbers(5);
            System.out.println("Initial Value " +n1.getValue());
           try {n1.setValue(-50);}
           catch (NegativeNumbersException e) {
               System.out.println(e.getMessage());

           }
            System.out.println("current value "+n1.getValue());
           try {
               n1.setValue(0);
           }
           catch (NegativeNumbersException e) {
               System.out.println(e.getMessage());
           }
            System.out.println("current value "+n1.getValue());
            for (int i=0;i<60;i++){

               try {
                   n1.increaseValue();
               }catch (NegativeNumbersException e) {
                   System.out.println(e.getMessage());
break;
               }
            }
            System.out.println("test loop for");
            System.out.println("After increase value "+n1.getValue());

        }catch (NegativeNumbersException e){
            System.out.println(e.getMessage());
            System.out.println("Message 1 + e.get1 "+e.getMessage()+e.negativeValue());
        }
        try {

            NaturalNumbers n2=new NaturalNumbers(-60);
            System.out.println("Initial Value " +n2.getValue());
            try {
                n2.setValue(50);
            }catch (NegativeNumbersException e) {
                System.out.println(e.getMessage());

            }


            System.out.println("current value "+n2.getValue());

        }
        catch (NegativeNumbersException e){
            System.out.println(e.getMessage());
            System.out.println("Message 2 + e.get2 "+e.getMessage()+e.negativeValue());
        }

    }
}