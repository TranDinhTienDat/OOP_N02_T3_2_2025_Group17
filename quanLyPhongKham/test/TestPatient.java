public class TestPatient {
    public static void TestPatient() {
        Patient p = new Patient("Lan", "lan@gmail.com", 25, "BN02", "0912345678");
        System.out.println("Tên bệnh nhân: " + p.getName());
        System.out.println("Mã: " + p.getPatientId());
        System.out.println("SĐT: " + p.getPhone());
    }
}

