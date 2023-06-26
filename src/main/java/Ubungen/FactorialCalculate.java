package Ubungen;

public class FactorialCalculate {


    public static int calculateFaktoriel(int number){

        if(number ==0 || number ==1){
            return 1;

        }else {
            return number* calculateFaktoriel(number-1);
        }
    }

    public static void main(String[] args) {
        int number =5;
        int factorial= calculateFaktoriel(number);
        System.out.println("factoriel of"+ number+ "ist = "+ factorial);
    }
}
