/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntk.thuchanhbuoi4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class QuanLyHocVien {
    private final ArrayList<HocVien> ds = new ArrayList<>();
    
    public void themHV(HocVien...a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void themHV(){
        HocVien h = new HocVien();
        h.nhapHV();
        this.ds.add(h);
    }
    
    public HocVien timKiem(int ms){
        return this.ds.stream().filter(h -> h.getMaSo() == ms).findFirst().get();
    }
    public List<HocVien> timKiem(String kw){
        return this.ds.stream().filter(h -> h.getHoTen().contains(kw)).collect(Collectors.toList());
    }
    public void sapXep(){
        this.ds.sort((h1, h2)->h1.soSanh(h2));
    }
    public HocVien hocBong(){
        return this.ds.stream().filter(h -> h.isScholarShip()== true).findFirst().get();
    }
    public void nhapDiem(){
        this.ds.forEach(h -> h.nhapDiem());
    }
    
    
    public void docFile() throws FileNotFoundException{
        File f = new File("src/main/resources/DanhSachHocVien.txt");
        try (Scanner sc = new Scanner(f)){
            while(sc.hasNext())
                this.ds.add(new HocVien(sc.nextLine(), 
                        sc.nextLine(), sc.nextLine()));
        }
    }
    public void ghiFile() throws IOException {
          try{
          FileWriter f = new FileWriter("src/main/resources/HocBong.txt");
          for(int i = 0; i < ds.size(); i++){
              HocVien h;
              h = ds.get(i);
              String str  = String.format("\nMa so: MS%05d", h.getMaSo());
              if(h.isScholarShip()){
                  f.write(str);
                  f.write("\nHo ten: " + h.getHoTen());
                  f.write("\nDiem trung binh: "+h.diemTB());
              }
          }
          f.close();
       }catch(IOException e){
           System.out.println(e);
       }
       System.out.print("\nSuccess...");
    }
   
    public void show(){
        this.ds.forEach(h->h.show());
    }
}
