/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap78;

/**
 *
 * @author dovan
 */
public class SinhVienIT extends SinhVienPoly {

    private float javaMark;
    private float htmlMark;
    private float cssMark;

    public SinhVienIT() {
    }

    public SinhVienIT(float javaMark, float htmlMark, float cssMark) {
        this.javaMark = javaMark;
        this.htmlMark = htmlMark;
        this.cssMark = cssMark;
    }

    public SinhVienIT(float javaMark, float htmlMark, float cssMark, String name, String majors) {
        super(name, majors);
        this.javaMark = javaMark;
        this.htmlMark = htmlMark;
        this.cssMark = cssMark;
    }
    

    public float getJavaMark() {
        return javaMark;
    }

    public void setJavaMark(float javaMark) {
        this.javaMark = javaMark;
    }

    public float getHtmlMark() {
        return htmlMark;
    }

    public void setHtmlMark(float htmlMark) {
        this.htmlMark = htmlMark;
    }

    public float getCssMark() {
        return cssMark;
    }

    public void setCssMark(float cssMark) {
        this.cssMark = cssMark;
    }

    @Override
    public float getDiem() {
        return (this.javaMark * 2 + this.htmlMark + this.cssMark) / 4;
    }

}
