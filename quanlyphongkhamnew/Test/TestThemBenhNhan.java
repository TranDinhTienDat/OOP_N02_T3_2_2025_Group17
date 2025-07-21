

public class TestThemBenhNhan {
    public static void testThemBenhNhan() {
        DanhSachBenhNhan dsc = new DanhSachBenhNhan();
        
        BenhNhan bn1 = new BenhNhan("BN01", "Nguyen Van A", 30, "Nam");
        dsc.themBenhNhan(bn1);

        BenhNhan bn2 = new BenhNhan("BN02", "Le Thi B", 28, "Nu");
        dsc.themBenhNhan(bn2);

        for (BenhNhan bn : dsc.danhSachBN) {
            System.out.println(bn);
        }
    }
}
