package com.example.demoTestUnit2_3.service;

import com.example.demoTestUnit2_3.entity.KhachHang;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KhachHangServiceTest {

    private KhachHangService khachHangService;

    @BeforeEach
    void setUp() {

        khachHangService = new KhachHangService();
        khachHangService.addKhachHang(new KhachHang("ma001", "a", 18, "duccuong@gmai.com", "09432432"));
        khachHangService.addKhachHang(new KhachHang("ma002", "b", 18, "duccuong@gmai.com", "09432432"));
        khachHangService.addKhachHang(new KhachHang("ma003", "c", 100, "duccuong@gmai.com", "09432432"));
        khachHangService.addKhachHang(new KhachHang("ma004", "h", 100, "duccuong@gmai.com", "09432432"));
    }

    @Test
    void searchKhachHangHopLe() {
        assertEquals("ma001", khachHangService.searchKhachHang("ma001").getMaKH());
    }

    @Test
    void searchKhachHangKhongHopLe() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> khachHangService.searchKhachHang("ma0077").getMaKH());
        assertEquals("Khong tim thay maKH", exception.getMessage());
    }

    @Test
    void searchKhachHangNul() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> khachHangService.searchKhachHang(null).getMaKH());
        assertEquals("Không được để trống", exception.getMessage());
    }

    @Test
    void searchKhachHang_EmptyMaKh() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> khachHangService.searchKhachHang("").getMaKH());
        assertEquals("Không được để trống", exception.getMessage());
    }

 @Test
    void searchKhachHang_DoDaiToiTieu() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> khachHangService.searchKhachHang("m").getMaKH());
        assertEquals("Mã khách hàng phải có từ 2 đến 50 ký tự", exception.getMessage());
    }



}