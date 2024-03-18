/*Viết chương trình nhập vào điểm học sinh. Nếu điểm:
                    0<5 in ra học lực yếu.
                   5<7 học lực trung bình
                   7<8 học lực ká
                    > 8 học lực giỏi */


package src.Vong_lap.Vonglap_if_else;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String []args) {
        //lay dl tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem HS: ");
        Double Diem = scanner.nextDouble();
        //dieu kien
        if ((Diem >= 0) && (Diem < 5)) {
            System.out.println("học lực yếu");
        } else if ((Diem >= 5) && (Diem < 7)) {
            System.out.println("học lực trung bình");
        } else if ((Diem >= 7) && (Diem < 8)) {
            System.out.println("học luc kha");
        } else {
            System.out.println("học luc gioi");
        }
    }
    }
