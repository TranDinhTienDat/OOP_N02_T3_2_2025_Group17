public class MedicalRecord {
    private Patient patient;
    private String diagnosis;
    private String treatment;

    public MedicalRecord(Patient patient, String diagnosis, String treatment) {
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public void printRecord() {
        System.out.println("Hồ sơ bệnh án cho " + patient.getName());
        System.out.println("Chẩn đoán: " + diagnosis);
        System.out.println("Phác đồ điều trị: " + treatment);
    }
}
