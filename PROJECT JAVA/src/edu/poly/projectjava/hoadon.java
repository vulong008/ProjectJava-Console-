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


public class hoadon extends HangHoa{
    private String mahoadon;
    private int tongtien;
    private String Tennguoimua;

    public hoadon(String mahoadon, int tongtien, String Tennguoimua, String theloai, String size, int soluong, String TenVai, String TinhChatVai, int dongia) {
        super(theloai, size, soluong, TenVai, TinhChatVai, dongia);
        this.mahoadon = mahoadon;
        this.tongtien = tongtien;
        this.Tennguoimua = Tennguoimua;
    }


    
    public hoadon() {
        
    }
        
 

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }


    public int getTongtien() {
        HangHoa HH = new HangHoa();
        return tongtien = HH.getsoluongban()* HH.getdongiaban();
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
        
    }

    public String getTennguoimua() {
        return Tennguoimua;
    }

    public void setTennguoimua(String Tennguoimua) {
        this.Tennguoimua = Tennguoimua;
    }

    @Override
    public String getTheloai() {
        return super.getTheloai(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    public void addHD(ArrayList<hoadon> list) {
        hoadon HD = new hoadon();
        System.out.println("Nhap ma hoa don : ");
        String mahoadonString = sc.nextLine();
        HD.setMahoadon(mahoadonString);
        
        
        System.out.println("Nhap ten khach hang : ");
        String tenkhachhang = sc.nextLine();
        HD.setTennguoimua(tenkhachhang);
        
        
        HD.setdongia(HD.getdongiaban());
        HD.setSoluongban(HD.getsoluongban());
        HD.setTensanpham(HD.gettensp());
        HD.setSizeban(HD.getsizeban());
        HD.setTongtien(HD.getTongtien());
        
        list.add(HD);
        
        int dem =0;
        for (int i = 0 ; i< list.size(); i++) {
            if (HD.mahoadon.equals(mahoadonString)) { 
                System.out.println("----------------------------------------------------Hoa Don Mua Ban---------------------------------------------------------------");
                System.out.println("Ma hoa don : " +HD.getMahoadon()+ ",  Ten khach hang :  " +HD.getTennguoimua() +  ",  ten mat hang : " + HD.gettensp() + ",  don gia : " + HD.getdongiaban() + 
                       ",  so luong ban : " +HD.getsoluongban()  + ", size : " + HD.getsizeban() + ", tong tien : " + HD.getTongtien());
                dem++;
            }                      
        }
        if(dem == 0)
        {
            System.out.println("Tim kiem that bai !!");
        }
    }
    
    public static void history(ArrayList<hoadon> list)
    {
        System.out.println("----------------------------------------------------Lich su giao dich---------------------------------------------------------------");
        for (int i = 0 ; i< list.size(); i++) {
                
                System.out.println("Ma hoa don : " +list.get(i).getMahoadon()+ ",  Ten khach hang :  " +list.get(i).getTennguoimua() +  ",  ten mat hang : " + list.get(i).gettensp() + ",  don gia : " + list.get(i).getdongiaban() + 
                       ",  so luong ban : " +list.get(i).getsoluongban()  + ", size : " + list.get(i).getsizeban() + ", tong tien : " + list.get(i).getTongtien());
            }                      
    }
    

        //ghi file
     public static void writeHDtofile(ArrayList<hoadon> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hoadon.txt"));
            String Hoadon = "";
            for (hoadon HD : list) 
            {
               Hoadon =  HD.getMahoadon()+ "@" +HD.getTennguoimua() +  "@" + HD.gettensp() + "@" + HD.getdongiaban() + 
                       "@" +HD.getsoluongban()  + "@" + HD.getsizeban() + "@" + HD.getTongtien();
               writer.write(Hoadon);
               writer.newLine();

             }
            writer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
     
     public static void writeHDtofiletrue(ArrayList<hoadon> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hoadon.txt", true));
            String Hoadon = "";
            for (hoadon HD : list) 
            {
               Hoadon =  HD.getMahoadon()+ "@" +HD.getTennguoimua() +  "@" + HD.gettensp() + "@" + HD.getdongiaban() + 
                       "@" +HD.getsoluongban()  + "@" + HD.getsizeban() + "@" + HD.getTongtien();
               writer.write(Hoadon);
               writer.newLine();

             }
            writer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
     
     public static void readHDtofile(ArrayList<hoadon> list) {

        try {
            //buoc 1 tao doi tuong luong va lien ket nguon du lieu
            File f = new File("hoadon.txt");
            FileReader fr = new FileReader(f); // để đọc file
            BufferedReader br = new BufferedReader(fr); // BufferedReader là một lớp Java để đọc văn bản từ luồng đầu vào (như tệp) bằng cách đệm và đọc liền mạch các ký tự, mảng hoặc dòng
            String lineString;
            while ((lineString = br.readLine()) != null) // nếu line mà bằng null thì dùng lại
            {
                String[] arrLine = lineString.split("@");
                hoadon HD = new hoadon();
                
                HD.setMahoadon(arrLine[0]);
                HD.setTennguoimua(arrLine[1]);
                HD.setTensp(arrLine[2]);
                HD.setDongiaban(Integer.parseInt(arrLine[3]));
                HD.setSoluongban(Integer.parseInt(arrLine[4]));
                HD.setSizeban(arrLine[5]);
                HD.setTongtien(Integer.parseInt(arrLine[6]));
                
                list.add(HD);
            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            System.out.println("loi doc file : " + ex);
        }
     }
     
            

    public static void RemoveHD(ArrayList<hoadon> list) 
    {
        Scanner sc = new Scanner(System.in);
        int dem = 0;
        if (list.size() == 0) {
            System.out.println("Danh sach hoa don trong, vui long kiem tra lai");
        } else {
            System.out.println("Nhap ma hoa don muon xoa :");
            String mahoadon = sc.nextLine();

            for (int i = 0; i < list.size(); i++) {
                hoadon s = list.get(i);
                if (s.getMahoadon().equals(mahoadon)) {
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
//
    public static void updateHD(ArrayList<hoadon> list) {
        boolean isExisted = false; // kiểm tra 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma hoa don can sua thong tin : ");
        String idS = sc.nextLine();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getMahoadon().equals(idS)) {
                isExisted = true;
                System.out.println("Nhap ten khach hang :");
                String hoTen = sc.nextLine();

                list.get(i).setTennguoimua(hoTen);

                break;
            }
        }
        if (!isExisted) {
            System.out.println("Ma hoa don  " + idS + " khong ton tai !");
        } else {
            System.out.println("Cap nhat hoa don co ma   " + idS + " thanh cong !");
        }
    }
   
       public static void search(ArrayList<hoadon> list) {
        System.out.println("nhap vao ma hoa don can tim kiem : ");
        Scanner sc = new Scanner(System.in);
        String maHD = sc.nextLine();
        int dem =0;
        for (hoadon HD : list) {
            if (HD.mahoadon.equals(maHD)) {
                System.out.println("tim kiem thanh cong !!");             
                System.out.println("Ma hoa don : " +HD.getMahoadon()+ ",  Ten khach hang :  " +HD.getTennguoimua() +  ",  ten mat hang : " + HD.gettensp() + ",  don gia : " + HD.getdongiaban() + 
                       ",  so luong ban : " +HD.getsoluongban()  + ", size : " + HD.getsizeban() + ", tong tien : " + HD.getTongtien());
                dem++;
            }                      
        }
        if(dem == 0)
        {
            System.out.println("Tim kiem that bai !!");
        }
        
    }
       

     public static void deleteHDtofile(ArrayList<hoadon> list) {
        RemoveHD(list);
        writeHDtofile(list);
    }
     public static void updateHDtofile(ArrayList<hoadon> list) {
        updateHD(list);
        writeHDtofile(list);
    }
     
      //sắp xếp
    static public void sapXepHD(ArrayList<hoadon> list) {
        Collections.sort(list, (a, b) -> a.getMahoadon().compareTo(b.getMahoadon()));
//a và b là 2 phần tử cần so sánh
//->Lambda Expression
    }
//    

    
}
