public class BenhNhan {
    private String maBN;
    private String ten;
    private int tuoi;
    private String gioiTinh;

    public BenhNhan(String maBN, String ten, int tuoi, String gioiTinh) {
        this.maBN = maBN;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaBN() {
        return maBN;
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

    @Override
    public String toString() {
        return "BenhNhan{" +
                "maBN='" + maBN + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
}