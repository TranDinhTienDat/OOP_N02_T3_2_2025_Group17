public class testPatient {
    public static void test() {
        // Tạo bệnh nhân
        Patient patient = new Patient("Nguyễn Văn A", 30, "Viêm phổi", "A+");

        // Tạo bác sĩ
      //  Doctor doctor = new Doctor("Trần Thị B", "Nội khoa", "Thứ 2-4-6, 8h-12h");

        // Tạo lịch hẹn
        /* 
        Appointment appointment = new Appointment(
            LocalDateTime.of(2023, 12, 15, 9, 0),
            doctor,
            patient
        );
        */
        // Thêm thuốc cho bệnh nhân
      //  Medication med = new Medication("Paracetamol", "500mg", "Uống sau ăn");
        patient.addMedicalCost(150000); // Thêm chi phí thuốc

        // In thông tin
      //  System.out.println("Lịch hẹn: " + appointment.getTime());
     //   System.out.println("Bác sĩ: " + doctor.getName());
        System.out.println("Bệnh nhân: " + patient.getName());
        System.out.println("Tổng chi phí: " + patient.getMedicalCost() + " VND");
    }
}