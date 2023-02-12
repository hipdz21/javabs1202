/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap78;

/**
 *
 * @author dovan
 */
abstract public class SinhVienPoly {

    private String name;
    private String majors;

    abstract public float getDiem();

    public String getHocLuc() {
        float mark = getDiem();
        if (mark < 5) {
            return "Yeu";
        }
        if (mark < 6.5) {
            return "Trung binh";
        }
        if (mark < 7.5) {
            return "Kha";
        }
        if (mark < 9) {
            return "Gioi";
        }
        return "Xuat sac";
    }

    public SinhVienPoly() {
    }

    public SinhVienPoly(String name, String majors) {
        this.name = name;
        this.majors = majors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }
}
