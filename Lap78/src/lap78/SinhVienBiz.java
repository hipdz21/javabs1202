/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap78;

/**
 *
 * @author dovan
 */
public class SinhVienBiz extends SinhVienPoly {

    private float marketingMark;
    private float salesMark;

    public SinhVienBiz() {
    }

    public SinhVienBiz(float marketingMark, float salesMark) {
        this.marketingMark = marketingMark;
        this.salesMark = salesMark;
    }

    public SinhVienBiz(float marketingMark, float salesMark, String name, String majors) {
        super(name, majors);
        this.marketingMark = marketingMark;
        this.salesMark = salesMark;
    }
    

    public float getMarketingMark() {
        return marketingMark;
    }

    public void setMarketingMark(float marketingMark) {
        this.marketingMark = marketingMark;
    }

    public float getSalesMark() {
        return salesMark;
    }

    public void setSalesMark(float salesMark) {
        this.salesMark = salesMark;
    }

    @Override
    public float getDiem() {
        return (this.marketingMark * 2 + this.salesMark) / 3;
    }

}
