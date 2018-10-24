import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int re = 0;
        if(a<b) {
            for (int m = a; m <= b; m = m + 2) {
                if (m % 2 == 1) {
                    m = m + 1;
                }
                re = re + m;
            }
            System.out.println(re);
        }else {
            System.out.println("A比B大");
        }
    }
}
