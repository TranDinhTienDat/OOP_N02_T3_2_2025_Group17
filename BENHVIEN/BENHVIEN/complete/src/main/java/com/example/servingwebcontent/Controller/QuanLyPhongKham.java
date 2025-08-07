package com.example.servingwebcontent.Controller;

import com.example.servingwebcontent.Model.PhongKham;
import com.example.servingwebcontent.Repository.PhongKhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuanLyPhongKham {

    @Autowired
    private PhongKhamRepository phongKhamRepository;

    @GetMapping("/phongkham")
    public String listPhongKham(Model model) {
        model.addAttribute("phongKhams", phongKhamRepository.findAll());
        return "phongkham";
    }

    @PostMapping("/phongkham/add")
    public String addPhongKham(@RequestParam String tenPhong, @RequestParam String chuyenKhoa) {
        PhongKham phongKham = new PhongKham(tenPhong, chuyenKhoa);
        phongKhamRepository.save(phongKham);
        return "redirect:/phongkham";
    }
}