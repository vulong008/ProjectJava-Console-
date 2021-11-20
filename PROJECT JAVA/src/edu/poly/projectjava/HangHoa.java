package edu.poly.projectjava;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class HangHoa extends ChatVai{
    private String theloai;
    private String size ;
    private int soluong; 
    private int dongia;
    
//    public static ArrayList<HangHoa> listhanghoa= new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    public HangHoa(String theloai, String size, int soluong, String TenVai, String TinhChatVai, int dongia) {
        super(TenVai, TinhChatVai);
        this.theloai = theloai;
        this.size = size;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public HangHoa() {
    
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public int getdongia() {
        return dongia;
    }

    public void setdongia(int dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
     public void addproduct(ArrayList<HangHoa> list) {
        HangHoa HH = new HangHoa();
        System.out.println("Them hang hoa moi vao kho moi :");
        
        System.out.println("Nhap ten hang hoa :");
        String tenhanghoa = sc.nextLine();
        HH.setTheloai(tenhanghoa);
        
        System.out.println("Nhap chat lieu vai :");
        String tenvaiString = sc.nextLine();
        HH.setTenVai(tenvaiString);

        System.out.println(" tinh chat cua vai  : ");
        String tinhchatvai = sc.nextLine();
        HH.setTinhChatVai(tinhchatvai);

        System.out.println("Nhap size : ");
        String size = sc.nextLine();
        HH.setSize(size);

        System.out.println("Nhap so luong :");
        int soluong = sc.nextInt();
        HH.setSoluong(soluong);
        
        System.out.println("Nhap don gia :");
        int dongia = sc.nextInt();
        HH.setdongia(dongia);
        sc.nextLine();

        list.add(HH);
        System.out.println("Them hang hoa thanh cong thanh cong ");
    }
     
     
      public static void RemoveProduct(ArrayList<HangHoa> list) {
        Scanner sc = new Scanner(System.in);
        int dem = 0;
        if (list.size() == 0) {
            System.out.println("hang trong kho da het, vui long nhap them hang !");
        } else {
            System.out.println("Nhap ten hang hoa muon xóa :");
            String name = sc.nextLine();

            for (int i = 0; i < list.size(); i++) {
                HangHoa s = list.get(i);
                if (s.getTheloai().equals(name)) {
                    list.remove(i);
                    System.out.println("Da xoa thanh cong !!");
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println("Không xóa được");
            }
        }

    }

   static public void updateProduct(ArrayList<HangHoa> list) {
        boolean isExisted = false; // kiểm tra 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hang hoa can cap nhat lai thong tin : ");
        String idS = sc.nextLine();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getTheloai().equals(idS)) {
                isExisted = true;
                
                System.out.println("Nhap chat lieu vai :");
                String tenvaiString = sc.nextLine();
       

                System.out.println(" tinh chat cua vai  : ");
                String tinhchatvai = sc.nextLine();
        
                System.out.println("Nhap size : ");
                String sizeString=sc.nextLine();
 
                System.out.println("Nhap so luong :");
                int soluong = sc.nextInt();
                
                System.out.println("Nhap don gia :");
                int dongia= sc.nextInt();
       
               
                list.get(i).setTenVai(tenvaiString);
                list.get(i).setTinhChatVai(tinhchatvai);
                list.get(i).setSize(sizeString);
                list.get(i).setSoluong(soluong);
                list.get(i).setdongia(dongia);
           
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Ten hang hoa  " + idS + " khong ton tai !");
        } else {
            System.out.println("Cap nhat hang hoa  " + idS + " thanh cong !");
        }
    }
   

   public static int soluongban;
   public static String sizeban;
   public static int dongiaban;
   public static String Tensanpham ;
   
   static public boolean sellProduct(ArrayList<HangHoa> list) {
        boolean isExisted = false; // kiểm tra 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tên hàng hóa bán : ");
        String idS = sc.nextLine();
        int sizelist = list.size();
        for (int i = 0; i < sizelist; i++) {
            if (list.get(i).getTheloai().equals(idS)) {
                isExisted = true;
                int sltrongkho = list.get(i).getSoluong();
                System.out.println("Nhap so luong ban :");
                soluongban = sc.nextInt();
                if(sltrongkho >= soluongban)
                {
                    list.get(i).setSoluong(sltrongkho - soluongban);
                    System.out.println("Ban hang " + idS + " thanh cong !");
                    sizeban = list.get(i).getSize();
                    dongiaban = list.get(i).getdongia();
                    Tensanpham = list.get(i).getTheloai();

                }
                else
                    
                {
                    System.out.println("so luong trong kho khong du !");
                    return false;
                }
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Ten hang hoa  " + idS + " khong ton tai !");
            return false;
        } else {
            return  true;
        }
    }
   
   
   public int getsoluongban()
        {
            return soluongban;
        }
   public int getdongiaban()
        {
            return dongiaban;
        }
   public String gettensp()
        {
            return Tensanpham;
        }
   public String getsizeban()
        {
            return sizeban;
        }
   
    public static void setTensp(String tensp) {
            HangHoa.Tensanpham = tensp;
        }



    public static void setSoluongban(int soluongban) {
        HangHoa.soluongban = soluongban;
    }

    public static void setSizeban(String sizeban) {
        HangHoa.sizeban = sizeban;
    }

    public static void setDongiaban(int dongiaban) {
        HangHoa.dongiaban = dongiaban;
    }

    public static void setTensanpham(String Tensanpham) {
        HangHoa.Tensanpham = Tensanpham;
    }
   
   
   
   
   
   
   static public void nhapthemProduct(ArrayList<HangHoa> list) {
        boolean isExisted = false; // kiểm tra 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hang hoa co san muon nhap : ");
        String idS = sc.nextLine();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getTheloai().equals(idS)) {
                isExisted = true;
                
                int sltrongkho = list.get(i).getSoluong();
                System.out.println("Nhap so luong muon nhap them :");
                int soluong = sc.nextInt();
                list.get(i).setSoluong(sltrongkho + soluong);
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Ten hang hoa  " + idS + " khong ton tai !");
        } else {
            System.out.println("Nhap them " + idS + " thanh cong !");
        }
    }
   
    public static void showAllHH(ArrayList<HangHoa> list)
    {
        System.out.println("----------------------------------------------------Hang hoa con trong kho---------------------------------------------------------------");
        for (int i = 0 ; i< list.size(); i++) {
                
                System.out.println("Ten hang hoa : " + list.get(i).getTheloai() + ", chat lieu vai : " + list.get(i).getTenVai() + ", tinh chat cua vai :"
                        + list.get(i).getTinhChatVai() + ", Size : " + list.get(i).getSize() + ", so luong : " + list.get(i).getSoluong() + ", don gia : "+ list.get(i).getdongia() + " VND");
            }                      
    }
    
    
      static public void searchProduct(ArrayList<HangHoa> list) {
        System.out.println("nhap vao ten mat hang can tim kiem : ");
        Scanner sc = new Scanner(System.in);
        String tenmathang  = sc.nextLine();
        int dem = 0;
        for (HangHoa ab : list) {
            if (ab.getTheloai().equals(tenmathang)) {
                System.out.println("tim kiem thanh cong !!");
                
                System.out.println( "Ten san pham : " + ab.getTheloai() + ", ten chat lieu vai : " + ab.getTenVai() + ", tinh chat cua vai : "
                        + ab.getTinhChatVai() + ",  size : " + ab.getSize() + ", so luong : " + ab.getSoluong() + ", don gia : "+ ab.getdongia());
                        
                dem++;
            }                      
        }
        if(dem == 0)
        {
            System.out.println("Tim kiem that bai !!");
        }
        
    }
        
     //sắp xếp
    static public void sapXep(ArrayList<HangHoa> list) {
        Collections.sort(list, (a, b) -> a.getTheloai().compareTo(b.getTheloai()));
//a và b là 2 phần tử cần so sánh
//->Lambda Expression
    }
    
     static public void writeproducttofile(ArrayList<HangHoa> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hanghoa.txt"));
            String hanghoaString = "";
            for (HangHoa ab : list) 
            {
               hanghoaString =  ab.getTheloai() + "@" + ab.getTenVai() + "@"
                        + ab.getTinhChatVai() + "@" + ab.getSize() + "@" + ab.getSoluong() + "@"+ ab.getdongia();
               writer.write(hanghoaString);
               writer.newLine();

             }
            writer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
     
     static public void writeproducttofiletrue(ArrayList<HangHoa> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hanghoa.txt", true));
            String hanghoaString = "";
            for (HangHoa ab : list) 
            {
               hanghoaString =  ab.getTheloai() + "@" + ab.getTenVai() + "@"
                        + ab.getTinhChatVai() + "@" + ab.getSize() + "@" + ab.getSoluong() + "@"+ ab.getdongia();
               writer.write(hanghoaString);
               writer.newLine();

             }
            writer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    static public void deleteproducttofile(ArrayList<HangHoa> list) {
        RemoveProduct(list);
        writeproducttofile(list);
    }
    static public void updatetofile(ArrayList<HangHoa> list) {
        updateProduct(list);
        writeproducttofile(list);
    }
    
 
     
    static public void readHHtofile(ArrayList<HangHoa> list) {

        try {
            //buoc 1 tao doi tuong luong va lien ket nguon du lieu
            File f = new File("hanghoa.txt");
            FileReader fr = new FileReader(f); // để đọc file
            BufferedReader br = new BufferedReader(fr); // BufferedReader là một lớp Java để đọc văn bản từ luồng đầu vào (như tệp) bằng cách đệm và đọc liền mạch các ký tự, mảng hoặc dòng
            String lineString;
            while ((lineString = br.readLine()) != null) // nếu line mà bằng null thì dùng lại
            {
                HangHoa HH = new HangHoa();
                String[] arrLine = lineString.split("@");
                HH.setTheloai(arrLine[0]);
                HH.setTenVai(arrLine[1]);
                HH.setTinhChatVai(arrLine[2]);
                HH.setSize(arrLine[3]);
                HH.setSoluong(Integer.parseInt(arrLine[4]));
                HH.setdongia(Integer.parseInt(arrLine[5]));
                list.add(HH);
            }
            
            fr.close();
            br.close();
        } catch (IOException ex) {
            System.out.println("loi doc file : " + ex);
        }
    }
    
    
}
