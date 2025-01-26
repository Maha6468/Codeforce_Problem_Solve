package Sheet1;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        long N= input.nextLong();
        long M= input.nextLong();
        long a,b;
        a=N%10;
        b=M%10;
        System.out.println(a+b);

    }
}
