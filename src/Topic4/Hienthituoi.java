/*Viết chương trình nhập vào tên, tuổi của 1 người. Sau đó hiển thị ra màn hình:
Sau 15 năm, tuổi của P1 sẽ là P2 [Với P1 là tên của người đó, P2 là tuổi người đó sau 15 năm].*/


package src.Topic4;

import java.util.Scanner;

public class Hienthituoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tuổi hiện tại: ");
            int age = scanner.nextInt();

            int tong = age + 15;
            System.out.println( "Sau 15 năm số tuổi là = "+ tong);

    }
}


