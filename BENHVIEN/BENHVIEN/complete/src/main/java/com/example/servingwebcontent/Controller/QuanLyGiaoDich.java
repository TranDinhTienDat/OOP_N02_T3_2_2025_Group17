package com.example.servingwebcontent.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.servingwebcontent.Model.GiaoDich;

public class QuanLyGiaoDich {

    private final List<GiaoDich> danhSach = new ArrayList<>();

    public void them(GiaoDich giaoDich) {
        if (giaoDich != null) {
            danhSach.add(giaoDich);
        }
    }

    public void xoa(int chiSo) {
        if (chiSo >= 0 && chiSo < danhSach.size()) {
            danhSach.remove(chiSo);
        }
    }

    public List<GiaoDich> layDanhSach() {
        return new ArrayList<>(danhSach);
    }
}
