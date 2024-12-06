package virat;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int a = num;
        int b = num;
        String str= String.valueOf(a);
        int len = str.length();
        int a1=0;
        double result=0;
//        System.out.println(len);
        while(num!=0){
            a1=num%10;
            result=Math.pow(a1,len)+result;
            num=num/10;
        }
        if(b==result){
            System.out.println("the number is a armstrong number");
        }
        else{
            System.out.println("the number is not armstrong number");
        }
    }
}
