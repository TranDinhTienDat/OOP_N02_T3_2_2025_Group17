import java.util.ArrayList;

public class DanhSachGiaoDich {
    ArrayList<GiaoDich> danhSachGD = new ArrayList<>();

    public void themGiaoDich(GiaoDich gd) {
        danhSachGD.add(gd);
    }

    public void hienThiGiaoDich() {
        for (GiaoDich gd : danhSachGD) {
            System.out.println(gd);
        }
    }
}