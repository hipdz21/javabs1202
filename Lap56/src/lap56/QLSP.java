package lap56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLSP {

    private List<Product> lP;
    private Scanner sc = new Scanner(System.in);

    public QLSP() {
        lP = new ArrayList<>();
    }

    public void importProduct() {
        String name;
        float price;
        do {
            while (true) {
                System.out.print("Nhap ten san pham: ");
                name = sc.nextLine();
                if (checkExist(name) != -1) {
                    System.out.println("San pham da ton tai! Nhap lai!");
                } else {
                    break;
                }
            }

            while (true) {
                try {
                    System.out.print("Nhap gia san pham: ");
                    price = Float.parseFloat(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Gia san pham phai la so thuc! Nhap lai!");
                }
            }
            lP.add(new Product(name, price));
            System.out.println("Co muon tiep tuc khong (co/ko)?");
            if (!sc.nextLine().equals("co")) {
                break;
            }
        } while (true);
    }

    public void deleteProduct() {
        String name;
        System.out.print("Nhap ten san pham: ");
        name = sc.nextLine();
        int index = checkExist(name);
        if (index == -1) {
            System.out.println("San pham " + name + " khong ton tai!");
        } else {
            lP.remove(index);
            System.out.println("Xoa san pham " + name + " thanh cong!");
        }
    }

    public void sortProduct() {
        Collections.sort(lP, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Float.compare(o2.getPrice(), o1.getPrice());
            }
        });
        showProduct();
    }

    public void showAveregePriceProducts() {
        try {
            float price = 0;
            for (Product p : lP) {
                price += p.getPrice();
            }
            System.out.println("Gia trung binh cac san pham: " + price / lP.size());
        } catch (Exception e) {
            System.out.println("Khong ton tai san pham nao!");
        }
    }

    private int checkExist(String nameProduct) {
        for (int i = 0; i < lP.size(); i++) {
            if (lP.get(i).getName().equals(nameProduct)) {
                return i;
            }
        }
        return -1;
    }

    private void showProduct() {
        System.out.println("Danh sach san pham");
        for (Product p : lP) {
            System.out.println("Ten: " + p.getName() + ", gia: " + p.getPrice());
        }
    }
}
