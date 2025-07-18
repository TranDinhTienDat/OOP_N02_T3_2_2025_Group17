import java.util.ArrayList;

public class QuanLyPhongKham {
    ArrayList<BenhNhan> dsBenhNhan = new ArrayList<>();
    ArrayList<GiaoDich> dsGiaoDich = new ArrayList<>();
    ArrayList<PhongKham> dsPhongKham = new ArrayList<>();

    // BỆNH NHÂN
    public void themBenhNhan(BenhNhan bn) {
        dsBenhNhan.add(bn);
    }

    public void hienThiBenhNhan() {
        for (BenhNhan bn : dsBenhNhan) {
            System.out.println("Mã: " + bn.maBN + ", Tên: " + bn.ten + ", Tuổi: " + bn.tuoi + ", Giới: " + bn.gioiTinh);
        }
    }

    // GIAO DỊCH
    public void themGiaoDich(GiaoDich gd) {
        dsGiaoDich.add(gd);
    }

    public void hienThiGiaoDich() {
        for (GiaoDich gd : dsGiaoDich) {
            System.out.println("Mã GD: " + gd.maGD + ", Mã BN: " + gd.maBN + ", Số tiền: " + gd.soTien + ", Ngày: " + gd.ngayGD);
        }
    }

    // PHÒNG KHÁM
    public void themPhongKham(PhongKham pk) {
        dsPhongKham.add(pk);
    }

    public void hienThiPhongKham() {
        for (PhongKham pk : dsPhongKham) {
            System.out.println("Mã PK: " + pk.maPK + ", Tên: " + pk.tenPK + ", Địa chỉ: " + pk.diaChi);
        }
    }
}
