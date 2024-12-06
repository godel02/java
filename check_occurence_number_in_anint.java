package virat;

import java.util.Scanner;

public class check_occurence_number_in_anint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter multiple digit number : ");
        long num = sc.nextLong();
        System.out.println("enter the digit u want to check the occurences of:");
        int a = sc.nextInt();
        int count = 0;
        while(num!=0){
            long b = num%10;
            if(b==a){
                count += 1;
            }
            num= num/10;
        }
        System.out.println("count: "+ count);
    }
}
