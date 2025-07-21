

public class TestHienThiGiaoDich {
    public static void testHienThiGiaoDich() {
        DanhSachGiaoDich gd = new DanhSachGiaoDich();

        GiaoDich g1 = new GiaoDich("GD01", "BN01", 500000, "2025-07-20");
        GiaoDich g2 = new GiaoDich("GD02", "BN02", 800000, "2025-07-21");

        gd.themGiaoDich(g1);
        gd.themGiaoDich(g2);

        gd.hienThiGiaoDich();
    }
}

