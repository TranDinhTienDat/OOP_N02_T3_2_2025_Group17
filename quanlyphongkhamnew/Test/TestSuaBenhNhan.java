

public class TestSuaBenhNhan {
    public static void testSuaBenhNhan() {
        DanhSachBenhNhan dsc = new DanhSachBenhNhan();

        // Thêm bệnh nhân ban đầu
        BenhNhan bn = new BenhNhan("BN01", "Tran Van C", 40, "Nam");
        dsc.themBenhNhan(bn);

        // In trước khi sửa
        System.out.println("Trước khi sửa:");
        for (BenhNhan b : dsc.danhSachBN) {
            System.out.println(b);
        }

        // Tiến hành sửa
        dsc.suaBenhNhan("BN01");

        // In sau khi sửa
        System.out.println("Sau khi sửa:");
        for (BenhNhan b : dsc.danhSachBN) {
            System.out.println(b);
        }
    }
}
