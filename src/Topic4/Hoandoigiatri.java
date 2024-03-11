/*Cho 2 biến kiểu số nguyên a và b - viết chương trình hoán đổi giá trị của biến a và b. Sau đó hiển thị ra màn hình:
Sau khai hoán đổi a= p1, b=p2 [ví dụ a = 6 , b =10 -> sau khi hoán đổi a = 10, b = 6).*/


package src.Topic4;

import java.util.Scanner;

public class Hoandoigiatri {
    public static void main(String[] args) {
        //lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
            //khai báo ba biến int a, b và temp
            int a, b, temp;
            // nhập vào hai số a và b
            System.out.println (" a = ");
            a = sc.nextInt();
            System.out.println(" b = ");
            b = sc.nextInt();
            //sử dụng biến trung gian temp
            temp = a;
            a = b;
            b = temp;
            //kết quả sau khi hoán đổi
            System.out.println("Kết quả hoán đổi giá trị a = " + a + "\n b = " + b);
    }
}


