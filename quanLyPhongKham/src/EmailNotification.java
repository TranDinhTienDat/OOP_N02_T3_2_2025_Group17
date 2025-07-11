public class EmailNotification {
    public static void send(Patient patient, String message) {
        System.out.println("Gửi email tới: " + patient.getEmail());
        System.out.println("Nội dung: " + message);
    }
}
