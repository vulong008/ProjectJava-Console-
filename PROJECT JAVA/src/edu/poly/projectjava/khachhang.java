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


public class khachhang extends Nguoi{
    private String makhachhang;
    private String sdt;
    Scanner sc = new Scanner(System.in);

    
    public khachhang() {
        
    }

    public khachhang(String makhachhang, String sdt, String hoTen, int tuoi, String diaChi, String gioiTinh) {
        super(hoTen, tuoi, diaChi, gioiTinh);
        this.makhachhang = makhachhang;
        this.sdt = sdt;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String getHoTen() {
        return super.getHoTen(); //To change body of generated methods, choose Tools | Templates.
    }

    
    

     public void addKH(ArrayList<khachhang> list) {
        khachhang KH = new khachhang();
        System.out.println("Them khach hang moi :");
        
        System.out.println("Nhap ma khach hang:");
        String makhachhang = sc.nextLine();
        KH.setMakhachhang(makhachhang);
        
        System.out.println(" Nhap ten khach hang : ");
        String tenKH = sc.nextLine();
        KH.setHoTen(tenKH);

        System.out.println(" Nhap tuoi khach hang : ");
        int tuoi = sc.nextInt();
        KH.settuoi(tuoi);
        sc.nextLine();
        
        System.out.println("Nhap dia chi khach hang : ");
        String diachiString = sc.nextLine();
        KH.setDiaChi(diachiString);

        System.out.println("Nhap gioi tinh : ");
        String gioitinhString = sc.nextLine();
        KH.setGioiTinh(gioitinhString);

        System.out.println("Nhap so dien thoai khach hang :");
        String sodienthoai = sc.nextLine();
        KH.setSdt(sodienthoai);

        list.add(KH);
        System.out.println("Them khach hang moi thanh cong ");
    }


    public static void RemoveKH(ArrayList<khachhang> list) {
        Scanner sc = new Scanner(System.in);
        int dem = 0;
        if (list.size() == 0) {
            System.out.println("Danh sach khach hang trong, vui long kiem tra lai");
        } else {
            System.out.println("Nhap ma khach hang muon xoa :");
            String makhString = sc.nextLine();

            for (int i = 0; i < list.size(); i++) {
                khachhang s = list.get(i);
                if (s.getMakhachhang().equals(makhString)) {
                    list.remove(i);
                    System.out.println("Da xoa thanh cong !!");
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println("khong tim thay khach hang can xoa");
            }
        }

    }

    public static void updateKH(ArrayList<khachhang> list) {
        boolean isExisted = false; // kiểm tra 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma khach hang can sua thong tin : ");
        String idS = sc.nextLine();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getMakhachhang().equals(idS)) {
                isExisted = true;
                System.out.println("Nhap ten khach hang :");
                String hoTen = sc.nextLine();

                System.out.println(" Nhap tuoi khach hang: ");
                int tuoi = sc.nextInt();

                sc.nextLine();
                System.out.println("Nhap gioi tinh khach hang : ");
                String gioitinhString = sc.nextLine();

                System.out.println("Nhap dia chi khach hang :");
                String diachiString = sc.nextLine();

                System.out.println("nhap so dien thoai khach hang :");
                String sodienthoai = sc.nextLine();

                

                list.get(i).setHoTen(hoTen);
                list.get(i).settuoi(tuoi);
                list.get(i).setGioiTinh(gioitinhString);
                list.get(i).setDiaChi(diachiString);
                list.get(i).setDiaChi(diachiString);
                list.get(i).setSdt(sodienthoai);
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Ma khach hang  " + idS + " khong ton tai !");
        } else {
            System.out.println("Cap nhat thong tin khach hang co ma   " + idS + " thanh cong !");
        }
    }
   
       public static void search(ArrayList<khachhang> list) {
        System.out.println("nhap vao ten khach hang can tim kiem : ");
        Scanner sc = new Scanner(System.in);
        String makhString = sc.nextLine();
        int dem =0;
        for (khachhang ab : list) {
            if (ab.makhachhang.equals(makhString)) {
                System.out.println("tim kiem thanh cong !!");             
                System.out.println("Ho Ten : " + ab.getHoTen() + ",  Tuoi : " + ab.gettuoi() + ",  Gioi Tinh :"
                        + ab.getGioiTinh() + ",  Dia Chi : " + ab.getDiaChi() + ",  Ma Khach Hang : " + ab.getMakhachhang()
                        + ",  So Dien Thoai :" + ab.getSdt());
                dem++;
            }                      
        }
        if(dem == 0)
        {
            System.out.println("Tim kiem that bai !!");
        }
        
    }
        
     //sắp xếp
     public static void sapXep(ArrayList<khachhang> list) {
        Collections.sort(list, (a, b) -> a.getHoTen().compareTo(b.getHoTen()));
//a và b là 2 phần tử cần so sánh
//->Lambda Expression
    }


    //ghi file
     public static void writeKHtofile(ArrayList<khachhang> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("khachhang.txt"));
            String khachhang = "";
            for (khachhang ab : list) 
            {
               khachhang =  ab.getMakhachhang() + "@" + ab.getHoTen() + "@" + ab.gettuoi() + "@"
                        + ab.getGioiTinh() + "@" + ab.getDiaChi() 
                        + "@" + ab.getSdt();
               writer.write(khachhang);
               writer.newLine();

             }
            writer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
     
     
     public static void writeKHtofiletrue(ArrayList<khachhang> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("khachhang.txt", true));
            String khachhang = "";
            for (khachhang ab : list) 
            {
               khachhang =  ab.getMakhachhang() + "@" + ab.getHoTen() + "@" + ab.gettuoi() + "@"
                        + ab.getGioiTinh() + "@" + ab.getDiaChi() 
                        + "@" + ab.getSdt();
               writer.write(khachhang);
               writer.newLine();

             }
            writer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
     public static void deleteKHtofile(ArrayList<khachhang> list) {
        RemoveKH(list);
        writeKHtofile(list);
    }
     public static void updateKHtofile(ArrayList<khachhang> list) {
        updateKH(list);
        writeKHtofile(list);
    }
    
 
     
     public static void readKHtofile(ArrayList<khachhang> list) {

        try {
            //buoc 1 tao doi tuong luong va lien ket nguon du lieu
            File f = new File("khachhang.txt");
            FileReader fr = new FileReader(f); // để đọc file
            BufferedReader br = new BufferedReader(fr); // BufferedReader là một lớp Java để đọc văn bản từ luồng đầu vào (như tệp) bằng cách đệm và đọc liền mạch các ký tự, mảng hoặc dòng
            String lineString;
            while ((lineString = br.readLine()) != null) // nếu line mà bằng null thì dùng lại
            {
                String[] arrLine = lineString.split("@");
                khachhang KH = new khachhang();
                KH.setMakhachhang(arrLine[0]);
                KH.setHoTen(arrLine[1]);
                KH.settuoi(Integer.parseInt(arrLine[2]));
                KH.setDiaChi(arrLine[3]);
                KH.setGioiTinh(arrLine[4]);
                KH.setSdt(arrLine[5]);
                list.add(KH);
                
            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            System.out.println("loi doc file : " + ex);
        }
    }
    
    
}
