package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

    private List<BenhNhan> danhSachBenhNhan = new ArrayList<>();
    private List<PhongKham> danhSachPhongKham = new ArrayList<>();
    private List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

    // ------------------ THÊM MỚI ------------------
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "Khách") String name,
            @RequestParam(name = "age", required = false, defaultValue = "") String age,
            @RequestParam(name = "disease", required = false, defaultValue = "") String disease,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("disease", disease);
        return "greeting";
    }
    // -----------------------------------------------

    @GetMapping("/benhvien")
    public String benhVien(Model model) {
        // Thêm dữ liệu mẫu nếu danh sách rỗng
        if (danhSachBenhNhan.isEmpty()) {
            danhSachBenhNhan.add(new BenhNhan("Nguyễn Văn A", "0123456789"));
            danhSachBenhNhan.add(new BenhNhan("Trần Thị B", "0987654321"));
        }
        if (danhSachPhongKham.isEmpty()) {
            danhSachPhongKham.add(new PhongKham("Phòng Nội", "Nội tổng quát"));
            danhSachPhongKham.add(new PhongKham("Phòng Ngoại", "Ngoại chấn thương"));
        }

        model.addAttribute("danhSachBenhNhan", danhSachBenhNhan);
        model.addAttribute("danhSachPhongKham", danhSachPhongKham);
        model.addAttribute("danhSachGiaoDich", danhSachGiaoDich);
        return "benhvien";
    }

    @PostMapping("/themBenhNhan")
    public String themBenhNhan(@RequestParam String ten, @RequestParam String soDienThoai) {
        BenhNhan benhNhan = new BenhNhan(ten, soDienThoai);
        danhSachBenhNhan.add(benhNhan);
        return "redirect:/benhvien";
    }

    @PostMapping("/themPhongKham")
    public String themPhongKham(@RequestParam String tenPhong, @RequestParam String chuyenKhoa) {
        PhongKham phongKham = new PhongKham(tenPhong, chuyenKhoa);
        danhSachPhongKham.add(phongKham);
        return "redirect:/benhvien";
    }

    @PostMapping("/themGiaoDich")
    public String themGiaoDich(
            @RequestParam int benhNhanIndex,
            @RequestParam int phongKhamIndex,
            @RequestParam String ngayHen,
            @RequestParam String gioHen,
            @RequestParam(required = false) String ghiChu) {
        
        if (benhNhanIndex >= 0 && benhNhanIndex < danhSachBenhNhan.size() &&
            phongKhamIndex >= 0 && phongKhamIndex < danhSachPhongKham.size()) {
            
            BenhNhan benhNhan = danhSachBenhNhan.get(benhNhanIndex);
            PhongKham phongKham = danhSachPhongKham.get(phongKhamIndex);
            String thoiGian = ngayHen + " " + gioHen;
            
            GiaoDich giaoDich = new GiaoDich(benhNhan, phongKham, thoiGian, ghiChu);
            danhSachGiaoDich.add(giaoDich);
        }
        
        return "redirect:/benhvien";
    }

    @GetMapping("/xoaBenhNhan/{index}")
    public String xoaBenhNhan(@PathVariable int index) {
        if (index >= 0 && index < danhSachBenhNhan.size()) {
            danhSachBenhNhan.remove(index);
        }
        return "redirect:/benhvien";
    }

    @GetMapping("/xoaPhongKham/{index}")
    public String xoaPhongKham(@PathVariable int index) {
        if (index >= 0 && index < danhSachPhongKham.size()) {
            danhSachPhongKham.remove(index);
        }
        return "redirect:/benhvien";
    }

    // Các lớp model
    public static class BenhNhan {
        private String ten;
        private String soDienThoai;

        public BenhNhan(String ten, String soDienThoai) {
            this.ten = ten;
            this.soDienThoai = soDienThoai;
        }

        public String getTen() { return ten; }
        public String getSoDienThoai() { return soDienThoai; }
    }

    public static class PhongKham {
        private String tenPhong;
        private String chuyenKhoa;

        public PhongKham(String tenPhong, String chuyenKhoa) {
            this.tenPhong = tenPhong;
            this.chuyenKhoa = chuyenKhoa;
        }

        public String getTenPhong() { return tenPhong; }
        public String getChuyenKhoa() { return chuyenKhoa; }
    }

    public static class GiaoDich {
        private BenhNhan benhNhan;
        private PhongKham phongKham;
        private String thoiGian;
        private String ghiChu;

        public GiaoDich(BenhNhan benhNhan, PhongKham phongKham, String thoiGian, String ghiChu) {
            this.benhNhan = benhNhan;
            this.phongKham = phongKham;
            this.thoiGian = thoiGian;
            this.ghiChu = ghiChu;
        }

        public BenhNhan getBenhNhan() { return benhNhan; }
        public PhongKham getPhongKham() { return phongKham; }
        public String getThoiGian() { return thoiGian; }
        public String getGhiChu() { return ghiChu; }
    }
}
