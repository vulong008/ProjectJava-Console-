package edu.poly.projectjava;

import java.util.Scanner;


public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String gioiTinh;
    

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int gettuoi() {
        return tuoi;
    }

    public void settuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {
        System.out.println("nhap hoten: ");
        hoTen = new Scanner(System.in).nextLine();
        System.out.println("nhap ngaysinh: ");
        tuoi = new Scanner(System.in).nextInt();
        System.out.println("nhap diaChi: ");
        diaChi = new Scanner(System.in).nextLine();
        System.out.println("nhap gioiTinh: ");
        gioiTinh = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "person{" + "hoTen=" + hoTen + ", tuoi = " + tuoi + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }

    public static void main(String[] args) {

    }

}
