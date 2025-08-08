package com.example.servingwebcontent.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.servingwebcontent.Model.PhongKham;

public class QuanLyPhongKham {

    private final List<PhongKham> danhSach = new ArrayList<>();

    public void them(PhongKham phongKham) {
        if (phongKham != null) {
            danhSach.add(phongKham);
        }
    }

    public void xoa(int chiSo) {
        if (chiSo >= 0 && chiSo < danhSach.size()) {
            danhSach.remove(chiSo);
        }
    }

    public List<PhongKham> layDanhSach() {
        return new ArrayList<>(danhSach);
    }
}
