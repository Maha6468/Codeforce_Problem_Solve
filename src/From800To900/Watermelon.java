package From800To900;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {

            Scanner input=new Scanner (System.in);
            int w= input.nextInt();
            if(w%2==0&&(w/2!=1)){
                System.out.print("YES");
            }else
                System.out.println("NO");



    }
}
