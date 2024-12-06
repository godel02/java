package virat;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter multiple digit number : ");
        long num = sc.nextLong();
        long a=0;
        long rev=0;
        while(num!=0){
            a = num%10;
            rev= rev*10+a;
            num= num/10;
        }
        System.out.println("reverse of input is: "+ rev);
    }
}
