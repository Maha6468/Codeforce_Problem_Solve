package Sheet1;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
            Scanner input=new Scanner (System.in);
            double A= input.nextDouble();
            double B= input.nextDouble();
            double num=A/B;
            System.out.println("floor "+(int)A+" / "+(int)B+" = "+(int)Math.floor(num));
            System.out.println("ceil "+(int)A+" / "+(int)B+" = "+(int)Math.ceil(num));
            System.out.println("round "+(int)A+" / "+(int)B+" = "+Math.round(num));


    }
}
