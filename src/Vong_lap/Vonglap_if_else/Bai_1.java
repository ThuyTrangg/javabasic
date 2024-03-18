/*Viết chương trình nhập vào từ bàn phím số nguyên n
Kiểm tra nếu số nguyên đó là số chẳn thì in ra màn hình n là số chẳn (với n hiển thị là số bạn nhập)
Ngước lại in ra n là số lẻ */

package src.Vong_lap.Vonglap_if_else;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String []args){
        //lay dl tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = scanner.nextInt();
        //dieu kien n chia het cho 2
        if (n%2==0)
        {
            System.out.println("Đây là số chẵn");
        }
        else
        {
            System.out.println("Đây là số lẻ");
        }
    }

}
