package Ubungen;

public class ArraySum {
    public static int sumArray( int[] array){

        int sum =0;
        for (int i = 0; i <array.length ; i++) {

            sum += array[i];

        }

        return sum;
    }

    public static void main(String[] args) {
        int[] number ={1,2,3,4,5,6,7,8,9};
        System.out.println("Sum Array =" + sumArray(number));
    }
}
