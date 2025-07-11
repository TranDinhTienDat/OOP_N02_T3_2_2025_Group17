public class Room {
    private String roomId;
    private String type;
    private boolean isAvailable;

    public Room(String roomId, String type, boolean isAvailable) {
        this.roomId = roomId;
        this.type = type;
        this.isAvailable = isAvailable;
    }

    public void showStatus() {
        System.out.println("Phòng: " + roomId + " | Loại: " + type + " | Trạng thái: " + (isAvailable ? "Còn trống" : "Đang sử dụng"));
    }
}
