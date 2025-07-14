import java.util.ArrayList;

public class PhongKham {
    private String ten;
    private String diaChi;
    private ArrayList<BenhNhan> danhSachBenhNhan;

    public PhongKham(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    public void themBenhNhan(BenhNhan bn) {
        danhSachBenhNhan.add(bn);
    }

    public void hienThiBenhNhan() {
        System.out.println("Danh sach benh nhan tai " + ten + ":");
        for (BenhNhan bn : danhSachBenhNhan) {
            System.out.println(bn);
        }
    }

    public String getTen() { return ten; }
    public String getDiaChi() { return diaChi; }

    public String toString() {
        return "PhongKham{" +
                "ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soLuongBenhNhan=" + danhSachBenhNhan.size() +
                '}';
    }
}
