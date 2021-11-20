package edu.poly.projectjava;


public class ChatVai {
    private String TenVai;
    private  String TinhChatVai;

    public ChatVai(String TenVai, String TinhChatVai) {
        this.TenVai = TenVai;
        this.TinhChatVai = TinhChatVai;
    }
    
    public ChatVai() {
    }

    public String getTenVai() {
        return TenVai;
    }

    public void setTenVai(String TenVai) {
        this.TenVai = TenVai;
    }

    public String getTinhChatVai() {
        return TinhChatVai;
    }

    public void setTinhChatVai(String TinhChatVai) {
        this.TinhChatVai = TinhChatVai;
    }

    @Override
    public String toString() {
        return "ChatVai{" + "TenVai=" + TenVai + ", TinhChatVai=" + TinhChatVai + '}';
    }
    
}
