package edu.poly.projectjava;

import static edu.poly.projectjava.HangHoa.deleteproducttofile;
import static edu.poly.projectjava.HangHoa.writeproducttofile;
import static edu.poly.projectjava.NhanVien.deletetofile;
import static edu.poly.projectjava.HangHoa.nhapthemProduct;
import static edu.poly.projectjava.HangHoa.readHHtofile;
import static edu.poly.projectjava.HangHoa.sapXep;
import static edu.poly.projectjava.HangHoa.searchProduct;
import static edu.poly.projectjava.NhanVien.updatetofile;
import static edu.poly.projectjava.HangHoa.updatetofile;
import static edu.poly.projectjava.HangHoa.writeproducttofiletrue;
import static edu.poly.projectjava.NhanVien.readtofile;
import static edu.poly.projectjava.NhanVien.writetofile;
import static edu.poly.projectjava.NhanVien.writetofiletrue;
import static edu.poly.projectjava.khachhang.deleteKHtofile;
import static edu.poly.projectjava.khachhang.updateKHtofile;
import static edu.poly.projectjava.khachhang.writeKHtofile;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int luachon;
        do {
            System.out.println("|---------------------- TRINH QUAN LY BAN QUAN AO -----------------------|");
            System.out.println("|----------------------------------Menu----------------------------------|");
            System.out.println("|                                                                        |");
            System.out.println("|                          1, quan ly nhan vien                          |");
            System.out.println("|                          2, quan ly hang hoa                           |");
            System.out.println("|                          3, quan ly thong tin khach hang               |");
            System.out.println("|                          4, ban hang                                   |");
            System.out.println("|                          5, Lich su giao dich                          |");
            System.out.println("|                          0, thoat chuong trinh                         |");
            System.out.println("|                                                                        |");
            System.out.println("|------------------------------------------------------------------------|");

            System.out.println("moi ban nhap lua chon : ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1: {

                    NhanVien NV = new NhanVien();

                    int luachonnv;

                    do {
                        System.out.println("|------------------------------Quan ly nhan vien-------------------------|");
                        System.out.println("|                                                                        |");
                        System.out.println("|                          1, Them nhan vien moi                         |");
                        System.out.println("|                          2, Chinh sua thong tin nhan vien              |");
                        System.out.println("|                          3, Xoa nhan vien                              |");
                        System.out.println("|                          4, sap xep nhan vien theo ten                 |");
                        System.out.println("|                          5, tim kiem nhan vien                         |");
                        System.out.println("|                          6, thong tin va luong tat ca nhan vien        |");
                        System.out.println("|                          0, thoat quan ly nhan vien                    |");
                        System.out.println("|                                                                        |");
                        System.out.println("|------------------------------------------------------------------------|");
                        System.out.println("moi ban chon chuc nang cho nhan vien : ");
                        luachonnv = sc.nextInt();
                        switch (luachonnv) {
                            case 1: {
                                ArrayList<NhanVien> listwrite= new ArrayList<>();
                                System.out.println("Nhap so nhan vien muon them moi : ");
                                int n = sc.nextInt();
                                System.out.println("---------------------------------------------------------------------");
                                for (int i = 0; i < n; i++) {
                                    NV.add(listwrite);
                                    System.out.println("---------------------------------------------------------------------");
                                }
                                writetofiletrue(listwrite);
                                break;
                               
                            }

                            case 2: {
                                
                                ArrayList<NhanVien> listwrite= new ArrayList<>();
                                readtofile(listwrite);
                                updatetofile(listwrite);
                                writetofile(listwrite);
                                break;
                                
                            }
                            case 3: {
                                ArrayList<NhanVien> listwrite= new ArrayList<>();
                                readtofile(listwrite);
                                deletetofile(listwrite);
                                break;
                            }
                            case 4: {
                                ArrayList<NhanVien> listwrite= new ArrayList<>();
                                readtofile(listwrite);
                                NV.sapXep(listwrite);
                                writetofile(listwrite);
                                System.out.println("sap xep nhan vien theo ten trong file thanh cong !");
                                break;                            }
                            case 5: {
                                ArrayList<NhanVien> listwrite= new ArrayList<>();
                                readtofile(listwrite);
                                NV.search(listwrite);
                                break;
                            }
                            case 6 :
                            {
                                ArrayList<NhanVien> read = new ArrayList<>();
                                NV.readtofile(read) ;
                                NV.showAllNV(read);
                            }

                            case 0:
                            {
                                break;
                            }
                                
                                
                            default: System.out.println("ban nhap sai, vui long nhap lai");    
                        }

                    } while (luachonnv != 0);

                    break;
                }

                case 2: {
                    HangHoa HH = new HangHoa();

                    int luachonnv;

                    do {
                        System.out.println("|--------------------------------------Quan ly hang hoa----------------------------------|");
                        System.out.println("|                                                                                        |");
                        System.out.println("|                          1, nhap them vao kho hang hoa                                 |");
                        System.out.println("|                          2, Chinh sua thong tin hang hoa                               |");
                        System.out.println("|                          3, Xoa hang hoa khoi kho                                      |");
                        System.out.println("|                          4, sap xep nhan vien theo ten                                 |");
                        System.out.println("|                          5, tim kiem hang hoa theo ten san pham                        |");
                        System.out.println("|                          6, Nhap them ao da co san trong kho                           |");
                        System.out.println("|                          7, Tat ca hang hoa co trong kho                               |");
                        System.out.println("|                          0, thoat quan ly hang hoa                                     |");
                        System.out.println("|                                                                                        |");
                        System.out.println("|----------------------------------------------------------------------------------------|");
                        System.out.println("moi ban chon chuc nang cho hang hoa : ");
                        luachonnv = sc.nextInt();
                        switch (luachonnv) {
                            case 1: {
                                ArrayList<HangHoa> listwrite= new ArrayList<>();
                                System.out.println(" nhap so hang hoa ban muon them moi : ");
                                int n = sc.nextInt();
                                System.out.println("---------------------------------------------------------------------");
                                for (int i = 0; i < n; i++) {
                                    HH.addproduct(listwrite);
                                    System.out.println("---------------------------------------------------------------------");
                                }
                                writeproducttofiletrue(listwrite);
                                break;
                            }

                            case 2: {
                                ArrayList<HangHoa> listHHfile= new ArrayList<>();
                                readHHtofile(listHHfile);
                                updatetofile(listHHfile);
                                break;
                            }
                                
                                
                            case 3: {
                                ArrayList<HangHoa> listHHfile= new ArrayList<>();
                                readHHtofile(listHHfile);
                                deleteproducttofile(listHHfile);

                                break;
                            }
                            case 4: {
                                ArrayList<HangHoa> listHHfile= new ArrayList<>();
                                readHHtofile(listHHfile);
                                HH.sapXep(listHHfile);
                                writeproducttofile(listHHfile);
                                break;
                            }
                            case 5: {
                                ArrayList<HangHoa> listHHfile= new ArrayList<>();
                                readHHtofile(listHHfile);
                                searchProduct(listHHfile);
                                break;
                            }
                            
                            case 6 :
                            {
                                ArrayList<HangHoa> listHHfile= new ArrayList<>();
                                readHHtofile(listHHfile);
                                nhapthemProduct(listHHfile);
                                writeproducttofile(listHHfile);
                                break;
                            }
                            case 7 :
                            {
                                ArrayList<HangHoa> read = new ArrayList<>();
                                HH.readHHtofile(read) ;
                                HH.showAllHH(read);
                            }

                            case 0:
                            {
                                break;
                            }
                            default: System.out.println("ban nhap sai, vui long nhap lai");
                        }

                    } while (luachonnv != 0);


                    break;
                }
                
                case 3 : 
                {
                    khachhang KH = new khachhang();

                    int luachonkh;

                    do {
                        System.out.println("|------------------------------Quan ly Thong tin Khach Hang-------------------------|");
                        System.out.println("|                                                                                   |");
                        System.out.println("|                          1, Them thong tin khach hang moi                         |");
                        System.out.println("|                          2, Chinh sua thong tin khach hang                        |");
                        System.out.println("|                          3, Xoa thong tin khach hang                              |");
                        System.out.println("|                          4, sap xep khach hang theo ten                           |");
                        System.out.println("|                          5, tim kiem thong tin khach hang                         |");
                        System.out.println("|                          0, thoat quan ly thong tin khach hang                    |");
                        System.out.println("|                                                                                   |");
                        System.out.println("|-----------------------------------------------------------------------------------|");
                        System.out.println("moi ban chon chuc nang cho khach hang : ");
                        luachonkh = sc.nextInt();
                        switch (luachonkh) {
                            case 1: {
                                
                                ArrayList<khachhang> listwrite= new ArrayList<>();
                                System.out.println(" nhap so khach hang can them moi thong tin : ");
                                int n = sc.nextInt();
                                System.out.println("---------------------------------------------------------------------");
                                for (int i = 0; i < n; i++) {
                                    KH.addKH(listwrite);
                                    System.out.println("---------------------------------------------------------------------");
                                }
                                KH.writeKHtofiletrue(listwrite);
                                break;
                            }

                            case 2: {
                                ArrayList<khachhang> listwrite= new ArrayList<>();
                                KH.readKHtofile(listwrite);
                                updateKHtofile(listwrite);
                                break;
                            }
                            case 3: {
                                ArrayList<khachhang> listwrite= new ArrayList<>();
                                KH.readKHtofile(listwrite);
                                deleteKHtofile(listwrite);
                                break;
                            }
                            case 4: {
                                ArrayList<khachhang> listwrite= new ArrayList<>();
                                KH.readKHtofile(listwrite);
                                KH.sapXep(listwrite);
                                writeKHtofile(listwrite); 
                                System.out.println("sap xep trong file thanh cong !");
                                
                                break;
                            }
                            case 5: {
                                ArrayList<khachhang> listwrite= new ArrayList<>();
                                KH.readKHtofile(listwrite);
                                KH.search(listwrite);
                                break;
                            }

                            case 0:
                            {
                                break;
                            }
                                
                                
                            default: System.out.println("ban nhap sai, vui long nhap lai");    
                        }

                    } while (luachonkh != 0);
                    break;
                }
                
                case 4 : {
                    
                    HangHoa HH = new HangHoa();

                    int luachonnv;

                    do {
                        System.out.println("|--------------------------------------Quan ly ban hang----------------------------------|");
                        System.out.println("|                                                                                        |");
                        System.out.println("|                          1, Ban hang                                                   |");
                        System.out.println("|                          2, kiem soat hoa don                                          |");
                        System.out.println("|                          0, thoat quan quan ly ban hang                                |");
                        System.out.println("|                                                                                        |");
                        System.out.println("|----------------------------------------------------------------------------------------|");
                        System.out.println("moi ban chon chuc nang muon thuc hien : ");
                        luachonnv = sc.nextInt();
                        switch (luachonnv) {
                            case 1: {
                                    ArrayList<HangHoa> listHHfile= new ArrayList<>();
                                    readHHtofile(listHHfile);
                                    if(HH.sellProduct(listHHfile))
                                    {
                                        writeproducttofile(listHHfile);
                                        int luachoninhoadon;
                                        System.out.println("|--------------------------Ban co muon in hoa don khong----------------------------------|");
                                        System.out.println("|                                                                                        |");
                                        System.out.println("|                          1, co                                                         |");
                                        System.out.println("|                          0, khong, cam on!                                             |");
                                        System.out.println("|                                                                                        |");
                                        System.out.println("|----------------------------------------------------------------------------------------|");
                                        System.out.println("moi ban chon  : ");
                                        luachoninhoadon = sc.nextInt();
                                        switch(luachoninhoadon)
                                        {
                                            case 1 : 
                                            {
                                                ArrayList<hoadon> listwriter = new ArrayList<>();
                                                hoadon HD = new hoadon();
                                                HD.addHD(listwriter);
                                                HD.writeHDtofiletrue(listwriter);
                                                HD.readHDtofile(listwriter);
                                                break;
                                            }
                                            
                                            case 0 : break;
                                            default: System.out.println("ban nhap sai, vui long nhap lai");
                                        }
                                        
                                    }
                            

                                break;
                            }

                            case 2 :
                                            {
                                                    
                                                    hoadon HD = new hoadon();
                                                    int luachonHD;
                                                    System.out.println("|--------------------------kiem soat hoa don---------------------------------------------|");
                                                    System.out.println("|                                                                                        |");
                                                    System.out.println("|                          1, sua thong tin hoa don                                      |");
                                                    System.out.println("|                          2, xoa hoa don                                                |");
                                                    System.out.println("|                          3, sap xep hoa don                                            |");
                                                    System.out.println("|                          4, tim kiem hoa don                                           |");
                                                    System.out.println("|                          0, thoat !                                                    |");
                                                    System.out.println("|                                                                                        |");
                                                    System.out.println("|----------------------------------------------------------------------------------------|");
                                                    System.out.println("moi ban chon  : ");
                                                    luachonHD = sc.nextInt();
                                                    
                                                    switch(luachonHD)
                                                    {
                                                        case 1 : 
                                                        {
                                                            
                                                            ArrayList<hoadon> list = new ArrayList<>();
                                                            HD.readHDtofile(list);
                                                            HD.updateHDtofile(list);
                                                            break;
                                                        }
                                                        
                                                        case 2 : 
                                                        {
                                                          
                                                            ArrayList<hoadon> list = new ArrayList<>();
                                                            HD.readHDtofile(list);
                                                            HD.deleteHDtofile(list);
                                                            break;
                                                        }
                                                        
                                                        case 3 : 
                                                        {
                                                          
                                                            ArrayList<hoadon> list = new ArrayList<>();
                                                            HD.readHDtofile(list);
                                                            HD.sapXepHD(list);
                                                            HD.writeHDtofile(list);
                                                            System.out.println("sap xep trong file thanh cong !");
                                                            break;
                                                        }
                                                        
                                                        case 4 :
                                                        {
                                                            ArrayList<hoadon> list = new ArrayList<>();
                                                            HD.readHDtofile(list);
                                                            HD.search(list);
                                                            break;
                                                        }
                                                        
                                                        
                                                        case 0 : break;
                                                        default: System.out.println("ban nhap sai, vui long nhap lai");
                                                    }
                                                    break;
                                            }

                            case 0:
                            {
                                break;
                            }
                                
                            default: System.out.println("ban nhap sai, vui long nhap lai");
                        }

                    } while (luachonnv != 0);

                    break;
                }
                
                case 5 :
                {
                    hoadon HH = new hoadon();
                    ArrayList<hoadon> read = new ArrayList<>();
                    HH.readHDtofile(read) ;
                    HH.history(read);
                  
                }

                case 0: {
                    break;
                }
                default: System.out.println("ban nhap sai, vui long nhap lai");
            }
        } while (luachon != 0);
    }
}
