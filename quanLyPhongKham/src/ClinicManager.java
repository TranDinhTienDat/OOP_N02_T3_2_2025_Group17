import java.util.ArrayList;

public class ClinicManager {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addAppointment(Appointment a) {
        appointments.add(a);
    }

    public void showAllAppointments() {
        for (Appointment a : appointments) {
            a.showInfo();
            System.out.println("-----");
        }
    }
}
