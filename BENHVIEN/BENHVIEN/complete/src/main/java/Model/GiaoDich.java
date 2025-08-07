package com.example.servingwebcontent.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class GiaoDich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long benhNhanId;
    private String loaiGiaoDich;
    private LocalDateTime thoiGian;

    public GiaoDich() {
    }

    public GiaoDich(Long benhNhanId, String loaiGiaoDich) {
        this.benhNhanId = benhNhanId;
        this.loaiGiaoDich = loaiGiaoDich;
        this.thoiGian = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBenhNhanId() {
        return benhNhanId;
    }

    public void setBenhNhanId(Long benhNhanId) {
        this.benhNhanId = benhNhanId;
    }

    public String getLoaiGiaoDich() {
        return loaiGiaoDich;
    }

    public void setLoaiGiaoDich(String loaiGiaoDich) {
        this.loaiGiaoDich = loaiGiaoDich;
    }

    public LocalDateTime getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(LocalDateTime thoiGian) {
        this.thoiGian = thoiGian;
    }
}