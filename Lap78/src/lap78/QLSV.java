package lap78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLSV {

    private List<SinhVienPoly> lSV;
    private Scanner sc;

    public QLSV() {
        lSV = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void importStudent() {
        do {
            System.out.print("Nhap ho ten sinh vien: ");
            String name = sc.nextLine();
            String majors;
            while (true) {
                System.out.print("Nhap nganh hoc (it/biz): ");
                majors = sc.nextLine();
                if (majors.equals("it") || majors.equals("biz")) {
                    break;
                }
                System.out.println("Nganh hoc khong dung! Nhap lai!");
            }
            if (majors.equals("it")) {
                float javaMark;
                float htmlMark;
                float cssMark;
                while (true) {
                    try {
                        System.out.print("Nhap diem java: ");
                        javaMark = Float.parseFloat(sc.nextLine());
                        System.out.print("Nhap diem html: ");
                        htmlMark = Float.parseFloat(sc.nextLine());
                        System.out.print("Nhap diem css: ");
                        cssMark = Float.parseFloat(sc.nextLine());
                        if (javaMark < 0 || javaMark > 10 || htmlMark < 0 || htmlMark > 10 || cssMark < 0 || cssMark > 10) {
                            System.out.println("Diem phai trong khoang 0 den 10. Nhap lai!");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Diem phai la so thuc! nhap lai!");
                    }
                }
                lSV.add(new SinhVienIT(javaMark, htmlMark, cssMark, name, majors));

            } else {
                float marketingMark;
                float salesMark;
                while (true) {
                    try {
                        System.out.print("Nhap diem marketing: ");
                        marketingMark = Float.parseFloat(sc.nextLine());
                        System.out.print("Nhap diem sales: ");
                        salesMark = Float.parseFloat(sc.nextLine());
                        if (marketingMark < 0 || marketingMark > 10 || salesMark < 0 || salesMark > 10) {
                            System.out.println("Diem phai trong khoang 0 den 10. Nhap lai!");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Diem phai la so thuc! nhap lai!");
                    }
                }
                lSV.add(new SinhVienBiz(marketingMark, salesMark, name, majors));
            }
            System.out.println("Tiep tuc nhap (co/ko)?");
            if (!sc.nextLine().equals("co")) {
                break;
            }
        } while (true);
    }

    public void showStudents() {
        System.out.println("Danh sach sinh vien");
        for (SinhVienPoly svp : lSV) {
            System.out.println("Ho Ten: " + svp.getName() + ", nganh: " + svp.getMajors() + ", diem: " + svp.getDiem() + ", hoc luc: " + svp.getHocLuc());
        }
    }

    public void showStudentsGood() {
        System.out.println("Danh sach sinh vien co hoc luc gioi");
        for (SinhVienPoly svp : lSV) {
            if (svp.getHocLuc().equals("Gioi")) {
                System.out.println("Ho Ten: " + svp.getName() + ", nganh: " + svp.getMajors() + ", diem: " + svp.getDiem() + ", hoc luc: " + svp.getHocLuc());
            }
        }
    }

    public void sortStudents() {
        System.out.println("Sap xep danh sach sinh vien theo diem tang dan");
        Collections.sort(lSV, new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return Float.compare(o1.getDiem(), o2.getDiem());
            }
        });
        showStudents();
    }
}
