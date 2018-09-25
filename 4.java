import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("請輸入身高");
        Scanner a = new Scanner(System.in);
        float high = a.nextFloat();
        System.out.println("請輸入體重");
        Scanner b = new Scanner(System.in);
        float weight = b.nextFloat();
        System.out.println(high/2.54);
        System.out.println(weight/0.454);
    }
}
