public class TestQuanLy {
    public static void test() {
        QuanLyPhongKham ql = new QuanLyPhongKham();

        // Thêm dữ liệu mẫu
        ql.themBenhNhan(new BenhNhan("BN01", "Nguyen Van A", 25, "Nam"));
        ql.themBenhNhan(new BenhNhan("BN02", "Tran Thi B", 30, "Nữ"));

        ql.themGiaoDich(new GiaoDich("GD01", "BN01", 150000, "18/07/2025"));
        ql.themGiaoDich(new GiaoDich("GD02", "BN02", 200000, "18/07/2025"));

        ql.themPhongKham(new PhongKham("PK01", "PK Trung Tam", "123 ABC"));
        ql.themPhongKham(new PhongKham("PK02", "PK Quận 1", "456 XYZ"));

        // In ra danh sách
        System.out.println("\n--- Danh sách Bệnh Nhân ---");
        ql.hienThiBenhNhan();

        System.out.println("\n--- Danh sách Giao Dịch ---");
        ql.hienThiGiaoDich();

        System.out.println("\n--- Danh sách Phòng Khám ---");
        ql.hienThiPhongKham();
    }
}
