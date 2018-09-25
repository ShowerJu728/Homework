import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("輸入三個1~3000間的正整數代表西元年");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int Q = a.nextInt();
        int W = b.nextInt();
        int E = c.nextInt();
        if ( Q % 4 == 0 && Q % 100 != 0   || Q % 400 == 0) {
            System.out.println("True");
        }
            else {
            System.out.println("False");
        }
        if ( W % 4 == 0 && W % 100 != 0   || W % 400 == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        if ( E % 4 == 0 && E % 100 != 0   || E % 400 == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }



    }
}
