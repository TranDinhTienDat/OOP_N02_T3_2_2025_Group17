public class App {
    public static void main(String[] args) {
        // Tao phong kham
        PhongKham phongKham = new PhongKham("Phong Kham ABC", "123 Duong Le Loi");

        // Tao benh nhan
        BenhNhan bn1 = new BenhNhan("BN001", "Nguyen Van A", 35, "Nam");
        BenhNhan bn2 = new BenhNhan("BN002", "Tran Thi B", 29, "Nu");

        // Them benh nhan vao phong kham
        phongKham.themBenhNhan(bn1);
        phongKham.themBenhNhan(bn2);

        // Tao giao dich
        GiaoDich gd1 = new GiaoDich("GD001", "BN001", 500000, "2025-07-13");
        GiaoDich gd2 = new GiaoDich("GD002", "BN002", 300000, "2025-07-14");

        // Hien thi thong tin
        System.out.println(phongKham);
        phongKham.hienThiBenhNhan();
        System.out.println(gd1);
        System.out.println(gd2);
    }
}
