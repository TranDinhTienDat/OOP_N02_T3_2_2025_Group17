public class TestPhongKham {
    public static void TestPhongKham() {
        PhongKham pk = new PhongKham("Phòng Khám Thân Thiện", "123 Đường Sức Khỏe, Quận 5");

        // Tạo vài bệnh nhân
        BenhNhan bn1 = new BenhNhan("BN01", "Nguyễn Văn A", 30, "Nam");
        BenhNhan bn2 = new BenhNhan("BN02", "Trần Thị B", 25, "Nữ");

        // Thêm bệnh nhân vào phòng khám
        pk.themBenhNhan(bn1);
        pk.themBenhNhan(bn2);

        // Hiển thị danh sách
        pk.hienThiBenhNhan();

        // In thông tin phòng khám
        System.out.println("\nThông tin phòng khám:");
        System.out.println(pk);
    }
}
