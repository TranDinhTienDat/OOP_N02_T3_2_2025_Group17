package com.example.servingwebcontent.Model;

public class BenhNhan {
    private String ten;
    private String soDienThoai;

    public BenhNhan(String ten, String soDienThoai) {
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public String layTen() {
        return ten;
    }

    public String laySoDienThoai() {
        return soDienThoai;
    }
}
