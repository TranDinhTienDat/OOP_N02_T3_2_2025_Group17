package com.example.servingwebcontent.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import quanlybenhvien.servingwebcontent.controller.QuanLyBenhNhan;
import quanlybenhvien.servingwebcontent.controller.QuanLyGiaoDich;
import quanlybenhvien.servingwebcontent.controller.QuanLyPhongKham;
import quanlybenhvien.servingwebcontent.model.BenhNhan;
import quanlybenhvien.servingwebcontent.model.GiaoDich;
import quanlybenhvien.servingwebcontent.model.PhongKham;

@Controller
public class GreetingController {

    private static final QuanLyBenhNhan quanLyBenhNhan = new QuanLyBenhNhan();
    private static final QuanLyPhongKham quanLyPhongKham = new QuanLyPhongKham();
    private static final QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich();

    static {
        quanLyBenhNhan.them(new BenhNhan("Nguyễn Văn A", "0909123456"));
        quanLyBenhNhan.them(new BenhNhan("Trần Thị B", "0912345678"));
        quanLyPhongKham.them(new PhongKham("Phòng Cấp Cứu", "Cấp cứu"));
        quanLyPhongKham.them(new PhongKham("Phòng Nội", "Nội khoa"));
        quanLyGiaoDich.them(new GiaoDich(
            quanLyBenhNhan.getDanhSach().get(0),
            quanLyPhongKham.getDanhSach().get(0),
            "10:00 AM"
        ));
    }

    // Thêm bệnh nhân
    @GetMapping("/patient")
    public String themBenhNhan(
        @RequestParam(name = "name", required = false, defaultValue = "Khách lạ") String name,
        @RequestParam(name = "phone", required = false, defaultValue = "Không rõ") String phone,
        Model model) {

        BenhNhan benhNhan = new BenhNhan(name, phone);
        quanLyBenhNhan.them(benhNhan);
        return "redirect:/benhvien";
    }

    // Xóa bệnh nhân
    @GetMapping("/patient/delete")
    public String xoaBenhNhan(@RequestParam(name = "index") int index) {
        quanLyBenhNhan.xoa(index);
        return "redirect:/benhvien";
    }

    // Thêm phòng khám
    @GetMapping("/room")
    public String themPhongKham(
        @RequestParam(name = "name", required = false, defaultValue = "Phòng khám chung") String name,
        @RequestParam(name = "specialty", required = false, defaultValue = "Tổng quát") String specialty,
        Model model) {

        PhongKham phongKham = new PhongKham(name, specialty);
        quanLyPhongKham.them(phongKham);
        return "redirect:/benhvien";
    }

    // Thêm giao dịch
    @GetMapping("/transaction")
    public String themGiaoDich(
        @RequestParam(name = "patientName", required = false, defaultValue = "Nguyễn Văn A") String patientName,
        @RequestParam(name = "patientPhone", required = false, defaultValue = "0909123456") String patientPhone,
        @RequestParam(name = "roomName", required = false, defaultValue = "Phòng Cấp Cứu") String roomName,
        @RequestParam(name = "roomSpecialty", required = false, defaultValue = "Cấp cứu") String roomSpecialty,
        @RequestParam(name = "time", required = false, defaultValue = "11:00 AM") String time,
        Model model) {

        BenhNhan benhNhan = new BenhNhan(patientName, patientPhone);
        PhongKham phongKham = new PhongKham(roomName, roomSpecialty);
        GiaoDich giaoDich = new GiaoDich(benhNhan, phongKham, time);
        quanLyGiaoDich.them(giaoDich);
        return "redirect:/benhvien";
    }

    // Trang chính hiển thị danh sách
    @GetMapping("/benhvien")
    public String benhvien(Model model) {
        model.addAttribute("patients", quanLyBenhNhan.getDanhSach());
        model.addAttribute("rooms", quanLyPhongKham.getDanhSach());
        model.addAttribute("transactions", quanLyGiaoDich.getDanhSach());
        return "benhvien";
    }
}