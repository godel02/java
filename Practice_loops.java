package virat;

import java.util.Scanner;

public class Practice_loops {
    public static void main(String[] args) {
        //Q1 factors of given number
          Scanner sc = new Scanner(System.in);
//        System.out.print("enter a number u want the factors of: ");
//        int num = sc.nextInt();
//        int n = 1;
//        System.out.print("Factor of entered number are: ");
//        while(n<=num){
//            if(num % n==0){
//                System.out.println( n+"");
//            }
//            n++;
//        }

        //Q2 input sum until user enter 0

//        System.out.print("enter a integer number to continue or press 0 to terminate: ");
//        int sum = 0;
//        int b=1;
//        do{
//            int a = sc.nextInt();
//            sum= sum + a;
//            b=a;
//        }while( b != 0);
//            System.out.println("the sum of input integer is : " + sum);

        //Q3 input int to find the largest of all inputs

        System.out.print("enter a integer number to continue or press 0 to terminate: ");
        int largest = 0;
        int b=1;
        do{
            int a = sc.nextInt();
            if(a>largest){
                largest= a;
            }
            b=a;
        }while( b != 0);
        System.out.println("the largest of input integer is : " + largest);


    }
}
