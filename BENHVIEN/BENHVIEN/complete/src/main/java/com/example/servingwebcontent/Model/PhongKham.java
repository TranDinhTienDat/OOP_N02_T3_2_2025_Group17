package com.example.servingwebcontent.Model;

public class PhongKham {
    private String ten;
    private String diaChi;

    public PhongKham(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public String layTen() {
        return ten;
    }

    public String layDiaChi() {
        return diaChi;
    }
}
