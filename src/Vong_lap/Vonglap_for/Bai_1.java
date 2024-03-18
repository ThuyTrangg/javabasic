/*Nhập vào số nguyên n và hiển thị ra màn hình các số từ 1 đến n.
VD nhập n = 10 sẽ hiển thị 1 2 3 4 5 6 7 8 9 10 note: Hiển thị cách nhau 1 khoảng trắng.*/


package src.Vong_lap.Vonglap_for;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.print(i+" ");
        }
    }
}
