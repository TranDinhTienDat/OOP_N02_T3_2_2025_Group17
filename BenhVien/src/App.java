public class App {
    public static void main(String[] args) {
        PhongKham phongKham = new PhongKham("Phòng Khám ABC", "123 Đường Lê Lợi");

        BenhNhan bn1 = new BenhNhan("BN001", "Nguyễn Văn A", 35, "Nam");
        phongKham.themBenhNhan(bn1);

        GiaoDich gd1 = new GiaoDich("GD001", "BN001", 500000, "2025-07-13");

        System.out.println(phongKham);
        phongKham.hienThiBenhNhan();
        System.out.println(gd1);
    }
}

