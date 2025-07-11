public class Patient extends User {
    private String patientId;
    private String phone;

    public Patient(String name, String email, int age, String patientId, String phone) {
        super(name, email, age);
        this.patientId = patientId;
        this.phone = phone;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPhone() {
        return phone;
    }
}
