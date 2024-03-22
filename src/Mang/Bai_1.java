    /*Cho một mảng sô nguyên - viết CT hiển thị phần từ lớn nhất tỏng mảng. VD: mảng n = 4 5 6 7 8 thì hiển thị 8*/


package src.Mang;

public class Bai_1 {
    public static void main(String[]args){
        int[] a = {4,5,12,7,8};
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
