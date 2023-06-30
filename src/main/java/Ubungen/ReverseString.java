package Ubungen;

public class ReverseString {
    public static void main(String[] args) {

        String a = "Welcome to Java World";
        String b[]= a.split("");
        for (int i 0; i < b.length-1; i--) {
            System.out.println(b[i]);
        }


    }
}
