// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Ip = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien  : ");
        int n = Ip.nextInt()  ;
        Student students[]  = new Student[n] ;
        System.out.println("Nhap Thong Tin sinh vien theo cu phap sau ");
        System.out.println("Ten SV _ Lop _ Diem");
        System.out.println("Ten Khoa _ Ngay vao khoa");
        System.out.println("Ten Truong _ Ngay vao truong");
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap thong tin sinh vien thu :" + (i+1));
            students[i] = new Student();
            students[i].Input() ;
        }
        System.out.println();
        for(int i = 0 ; i < n ; i++){
            students[i].Out() ;
        }
    }
}