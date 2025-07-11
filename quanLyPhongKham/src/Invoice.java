public class Invoice {
    private Patient patient;
    private double amount;
    private String service;

    public Invoice(Patient patient, double amount, String service) {
        this.patient = patient;
        this.amount = amount;
        this.service = service;
    }

    public void printInvoice() {
        System.out.println("Hóa đơn cho bệnh nhân: " + patient.getName());
        System.out.println("Dịch vụ: " + service);
        System.out.println("Tổng tiền: " + amount + " VND");
    }
}

