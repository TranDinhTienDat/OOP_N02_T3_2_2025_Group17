package com.example.servingwebcontent.Model;
public class GiaoDich {
    private BenhNhan benhNhan;
    private PhongKham phongKham;
    private String ngayKham;

    public GiaoDich(BenhNhan benhNhan, PhongKham phongKham, String ngayKham) {
        this.benhNhan = benhNhan;
        this.phongKham = phongKham;
        this.ngayKham = ngayKham;
    }

    public BenhNhan layBenhNhan() {
        return benhNhan;
    }

    public PhongKham layPhongKham() {
        return phongKham;
    }

    public String layNgayKham() {
        return ngayKham;
    }
}
