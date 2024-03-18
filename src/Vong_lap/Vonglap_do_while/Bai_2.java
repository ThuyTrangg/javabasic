/* Viết CT nhập vào số nguyên n và tính tổng các số lẻ từ 0 đến n
VD: nhập n = 7 thì là 1 + 3 + 5+ 7 = 16 */


package src.Vong_lap.Vonglap_do_while;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        // Khởi tạo biến tổng để lưu tổng các số lẻ
        int sum = 0;
        int i = 0;

        // Vòng lặp do-while để tính tổng các số lẻ từ 0 đến n
        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        } while (i <= n);
        System.out.println("Tổng các số lẻ từ 0 đến " + n + " là: " + sum);

    }
}

