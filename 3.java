import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("輸入國文成績");
        Scanner a = new Scanner(System.in);
        int chinese = a.nextInt();
        System.out.println("輸入英文成績");
        Scanner b = new Scanner(System.in);
        int english = b.nextInt();
        System.out.println("輸入數學成績");
        Scanner c = new Scanner(System.in);
        int math = c.nextInt();
        System.out.println(chinese+english+math);
        System.out.println((chinese+english+math)/3);
    }
}
