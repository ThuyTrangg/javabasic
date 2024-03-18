/*Nhập 2 số a và b hãy viết chương trình hiển thị số từ a tới b
ví dụ nhập a = 4 b =8 sẽ hiển thị 4 5 6 7 8*/


package src.Vong_lap.Vonglap_for;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so nguyen b: ");
        int b = scanner.nextInt();
        for ( a = a; a<=b; a++){
            System.out.print(a+" ");
        }
    }
}
