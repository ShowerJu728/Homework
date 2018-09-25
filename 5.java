import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("輸入三角形的三邊長");
        Scanner a = new Scanner(System.in);
        int Q = a.nextInt();
        Scanner b = new Scanner(System.in);
        int W = b.nextInt();
        Scanner c = new Scanner(System.in);
        int E = c.nextInt();
        if (Q > W || W > E){
            System.out.println("False");
        }
        else if (Q + W > E && W + E > Q && Q + E > W) {
            System.out.println("True");
        } else {
            System.out.println("False");


        }
    }
}
