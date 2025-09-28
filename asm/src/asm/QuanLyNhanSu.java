/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author Admin
 */
import java.util.*;

public class QuanLyNhanSu {
    private ArrayList<NhanVien> ds = new ArrayList<>();

    public void nhap(NhanVien nv) {
        ds.add(nv);
    }

    public void xuat() {
        for (NhanVien nv : ds) {
            nv.xuat();
        }
    }

    public NhanVien timTheoMa(String ma) {
        for (NhanVien nv : ds) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) return nv;
        }
        return null;
    }

    public void xoa(String ma) {
        NhanVien nv = timTheoMa(ma);
        if (nv != null) ds.remove(nv);
    }

    public void capNhat(String ma, String tenMoi, double luongMoi) {
        NhanVien nv = timTheoMa(ma);
        if (nv != null) {
            nv.setHoTen(tenMoi);
            nv.setLuong(luongMoi);
        }
    }

    public void timTheoLuong(double min, double max) {
        for (NhanVien nv : ds) {
            double tn = nv.getThuNhap();
            if (tn >= min && tn <= max) nv.xuat();
        }
    }

    public void sapXepTheoTen() {
        Collections.sort(ds, Comparator.comparing(NhanVien::getHoTen));
    }

    public void sapXepTheoThuNhap() {
        Collections.sort(ds, Comparator.comparingDouble(NhanVien::getThuNhap).reversed());
    }

    public void top5ThuNhap() {
        sapXepTheoThuNhap();
        for (int i = 0; i < Math.min(5, ds.size()); i++) {
            ds.get(i).xuat();
        }
    }
}
