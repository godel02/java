package virat;
import java.util.Scanner;

public class hcf_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number you want to know the HCF of :- ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int n;
        int hcf=0;
        if (a>b){
           n=a;
        }
        else{
            n=b;
        }
        for (int i=1; i<=n; i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF of "+ a + " and "+b+ " is : " + hcf);

    }
}
