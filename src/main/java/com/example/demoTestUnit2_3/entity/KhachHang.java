package com.example.demoTestUnit2_3.entity;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private Integer tuoi;
    private String email;
    private String sdt;

    public KhachHang(String maKH, String tenKH, Integer tuoi, String email, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tuoi = tuoi;
        this.email = email;
        this.sdt = sdt;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
