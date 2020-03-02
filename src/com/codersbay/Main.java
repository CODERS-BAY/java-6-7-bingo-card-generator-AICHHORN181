package com.codersbay;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[][] bingoCard = new int[5][5];
        int random = 0;
        Random rand = new Random();

        bingoCard[2][2] = 0;

        for ( int i = 0; i < 5; i++) {
            for ( int j = 0; j < 5; j++){
                do {

                    random = (i*15) + ( rand.nextInt(15 ) + 1 );

                } while (bingoCard[i][0] == random  || bingoCard[i][1] == random || bingoCard[i][2] == random  || bingoCard[i][3] == random || bingoCard[i][4] == random);
                if ((i!=2) || (j!=2)) {
                    bingoCard[i][j] = random;
                }
            }
        }
        System.out.println("B  I  N  G  O !" );

        System.out.println("---------------");
        for ( int j = 0; j < 5; j++ ){
            for ( int i = 0; i < 5; i++){
                if ((i==2) && (j==2)){
                    System.out.printf("  *");
                }
                else {
                    System.out.printf("%3d", bingoCard[i][j]);
                }
            }
            System.out.println();
        }
    }
}