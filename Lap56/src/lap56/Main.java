package lap56;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        QLSP qlsp = new QLSP();

        while (true) {
            System.out.println("================= MENU =================");
            System.out.println("1. Nhap san pham");
            System.out.println("2. Sap xep danh sach san pham gia giam dan va hien thi");
            System.out.println("3. Tim va xoa san pham theo ten");
            System.out.println("4. Hien thi gia trung binh cua cac san pham");
            System.out.println("0. Thoat");
            System.out.println("========================================");
            System.out.print("Lua chon: ");
            int select;
            Scanner sc = new Scanner(System.in);
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 0:
                    System.out.println("BYE!");
                    System.exit(0);
                case 1:
                    qlsp.importProduct();
                    break;
                case 2:
                    qlsp.sortProduct();
                    break;
                case 3:
                    qlsp.deleteProduct();
                    break;
                case 4:
                    qlsp.showAveregePriceProducts();
                    break;
            }
        }
    }

}
