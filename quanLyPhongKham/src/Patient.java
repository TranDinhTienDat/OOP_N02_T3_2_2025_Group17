public class Patient {
    private String name;
    private int age;
    private String diagnosis; // Bệnh lý
    private String bloodType; // Nhóm máu
    private double medicalCost; // Chi phí

    // Constructor
    public Patient(String name, int age, String diagnosis, String bloodType) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.bloodType = bloodType;
        this.medicalCost = 0; // Khởi tạo chi phí ban đầu
    }

    // Getter & Setter
    public String getName() { return name; }
    public double getMedicalCost() { return medicalCost; }
    public void addMedicalCost(double cost) { this.medicalCost += cost; }

    // In thông tin
    @Override
    public String toString() {
        return "Bệnh nhân: " + name + ", Tuổi: " + age + ", Bệnh: " + diagnosis;
    }
}