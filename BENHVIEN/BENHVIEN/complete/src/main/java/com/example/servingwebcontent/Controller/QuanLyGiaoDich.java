package com.example.servingwebcontent.Controller;

import com.example.servingwebcontent.Model.GiaoDich;
import com.example.servingwebcontent.Repository.GiaoDichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuanLyGiaoDich {

    @Autowired
    private GiaoDichRepository giaoDichRepository;

    @GetMapping("/giaodich")
    public String listGiaoDich(Model model) {
        model.addAttribute("giaoDichs", giaoDichRepository.findAll());
        return "giaodich";
    }

    @PostMapping("/giaodich/add")
    public String addGiaoDich(@RequestParam Long benhNhanId, @RequestParam String loaiGiaoDich) {
        GiaoDich giaoDich = new GiaoDich(benhNhanId, loaiGiaoDich);
        giaoDichRepository.save(giaoDich);
        return "redirect:/giaodich";
    }
}