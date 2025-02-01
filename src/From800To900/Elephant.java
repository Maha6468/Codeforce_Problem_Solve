package From800To900;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n= input.nextInt();
        int move=0;
        move=n/5;
        if(n%5!=0){
            move++;
        }
        System.out.println(move);

        

    }
}
