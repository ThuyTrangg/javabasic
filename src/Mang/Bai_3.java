/*Cho một mảng sô nguyên - viết CT tính tổng ác số lẻ lớn 0 trong mảng*/

package src.Mang;

public class Bai_3 {
    public static void main(String[]args){
        int[] a = {4,5,12,7,8,1};
        int tong=0;
        for (int i=1;i<a.length;i++){
            if (a[i] % 2 != 0 && a[i] > 0){
                tong += a[i];;
            }
        }
        System.out.println("Tổng các số lẻ lớn hơn 0 trong mảng là: " + tong);
    }
}
