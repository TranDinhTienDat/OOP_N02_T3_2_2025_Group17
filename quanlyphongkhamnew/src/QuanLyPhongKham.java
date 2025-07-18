import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyPhongKham {

    ArrayList<BenhNhan> danhSachBN = new ArrayList<>();
    ArrayList<GiaoDich> danhSachGD = new ArrayList<>();
    ArrayList<PhongKham> danhSachPK = new ArrayList<>();

    // Thêm
    public ArrayList<BenhNhan> themBenhNhan(BenhNhan bn) {
        danhSachBN.add(bn);
        return danhSachBN;
    }

    public ArrayList<GiaoDich> themGiaoDich(GiaoDich gd) {
        danhSachGD.add(gd);
        return danhSachGD;
    }

    public ArrayList<PhongKham> themPhongKham(PhongKham pk) {
        danhSachPK.add(pk);
        return danhSachPK;
    }

    // Xoá
    public ArrayList<BenhNhan> xoaBenhNhan(String maBN) {
        for (int i = 0; i < danhSachBN.size(); i++) {
            if (danhSachBN.get(i).maBN.equals(maBN)) {
                danhSachBN.remove(i);
                break;
            }
        }
        return danhSachBN;
    }

    public ArrayList<GiaoDich> xoaGiaoDich(String maGD) {
        for (int i = 0; i < danhSachGD.size(); i++) {
            if (danhSachGD.get(i).maGD.equals(maGD)) {
                danhSachGD.remove(i);
                break;
            }
        }
        return danhSachGD;
    }

    public ArrayList<PhongKham> xoaPhongKham(String maPK) {
        for (int i = 0; i < danhSachPK.size(); i++) {
            if (danhSachPK.get(i).maPK.equals(maPK)) {
                danhSachPK.remove(i);
                break;
            }
        }
        return danhSachPK;
    }

    // Sửa bệnh nhân (có nhập từ bàn phím như editBook)
    public ArrayList<BenhNhan> suaBenhNhan(String maBN) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < danhSachBN.size(); i++) {
            if (danhSachBN.get(i).maBN.equals(maBN)) {
                System.out.print("Nhập tên mới: ");
                String tenMoi = sc.nextLine();
                System.out.print("Nhập tuổi mới: ");
                int tuoiMoi = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập giới tính mới: ");
                String gioiTinhMoi = sc.nextLine();

                danhSachBN.get(i).ten = tenMoi;
                danhSachBN.get(i).tuoi = tuoiMoi;
                danhSachBN.get(i).gioiTinh = gioiTinhMoi;
                break;
            }
        }
        return danhSachBN;
    }

    // Hiển thị
    public void hienThiBenhNhan() {
        for (BenhNhan bn : danhSachBN) {
            System.out.println("Mã BN: " + bn.maBN);
            System.out.println("Tên: " + bn.ten);
            System.out.println("Tuổi: " + bn.tuoi);
            System.out.println("Giới tính: " + bn.gioiTinh);
            System.out.println();
        }
    }

    public void hienThiGiaoDich() {
        for (GiaoDich gd : danhSachGD) {
            System.out.println("Mã GD: " + gd.maGD);
            System.out.println("Mã BN: " + gd.maBN);
            System.out.println("Số tiền: " + gd.soTien);
            System.out.println("Ngày GD: " + gd.ngayGD);
            System.out.println();
        }
    }

    public void hienThiPhongKham() {
        for (PhongKham pk : danhSachPK) {
            System.out.println("Mã PK: " + pk.maPK);
            System.out.println("Tên: " + pk.tenPK);
            System.out.println("Địa chỉ: " + pk.diaChi);
            System.out.println();
        }
    }
}
