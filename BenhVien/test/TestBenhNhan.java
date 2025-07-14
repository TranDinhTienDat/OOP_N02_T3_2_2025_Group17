public class TestBenhNhan {
    public static void TestBenhNhan() {
        BenhNhan bn = new BenhNhan("BN01", "Nguyen Van A", 28, "Nam");

        System.out.println("== THÔNG TIN BỆNH NHÂN ==");
        System.out.println("Mã: " + bn.getMa());
        System.out.println("Tên: " + bn.getTen());
        System.out.println("Tuổi: " + bn.getTuoi());
        System.out.println("Giới tính: " + bn.getGioiTinh());

        System.out.println("\nDạng toString(): " + bn.toString());
    }
}

