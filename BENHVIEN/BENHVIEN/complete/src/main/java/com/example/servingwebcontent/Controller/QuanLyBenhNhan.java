package com.example.servingwebcontent.Controller;

import com.example.servingwebcontent.Model.BenhNhan;
import com.example.servingwebcontent.Repository.BenhNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuanLyBenhNhan {

    @Autowired
    private BenhNhanRepository benhNhanRepository;

    @GetMapping("/benhnhan")
    public String listBenhNhan(Model model) {
        model.addAttribute("benhNhans", benhNhanRepository.findAll());
        return "benhnhan";
    }

    @PostMapping("/benhnhan/add")
    public String addBenhNhan(@RequestParam String hoTen, @RequestParam int tuoi, @RequestParam String gioiTinh) {
        BenhNhan benhNhan = new BenhNhan(hoTen, tuoi, gioiTinh);
        benhNhanRepository.save(benhNhan);
        return "redirect:/benhnhan";
    }
}