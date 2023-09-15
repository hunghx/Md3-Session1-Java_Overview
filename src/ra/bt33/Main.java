package ra.bt33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // phân tích yêu cầu , đọc 1 số từ 0 - 999
        // thuật toán đọc số có 1 chữ số
        System.out.println("Nhập vào 1 số");
        int number = new Scanner(System.in).nextInt();
        if(number < 0 ){
            return;
        } else if (number<=10) {
            System.out.println(readNumber(number));
        } else if (number<=19) {
            System.out.println("Mười "+readNumber(number%10));
        } else if (number<100){
            if (number%10==0){
                System.out.println(readNumber(number/10) + " mươi");
            }else {
                System.out.println(readNumber(number/10) + " mươi "+readNumber(number%10));
            }
        }else{
            // tính chữ số hàng trăm
            int tram = number/100;
            int chuc = (number%100)/10;
            int donVi = number%10;
            if(chuc == 0 ){
                if (donVi ==0){
                    System.out.println(readNumber(tram) + " trăm");
                }else {
                    System.out.println(readNumber(tram) + " trăm linh " + readNumber(donVi));
                }
            }else {
                System.out.print(readNumber(tram)+" trăm ");
                int ab = number%100;
                if (ab<=19) {
                    System.out.println("mười "+readNumber(ab%10));
                } else {
                    if (ab%10==0){
                        System.out.println(readNumber(ab/10) + " mươi");
                    }else {
                        System.out.println(readNumber(ab/10) + " mươi "+readNumber(ab%10));
                    }
                }
            }
        }

    }
    public static String readNumber(int number){
        switch (number){
            case 0:
                return "không";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            case 10:
                return "mười";
            default:
                return null;
        }
    }
}
