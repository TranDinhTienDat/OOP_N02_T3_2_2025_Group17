public class TestQuanLy {
    public static void test() {

        QuanLyPhongKham ql = new QuanLyPhongKham();

        // Thêm bệnh nhân
        BenhNhan bn1 = new BenhNhan("BN01", "Nguyen Van A", 25, "Nam");
        BenhNhan bn2 = new BenhNhan("BN02", "Tran Thi B", 30, "Nu");

        ql.themBenhNhan(bn1);
        ql.themBenhNhan(bn2);

        System.out.println("=========== Danh sách sau khi thêm Bệnh Nhân ===========");
        ql.hienThiBenhNhan();

        // Xoá bệnh nhân
        System.out.println("=========== Danh sách sau khi xoá BN01 ===========");
        ql.xoaBenhNhan("BN01");
        ql.hienThiBenhNhan();

        // Sửa bệnh nhân
        System.out.println("=========== Danh sách sau khi sửa BN02 ===========");
        ql.suaBenhNhan("BN02"); // Nhập dữ liệu mới từ bàn phím
        ql.hienThiBenhNhan();

        // Thêm giao dịch
        GiaoDich gd1 = new GiaoDich("GD01", "BN02", 150000, "18/07/2025");
        ql.themGiaoDich(gd1);

        System.out.println("=========== Danh sách Giao Dịch ===========");
        ql.hienThiGiaoDich();

        // Thêm phòng khám
        PhongKham pk1 = new PhongKham("PK01", "Phong Kham Trung Tam", "123 ABC Street");
        ql.themPhongKham(pk1);

        System.out.println("=========== Danh sách Phòng Khám ===========");
        ql.hienThiPhongKham();
    }
}

