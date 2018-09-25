import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("請輸入攝氏溫度");
        Scanner scn =new Scanner(System.in);
        float c = scn.nextInt();
        System.out.println(((c*9)/5)+32);
    }
}
