package Ubungen;

public class Avarage {
    public static void main(String[] args) {

        int [] array ={1,2,3,4,5,6,7,8,93333333,0,11,2234,56,6,77,8,9,9900000};
        System.out.println(array.length);

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];

        }
        int avarage = sum/(array.length-1);

        System.out.println(avarage);
    }
}
