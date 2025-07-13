public class GiaoDich {
    private String maGiaoDich;
    private String maBenhNhan;
    private double soTien;
    private String ngay;

    public GiaoDich(String maGiaoDich, String maBenhNhan, double soTien, String ngay) {
        this.maGiaoDich = maGiaoDich;
        this.maBenhNhan = maBenhNhan;
        this.soTien = soTien;
        this.ngay = ngay;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public double getSoTien() {
        return soTien;
    }

    public String getNgay() {
        return ngay;
    }
    public String toString() {
        return "Mã giao dịch: " + maGiaoDich +
               ", Mã bệnh nhân: " + maBenhNhan +
               ", Số tiền: " + soTien +
               ", Ngày: " + ngay;
    }
}
