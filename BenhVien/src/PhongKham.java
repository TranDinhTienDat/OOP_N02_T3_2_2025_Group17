import java.util.ArrayList;

public class PhongKham {
    private String tenPhongKham;
    private String diaChi;
    private ArrayList<BenhNhan> danhSachBenhNhan;

    public PhongKham(String tenPhongKham, String diaChi) {
        this.tenPhongKham = tenPhongKham;
        this.diaChi = diaChi;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    public void themBenhNhan(BenhNhan bn) {
        danhSachBenhNhan.add(bn);
    }

    public void hienThiBenhNhan() {
        for (BenhNhan bn : danhSachBenhNhan) {
            System.out.println(bn);
        }
    }
    public String toString() {
        return "Tên phòng khám: " + tenPhongKham + ", Địa chỉ: " + diaChi;
    }
}
