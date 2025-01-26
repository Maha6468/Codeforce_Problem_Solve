package Sheet1;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        long A= input.nextLong();
        long B= input.nextLong();
        long C= input.nextLong();
        long D= input.nextLong();
        long X=(A*B)-(C*D);
        System.out.println("Difference = "+X);

    }
}
