public class BenhNhan {
    private String ma;
    private String ten;
    private int tuoi;
    private String gioiTinh;

    public BenhNhan(String ma, String ten, int tuoi, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
    public String toString() {
        return "Mã: " + ma +
               ", Tên: " + ten +
               ", Tuổi: " + tuoi +
               ", Giới tính: " + gioiTinh;
    }
}
