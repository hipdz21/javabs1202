package lap78;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        QLSV qlsv = new QLSV();
        while (true) {
            System.out.println("================= MENU =================");
            System.out.println("1 Nhap danh sach sinh vien");
            System.out.println("2 Xuat thong tin danh sach sinh vien");
            System.out.println("3 Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4 Sap xep danh sach sinh vien theo diem");
            System.out.println("5 Ket thuc");
            System.out.println("========================================");
            System.out.print("Lua chon: ");
            int select;
            Scanner sc = new Scanner(System.in);
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    qlsv.importStudent();
                    break;
                case 2:
                    qlsv.showStudents();
                    break;
                case 3:
                    qlsv.showStudentsGood();
                    break;
                case 4:
                    qlsv.sortStudents();
                    break;
                case 5:
                    System.out.println("BYE!");
                    System.exit(0);
            }
        }
    }
}
