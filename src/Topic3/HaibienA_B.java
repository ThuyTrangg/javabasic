/*Viết 1 chương trình tạo ra 2 biến a và b kiểu số nguyên, sau đó gán giá trị cho a=6, b=2 và hiển thị ra màn hình thông tin sau.
a + b = [P1] Trong đó: P1 là tổng a và b
a - b = [P2] Trong đó: P2 là hiệu a và b
a * b = [P3] Trong đó: P3 là tích a và b
a / b = [P4] Trong đó: P4 là thương a và */


package src.Topic3;

import java.util.Scanner;
public class HaibienA_B {

    public static void main(String[] args) {
        // lấy dữ liệu ừ bàn phím.
        Scanner sc = new Scanner(System.in);
            // Nhập các giá trị a, b.
            System.out.println("Nhập vào số thứ nhất: ");
            int a = sc.nextInt();
            System.out.println("Nhập vào số thứ hai: ");
            int b = sc.nextInt();

            // Tính tổng, hiệu, tích, thương.
            int tong = a + b;
            System.out.println( " Tổng = " + tong);

            int hieu = a - b;
            System.out.println( " Hiệu = " + hieu);

            int tich = a * b;
            System.out.println( " Tích = " + tich);

            float thuong = (float) a / b;
            System.out.println( " Thương = " + thuong);
    }

}
