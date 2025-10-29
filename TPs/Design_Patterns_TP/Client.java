package Software_Eng_TPs;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the number program you want to run ");
        num = sc.nextInt();
        Program p = ProgramFactory.createProgram(num);
        if (p != null) {
            p.go();
        } else  {
            System.out.println("Sorry nothing to run");
        }
    }
}
