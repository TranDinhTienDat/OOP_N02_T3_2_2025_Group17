public class Doctor extends User {
    private String specialty;
    private String licenseNumber;

    public Doctor(String name, String email, int age, String specialty, String licenseNumber) {
        super(name, email, age);
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
