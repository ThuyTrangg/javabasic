/*Viết chương trình nhập vào bàn phím số nguyên a và b
Nếu a nhỏ hơn hoặc bằng b thì in ra a nhỏ hơn hoặc bằng b với a b là 2 số bạn nhập
Ngược lại lớn hơn hoặc bằng cũng in tương tự*/

package src.Vong_lap.Vonglap_if_else;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String []args) {
        //lay dl tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so nguyen b: ");
        int b = scanner.nextInt();
        //dieu kien
        if (a<=b)
        {
            System.out.println("a nhỏ hơn hoặc bằng b");
        }
        else
        {
            System.out.println("a lớn hơn hoặc bằng b");
        }

    }
}
