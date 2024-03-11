/*Cho hình chữ nhật có chiều dài là 7.5 chiều rộng 3.8. Viết chương trình tính và hiển thị diện tích ra màn hình.
A = P [Trong đó P là diện tích hình chữ nhật]*/


package src.Topic3;
import java.util.Scanner;
public class DientichHCN {

    public static void main (String[] args)
    {
        // Lấy Dl từ bàn phím
        Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chiều dài của hình chữ nhật:");
            double length = scanner.nextDouble();
            System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
            double width = scanner.nextDouble();
            double P = length*width;
            System.out.println("Diện tích hình chữ nhật là:" + P);
    }
}


