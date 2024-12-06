package virat;

import java.util.Scanner;

public class case_check_char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a character to check the case: ");
        char ch = in.next().trim().charAt(0);
        if(ch > 'a' && ch < 'z'){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Upper case");
        }
    }
}
