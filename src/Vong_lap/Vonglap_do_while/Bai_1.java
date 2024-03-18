/* Viết chương trình nhập vào bàn phím n và hiển thị các số chẳn từ n đến 100.
VD: Nhập n = 92 thì hiển thị 92 94 96 98 100 */

package src.Vong_lap.Vonglap_do_while;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        do {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }while (n <= 100);

    }
}
