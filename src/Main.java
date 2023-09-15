import java.util.Date;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // sout - hiển thị với new line
        // souf - hiển thị format với chuỗi
//        System.out.println("Hello and welcome!");
//        System.err.println("Đây là lỗi"); // lưu ý khi sử dụng (bất đồng bộ)
        // hiển thị với màu sắc trong màn console (sử dụng icon Window + .)
//        System.out.println("\u001B[31mRed text");
//        System.out.println("\u001B[32mGreen text");
//        System.out.println("\u001B[33mYellow text");
//        System.out.println("\u001B[34mBlue text");
//        System.out.println("\u001B[35mPurple text");
//        System.out.println("\u001B[36mCyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
//        System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️");
        // biến và kiểu dữ liệu

        // kiểu nguyên thủy
        // cú pháp [kiểu dữ liệu] [tên biến] = [giá trị];
//        int number = 10;
//        float fl = 5.9F;
//        double db = 10.0;
//        char ch = 'a';
//        boolean check = true;
        // nếu giá trị là chuỗi thì sử dụng %s , nếu là số nguyên thì dùng %d
        // nếu là số thực dùng %f , nếu là các kiểu khác thí mặc định là %s
        // các kí tự đặc biêt \n - xuống dòng ; \t tab
//        System.out.printf("\u001B[32mnumber = %-5d | fl = %-5.2f | db = %-5.2f | ch = %s | check = %-10s \n",
//                number,
//                fl,
//                db,
//                ch,
//                check);
        // kiểu tham chiếu
//        String name = "Hồ Xuân Hùng"; // char[] khi thay đổi giá trị của 1
//         chuỗi thì tạo ra 1 mảng kí tư mới
//        String str = name;
//        name = "nam";
//        Date date = new Date();
//        System.out.println("Ngày tháng hiện tại là : "+ date);
//        System.out.println("Họ tên "+ name);
//        System.out.println(str);
//        Scanner sc = new Scanner(System.in); // đây là máy quét dùng để nhập dữ liệu
        // từ màn hình console
        // nhập chuỗi, số, số thực, boolean , byte , ...
//        System.out.println("hãy nhập vào địa chỉ");
//        String address = sc.nextLine();
//        System.out.println("Địa chỉ : "+ address);
        // nhập số nguyên, thực, boolean
//        System.out.println(" Hãy nhập vào  1 số ");
//        int a = Integer.parseInt(sc.nextLine()); // ép kiểu
//        System.out.println("Số bạn vừa nhập là "+ a);
//        // lưu ý : khi vừa nhập số mà chuyển qua nhập chuỗi thì sẽ bị nuốt dòng nhập kế tiếp
//        System.out.println("Hãy nhập vào 1 chuỗi");
//        String string = sc.nextLine(); // "327473827857825727"
//        // khai báo biến hằng
//        final float PI = 3.14F;

        // toán tử
        // -- ++ dùng để giảm hoặc tăng giá trị của biến 1 đơn vị
        // tiền tố : ++a hoặc --a : biểu thức này sẽ trả về giá trị của biến sau khi tăng hoặc giảm
        int a = 10;
        int b= 100;
//        System.out.println(--a);
        // hậu tố : a++ hoặc a-- : biểu thức này sẽ trả về giá trị của biến trước khi tăng hoặc giảm
        System.out.println(a++ * b);  //
        System.out.println(a); // 11
        // toán tử 3 ngôi
        // (biểu thưcs logic) ?(nếu đúng):(nếu sai);
        // kiểm tra 1 số người dùng nhập vào là chẵn hay lẻ
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số");
        int number = sc.nextInt();
//        String rs = (number%2==0)?"Số chẵn":"Số lẻ";
//        System.out.println(rs);

        // câu lệnh điều kiện
        // chỉ có if
        if(false){
            System.out.println("thực hiện if");
        }
        // if ... else
        // kiểm tra chẵn lẻ
        if(number%2==0){
            System.out.println("Số chẵn");
        }else {
            System.out.println("Số lẻ");
        }
        // bậc thang
        float dtb = 7.0f;
        if (dtb<5.0){
            // yếu
        } else if (dtb<6.5) {
            // trung bình
        } else if (dtb<7) {
            // khá
        }else if (dtb<8){
            // giỏi
        }else {
            // xuất sắc
        }
        // lồng nhau
        // năm nhuận

        int year = 1900;
        if (year%4 == 0){
            if (year%100 == 0){

                if(year%400==0){
                    // là năm nhuận
                    System.out.println("năm nhuận");
                }else {
                    // ko là năm nhuận
                    System.out.println("ko phải năm nhuận");
                }
            }else {
                // là năm nhuận
                System.out.println("năm nhuận");
            }
        }else {
            // không phải năm nhuận
            System.out.println("ko phải năm nhuận");
        }
        // switch case

        // hiển thị số dư khi chia cho 5 ;
        int so = 1997;
        int mod = so % 5;
        switch (mod){
            case 0:
                System.out.println("chia hết");
                break;
            case 1:
                System.out.println("dư 1");
                break;
            case 2:
                System.out.println("dư 2");
                break;
            case 3:
                System.out.println("dư 3");
                break;
            case 4:
                System.out.println("dư 4");
                break;
            default:
                break;
        }
    }
    }