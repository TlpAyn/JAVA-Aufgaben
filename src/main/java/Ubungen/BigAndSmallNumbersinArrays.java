package Ubungen;

public class BigAndSmallNumbersinArrays {

    public static void main(String[] args) {
        int[] exampleArray= {1,2,3,445,5,6,7,11,23,44};

        int bigNum= exampleArray[0];

        for (int i = 1; i < exampleArray.length; i++) {


           if( exampleArray[i]>bigNum ){
              bigNum = exampleArray[i] ;
           }

        }
        System.out.println(bigNum);


    }
}
