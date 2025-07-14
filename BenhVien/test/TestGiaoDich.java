public class TestGiaoDich {
    public static void TestGiaoDich() {
        GiaoDich gd = new GiaoDich("GD001", "BN01", 500_000, "2025-07-04");

        System.out.println("== THÔNG TIN GIAO DỊCH ==");
        System.out.println("Mã GD: " + gd.getMaGiaoDich());
        System.out.println("Mã bệnh nhân: " + gd.getMaBenhNhan());
        System.out.println("Số tiền: " + gd.getSoTien());
        System.out.println("Ngày: " + gd.getNgayGiaoDich());

        System.out.println("\nDạng toString(): " + gd.toString());
    }
}

