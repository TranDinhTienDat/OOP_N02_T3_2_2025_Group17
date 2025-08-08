package com.example.servingwebcontent.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.servingwebcontent.Model.BenhNhan;

public class QuanLyBenhNhan {

    private final List<BenhNhan> danhSach = new ArrayList<>();

    public void them(BenhNhan benhNhan) {
        if (benhNhan != null) {
            danhSach.add(benhNhan);
        }
    }

     public List<BenhNhan> getDanhSach() {
        return danhSach;
    }

    public void xoa(int chiSo) {
        if (chiSo >= 0 && chiSo < danhSach.size()) {
            danhSach.remove(chiSo);
        }
    }

    public List<BenhNhan> layDanhSach() {
        return new ArrayList<>(danhSach);
    }
}
