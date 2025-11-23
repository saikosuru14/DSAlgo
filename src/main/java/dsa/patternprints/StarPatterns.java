package dsa.patternprints;

import java.util.Scanner;

/*
    for each row:
      for each column:
        print something
      move to next line
*/
public class StarPatterns {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int n =5;
/*
        //1. Square pattern
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2: Left Triangle
        for(int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //3: Reverse Left Triangle
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //Alternate approach
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //4.Right-Aligned Triangle (Important)
        for(int i =0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int k =0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Pattern 5: Reverse Right-Aligned Triangle
        for(int i=0; i<n; i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n; k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        //Alternate approach
        for(int i=n; i>0; i--){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //Pattern 6: Full Pyramid (Very Important)
        for(int i=0; i<n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k< 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
