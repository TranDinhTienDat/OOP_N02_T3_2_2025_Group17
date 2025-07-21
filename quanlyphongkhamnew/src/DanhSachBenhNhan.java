import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachBenhNhan {
    ArrayList<BenhNhan> danhSachBN = new ArrayList<>();

    public ArrayList<BenhNhan> themBenhNhan(BenhNhan bn) {
        danhSachBN.add(bn);
        return danhSachBN;
    }

    public ArrayList<BenhNhan> suaBenhNhan(String maBN) {
        Scanner sc = new Scanner(System.in);
        for (BenhNhan b : danhSachBN) {
            if (b.maBN.equals(maBN)) {
                System.out.print("Tên mới: ");
                b.ten = sc.nextLine();
                System.out.print("Tuổi mới: ");
                b.tuoi = Integer.parseInt(sc.nextLine());
                System.out.print("Giới tính mới: ");
                b.gioiTinh = sc.nextLine();
            }
        }
        return danhSachBN;
    }
}