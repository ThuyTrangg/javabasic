/* Cho một mảng sô nguyên - viết CT hiển thị ra tổng phâng từ đầu tiên và cuối cùng
VD:  mảng n = 4 5 6 7 8 thì hiển thị 4+8=12*/


package src.Mang;

public class Bai_2 {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 7, 8};
        int sum = a[0] + a[a.length - 1];
        System.out.println("Tổng của phần tử đầu tiên và phần tử cuối cùng trong mảng là: " + sum);
    }
}
