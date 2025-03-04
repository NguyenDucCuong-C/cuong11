package com.example.demoTestUnit2_3.service;

import com.example.demoTestUnit2_3.entity.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {
    List<KhachHang> khachHangs = new ArrayList<>();

    public void validateKhachHang(KhachHang kh) {
        if (kh == null) {
            throw new IllegalArgumentException("Khách hàng không dược null");
        }
        if (kh.getMaKH() == null || kh.getMaKH().trim().isEmpty() ||
                kh.getTenKH() == null || kh.getTenKH().trim().isEmpty() ||
                kh.getEmail() == null || kh.getEmail().trim().isEmpty() ||
                kh.getSdt() == null || kh.getSdt().trim().isEmpty()
        ) {
            throw new IllegalArgumentException("Không được để trống");
        }
        if (kh.getTuoi() < 18 || kh.getTuoi() > 100) {
            throw new IllegalArgumentException("Nhập sai dữ liệu");
        }
    }


    public void addKhachHang(KhachHang khachHang) {
        validateKhachHang(khachHang);
        khachHangs.add(khachHang);
    }

    public KhachHang searchKhachHang(String maKh) {
        if (maKh == null || maKh.trim().isEmpty()) {
            throw new IllegalArgumentException("Không được để trống");
        }
        if (maKh.length() < 2 || maKh.length() > 50) {
            throw new IllegalArgumentException("Mã khách hàng phải có từ 2 đến 50 ký tự");
        }
        for (KhachHang khachHang : khachHangs) {
            if (khachHang.getMaKH().equals(maKh)) {
                return khachHang;
            }
        }

        throw new IllegalArgumentException("Khong tim thay maKH");
    }


//    public List<KhachHang> getAll() {
//        return khachHangs;
//    }
}
