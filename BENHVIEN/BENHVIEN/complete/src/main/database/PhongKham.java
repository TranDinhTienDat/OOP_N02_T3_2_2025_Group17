package database;

public class PhongKham {
    private String maPhong;
    private String tenPhong;
    private String chuyenKhoa;

    public PhongKham(String maPhong, String tenPhong, String chuyenKhoa) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.chuyenKhoa = chuyenKhoa;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    @Override
    public String toString() {
        return "PhongKham{" +
                "maPhong='" + maPhong + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", chuyenKhoa='" + chuyenKhoa + '\'' +
                '}';
    }
}

