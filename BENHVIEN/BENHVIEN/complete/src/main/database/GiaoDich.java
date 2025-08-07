package database;

import java.time.LocalDate;

public class GiaoDich {
    private String maGD;
    private String maBN;
    private String maPhong;
    private LocalDate ngay;
    private double soTien;

    public GiaoDich(String maGD, String maBN, String maPhong, LocalDate ngay, double soTien) {
        this.maGD = maGD;
        this.maBN = maBN;
        this.maPhong = maPhong;
        this.ngay = ngay;
        this.soTien = soTien;
    }

    public String getMaGD() {
        return maGD;
    }

    public String getMaBN() {
        return maBN;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public LocalDate getNgay() {
        return ngay;
    }

    public double getSoTien() {
        return soTien;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGD='" + maGD + '\'' +
                ", maBN='" + maBN + '\'' +
                ", maPhong='" + maPhong + '\'' +
                ", ngay=" + ngay +
                ", soTien=" + soTien +
                '}';
    }
}

