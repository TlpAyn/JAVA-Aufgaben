package Ubungen;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.println("First Array"+ Arrays.toString(array));

        reverseArray(array);
        System.out.println("Reverse Array" + Arrays.toString(array));

    }

    private static void reverseArray(int[] array) {

        int start = 0;
        int end = array.length -1 ;

        while (start < end) {
            // Başlangıç ve bitiş indekslerindeki elemanları takas etme
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Başlangıç ve bitiş indekslerini güncelleme
            start++;
            end--;

        }
    }


}
