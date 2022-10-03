// Creating 2D array of r=3,c=4 and excising/print in tne form of matrix?

package com.compony;
import java.util.Scanner;
public class a2DArrayA_intro {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][] matrix = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                //System.out.print("enter the value in box"+i+j+":");
                matrix[i][j] = sc.nextInt();
            }
        }
        String ansu = "ubousd"+5;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]+" ");
                if(matrix[i][j]==5){
                    ansu = "no 5 no found in the indies"+" "+i+" "+j;
                }
            }
            System.out.println();
        }
        System.out.print(ansu);

    }
}
