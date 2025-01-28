package From800To900;

import java.util.Scanner;

public class NormalProblem {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
                int n = input.nextInt();
                input.nextLine(); // Consume the newline character
                while (n-- > 0) {
                    // Input string Ship observes from outside
                    String a = input.nextLine();
                    // String Ship observes from inside
                    StringBuilder b = new StringBuilder();
                    // Reverse the string and flip 'p' and 'q'
                    for (int i = a.length() - 1; i >= 0; i--) {
                        char ch = a.charAt(i);
                        if (ch == 'p') {
                            b.append('q');
                        } else if (ch == 'q') {
                            b.append('p');
                        } else {
                            b.append('w'); // 'w' remains unchanged
                        }
                    }
                    // Output the resulting string
                    System.out.println(b);
                }
    }
}
