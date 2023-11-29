/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntk.thuchanhbuoi4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DELL
 */
public class HocVien {
   private static int dem = 0;
   private int maSo;
   private String hoTen;
   private LocalDate ngaySinh;
   private String queQuan;
   private double[] diem;
   {
       dem++;
       this.maSo = dem;
   }
   
   public HocVien(String hoTen,String queQuan, LocalDate ngaySinh){
       this.hoTen = hoTen;
       this.queQuan = queQuan;
       this.ngaySinh = ngaySinh;
   }
   public HocVien(String hoTen,String queQuan ,String ngaySinh){
       this(hoTen,queQuan, 
        LocalDate.parse(ngaySinh, 
       DateTimeFormatter.ofPattern("dd/MM/yyyy")));
   }
   
   public HocVien(){
   }
   
   public void nhapDiem(){ 
       this.diem =  new double[CauHinh.MAX_MON];
       for(int i = 0; i < CauHinh.MAX_MON; i++){
           System.out.printf("Nhap diem mon thu %d: ", i + 1);
           diem[i] = CauHinh.sc.nextDouble();
       }
   }
   public void nhapDiem(double a, double b, double c){ 
       this.diem =  new double[CauHinh.MAX_MON];
       diem[0] = a;
       diem[1] = b;
       diem[2] = c;
    }
   public double diemTB(){
       double sum = 0;
       for(int i = 0; i < CauHinh.MAX_MON; i++){
           sum += this.diem[i];
       }
       double avg = sum*1.0/3;
       return avg;
   }
   
   public void xuatDiem(){
       for(int i = 0; i < CauHinh.MAX_MON; i++){
           System.out.printf("\nDiem mon thu %d la: ", i + 1);
           System.out.printf("%1.2f",this.diem[i]);
       }
   }

   public void nhapHV(){
       System.out.print("\nNhap ho ten: ");
       this.hoTen = CauHinh.sc.nextLine();
       System.out.print("\nNhap que quan: ");
       this.queQuan = CauHinh.sc.nextLine();
       System.out.print("\nNhap ngay sinh(dd/MM/yyyy): ");
       this.ngaySinh = LocalDate.parse(CauHinh.sc.nextLine(),
       DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT));
   }
   
   public int soSanh(HocVien h){
       double h1 = this.diemTB();
       double h2 = h.diemTB();
       if(h1 > h2)
           return 1;
       else if(h1 < h2)
           return -1;
       else 
           return 0;
   }
   
   public boolean isScholarShip(){
       if(this.diemTB() <= 5)
           return false;
       else
           return this.diemTB() >= 8.0;
   }
    
   public void show(){
       //String str  = String.format("My name is %s", name);
       System.out.printf("\nMa so: MS%05d", maSo);
       System.out.print("\nHo ten: " + this.hoTen);
       System.out.print("\nQue quan: " + this.queQuan);
       System.out.print("\nNgay sinh: "+ this.ngaySinh);
       if(this.diem != null){
           this.xuatDiem();
           System.out.printf("\nDiem trung binh: %1.2f", this.diemTB());
       }   
   }
   
   public void showHocBong(){
       System.out.printf("\nMa so: MS%05d", maSo);
       System.out.print("\nHo ten: " + this.hoTen);
       System.out.printf("\nDiem trung binh: %1.2f", this.diemTB());
   }
   
    /**
     * @return the dem
     */
    public int getDem() {
        return dem;
    }

    /**
     * @param dem the dem to set
     */
    public void setDem(int dem) {
        this.dem = dem;
    }

    /**
     * @return the maSo
     */
    public int getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
   
   
}
