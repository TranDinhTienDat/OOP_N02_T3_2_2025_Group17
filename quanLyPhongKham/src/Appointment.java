import java.time.LocalDateTime;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime time;

    public Appointment(Patient patient, Doctor doctor, LocalDateTime time) {
        this.patient = patient;
        this.doctor = doctor;
        this.time = time;
    }

    public void showInfo() {
        System.out.println("Lịch hẹn:");
        System.out.println("Bệnh nhân: " + patient.getName() + " | SĐT: " + patient.getPhone());
        System.out.println("Bác sĩ: " + doctor.getName() + " | Chuyên khoa: " + doctor.getSpecialty());
        System.out.println("Thời gian: " + time);
    }
}
