import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d, m, y;
        System.out.print("Dien ngay: ");
        d = scanner.nextInt();
        while (d > 30 || d < 1) {
            System.out.print("nhap sai. xin nhap lai: ");
            d = scanner.nextInt();
        }
        System.out.println("Dien thang: ");
        m = scanner.nextInt();
        while (m > 12 || m < 1) {
            System.out.print("nhap sai. xin nhap lai: ");
            m = scanner.nextInt();
        }
        System.out.print("Dien nam: ");
        while (m < 1) {
            System.out.print("nhap sai. xin nhap lai: ");
            m = scanner.nextInt();
        }
        y = scanner.nextInt();

        System.out.println("Ket qua: " + d + "/ " + m + " / " + y);

    }
}
