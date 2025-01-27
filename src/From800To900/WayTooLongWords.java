package From800To900;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n= input.nextInt();
        String S;
        for(int i=0;i<n;i++){
            S= input.next();
            if(S.length()>10){
                S=S.charAt(0)+""+(S.length()-2)+S.charAt(S.length()-1);
                System.out.println(S);
            }else
                System.out.println(S);
        }
    }
}
