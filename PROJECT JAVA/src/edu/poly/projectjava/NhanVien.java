package edu.poly.projectjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NhanVien extends Nguoi {

    private String MaNV;
    private int ngayCong;
    private int LuongCoBan;
    private int Thuong;
    private int LuongThucLinh;
    
    public NhanVien() {
        this.MaNV = "NV1";
        this.ngayCong = 0;
        this.LuongCoBan = 0;
        this.Thuong = 0;
        this.LuongThucLinh = 0;

    }

    Scanner sc = new Scanner(System.in);

    public NhanVien(String MaNV, int ngayCong, int LuongCoBan, int Thuong, int LuongThucLinh, String hoTen, int tuoi, String diaChi, String gioiTinh) {
        super(hoTen, tuoi, diaChi, gioiTinh);
        this.MaNV = MaNV;
        this.ngayCong = ngayCong;
        this.LuongCoBan = LuongCoBan;
        this.Thuong = Thuong;
        this.LuongThucLinh = LuongThucLinh;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int NgayCong) {
        this.ngayCong = NgayCong;
    }

    public int getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(int LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public int getThuong() {
        return Thuong;
    }

    public void setThuong(int Thuong) {
        this.Thuong = Thuong;
    }

    public int getLuongThucLinh() {
        LuongThucLinh = LuongCoBan * ngayCong + Thuong;
        return LuongThucLinh;
    }

    public void setLuongThucLinh(int LuongThucLinh) {
        this.LuongThucLinh = LuongThucLinh;
    }
    
   
   
    @Override
    public String toString() {
        return super.toString() + " toString nay cua nhan vien !" ; 
    }


    
    
    public void add(ArrayList<NhanVien> list) {
        NhanVien NV = new NhanVien();
        System.out.println("Them nhan vien moi :");
        System.out.println("Nhap ten nhan vien :");
        String hoTen = sc.nextLine();
        NV.setHoTen(hoTen);

        System.out.println("Nhap tuoi nhan vien : ");
        int tuoi = sc.nextInt();
        NV.settuoi(tuoi);

        sc.nextLine();
        System.out.println("Nhap gioi tinh : ");
        String gioitinhString = sc.nextLine();
        NV.setGioiTinh(gioitinhString);

        System.out.println("Nhap dia chi :");
        String diachiString = sc.nextLine();
        NV.setDiaChi(diachiString);

        System.out.println("Nhap ma nhan vien : ");
        String manvString = sc.nextLine();
        NV.setMaNV(manvString);

        System.out.println("Nhap so ngay cong :");
        int ngaycong = sc.nextInt();
        NV.setNgayCong(ngaycong);

        System.out.println("Nhap luong co ban : ");
        int luongcoban = sc.nextInt();
        NV.setLuongCoBan(luongcoban);

        System.out.println("Nhap thuong : ");
        int thuong = sc.nextInt();
        NV.setThuong(thuong);
        sc.nextLine();

        list.add(NV);
        System.out.println("Them nhan vien thanh cong ");
    }


    public static void Remove(ArrayList<NhanVien> list) {
        Scanner sc = new Scanner(System.in);
        int dem = 0;
        if (list.size() == 0) {
            System.out.println("Danh sach nhan vien trong, vui long kiem tra lai");
        } else {
            System.out.println("Nhap ma nhan vien muon xoa :");
            String num = sc.nextLine();

            for (int i = 0; i < list.size(); i++) {
                NhanVien s = list.get(i);
                if (s.getMaNV().equals(num)) {
                    list.remove(i);
                    System.out.println("Da xoa thanh cong !!");
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println("Khong tim thay nhan vien can xoa");
            }
        }

    }

    public static void update(ArrayList<NhanVien> list) {
        boolean isExisted = false; // kiểm tra 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma nhan vien can sua thong tin : ");
        String idS = sc.nextLine();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getMaNV().equals(idS)) {
                isExisted = true;
                System.out.println("Nhap ten nhan vien :");
                String hoTen = sc.nextLine();

                System.out.println("Nhap tuoi nhan vien : ");
                int tuoi = sc.nextInt();

                sc.nextLine();
                System.out.println("Nhap gioi tinh : ");
                String gioitinhString = sc.nextLine();

                System.out.println("Nhap dia chi :");
                String diachiString = sc.nextLine();


                System.out.println("Nhap so ngay cong :");
                int ngaycong = sc.nextInt();

                System.out.println("Nhap luong co ban : ");
                int luongcoban = sc.nextInt();

                System.out.println("Nhap thuong : ");
                int thuong = sc.nextInt();
                sc.nextLine();

                list.get(i).setHoTen(hoTen);
                list.get(i).settuoi(tuoi);
                list.get(i).setGioiTinh(gioitinhString);
                list.get(i).setDiaChi(diachiString);
                list.get(i).setNgayCong(ngaycong);
                list.get(i).setLuongCoBan(luongcoban);
                list.get(i).setThuong(thuong);
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Mã nhan vien  " + idS + " khong ton tai !");
        } else {
            System.out.println("Cap nhat sinh vien co ma   " + idS + " thanh cong !");
        }
    }
   
       public static void search(ArrayList<NhanVien> list) {
        System.out.println("Nhap vao ten nhan vien can tim kiem : ");
        Scanner sc = new Scanner(System.in);
        String tennvString = sc.nextLine();
        int dem =0;
        for (NhanVien ab : list) {
            if (ab.getHoTen().equals(tennvString)) {
                System.out.println("Tim kiem thanh cong !!");
                System.out.println( "Ho Ten: " +ab.getHoTen() + ", tuoi:" + ab.gettuoi() + ", gioi tinh: "
                        + ab.getGioiTinh() + ", dia chi" + ab.getDiaChi() + ", manv" + ab.getMaNV()
                        + ", ngay cong: " + ab.getNgayCong() + ", luong co ban: " + ab.getLuongCoBan() + ", thuong: " + ab.getThuong()
                        + ", luong thuc linh: " + ab.getLuongThucLinh());
                dem++;
            }                      
        }
        if(dem == 0)
        {
            System.out.println("Tim kiem that bai !!");
        }
        
    }
        
     //sắp xếp
     public static void sapXep(ArrayList<NhanVien> list) {
        Collections.sort(list, (a, b) -> a.getHoTen().compareTo(b.getHoTen()));
//a và b là 2 phần tử cần so sánh

    }


    //ghi file
     public static void writetofile(ArrayList<NhanVien> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("nhanvien.txt"));
            String nhanvien = "";
            for (NhanVien ab : list) 
            {
               nhanvien =  ab.getHoTen() + "@" + ab.gettuoi() + "@"
                        + ab.getGioiTinh() + "@" + ab.getDiaChi() + "@" + ab.getMaNV()
                        + "@" + ab.getNgayCong() + "@" + ab.getLuongCoBan() + "@" + ab.getThuong()
                        + "@" + ab.getLuongThucLinh();
               writer.write(nhanvien);
               writer.newLine();

             }
            writer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
     
      public static void writetofiletrue(ArrayList<NhanVien> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("nhanvien.txt", true));
            String nhanvien = "";
            for (NhanVien ab : list) 
            {
               nhanvien =  ab.getHoTen() + "@" + ab.gettuoi() + "@"
                        + ab.getGioiTinh() + "@" + ab.getDiaChi() + "@" + ab.getMaNV()
                        + "@" + ab.getNgayCong() + "@" + ab.getLuongCoBan() + "@" + ab.getThuong()
                        + "@" + ab.getLuongThucLinh();
               writer.write(nhanvien);
               writer.newLine();

             }
            writer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
         
      
     public static void deletetofile(ArrayList<NhanVien> list) {
        Remove(list);
        writetofile(list);
    }
     public static void updatetofile(ArrayList<NhanVien> list) {
        update(list);
        writetofile(list);
    }
     
     public static void showAllNV(ArrayList<NhanVien> list)
    {
        System.out.println("----------------------------------------------------Thong tin va luong nhan vien---------------------------------------------------------------");
        for (int i = 0 ; i< list.size(); i++) {
                
                System.out.println("Ho Ten : " + list.get(i).getHoTen() + ", tuoi : " + list.get(i).gettuoi() + ", Gioi Tinh :"
                        + list.get(i).getGioiTinh() + ", dia chi : " + list.get(i).getDiaChi() + ", ma nhan vien : " + list.get(i).getMaNV()
                        + ", so ngay cong : " + list.get(i).getNgayCong() + ", luong co ban : " + list.get(i).getLuongCoBan() + ", thuong :" + list.get(i).getThuong()
                        + ", tong tien luong :" + list.get(i).getLuongThucLinh());
            }                      
    }
    
     
     public static void readtofile(ArrayList<NhanVien> list) {

        try {
            //buoc 1 tao doi tuong luong va lien ket nguon du lieu
            File f = new File("nhanvien.txt");
            FileReader fr = new FileReader(f); 
            BufferedReader br = new BufferedReader(fr); // BufferedReader là một lớp Java để đọc văn bản từ luồng đầu vào (như tệp) bằng cách đệm và đọc liền mạch các ký tự, mảng hoặc dòng
            String lineString;
            while ((lineString = br.readLine()) != null) 
            {
                NhanVien NV = new NhanVien();
                String[] arrLine = lineString.split("@");
                NV.setHoTen(arrLine[0]);
                NV.settuoi(Integer.parseInt(arrLine[1]));
                NV.setGioiTinh(arrLine[2]);
                NV.setDiaChi(arrLine[3]);
                NV.setMaNV(arrLine[4]);
                NV.setNgayCong(Integer.parseInt(arrLine[5]));
                NV.setLuongCoBan(Integer.parseInt(arrLine[6]));
                NV.setThuong(Integer.parseInt(arrLine[7]));
                
                list.add(NV);
               
            }
            fr.close();
            br.close();
        }
            catch (IOException ex) {
        }
    }
     public static void main(String[] args) {
         
         Nguoi people = new NhanVien();
         System.out.println(people.toString());

     
    }
}