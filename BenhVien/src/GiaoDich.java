public class GiaoDich {
    private String maGiaoDich;
    private String maBenhNhan;
    private double soTien;
    private String ngayGiaoDich;

    public GiaoDich(String maGiaoDich, String maBenhNhan, double soTien, String ngayGiaoDich) {
        this.maGiaoDich = maGiaoDich;
        this.maBenhNhan = maBenhNhan;
        this.soTien = soTien;
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getMaGiaoDich() { return maGiaoDich; }
    public String getMaBenhNhan() { return maBenhNhan; }
    public double getSoTien() { return soTien; }
    public String getNgayGiaoDich() { return ngayGiaoDich; }

    public void setMaGiaoDich(String maGiaoDich) { this.maGiaoDich = maGiaoDich; }
    public void setMaBenhNhan(String maBenhNhan) { this.maBenhNhan = maBenhNhan; }
    public void setSoTien(double soTien) { this.soTien = soTien; }
    public void setNgayGiaoDich(String ngayGiaoDich) { this.ngayGiaoDich = ngayGiaoDich; }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGD='" + maGiaoDich + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", soTien=" + soTien +
                ", ngay='" + ngayGiaoDich + '\'' +
                '}';
    }
}
