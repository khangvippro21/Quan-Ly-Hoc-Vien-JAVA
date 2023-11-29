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
import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class ThucHanhBuoi4 { 
    
  
    public static void main(String[] args) throws FileNotFoundException, IOException {
       HocVien h1 = new HocVien("Nguyen Tran Khang","Binh Phuoc" ,LocalDate.of(2004, 07, 15));
       HocVien h2 = new HocVien("Nguyen Ngoc Kim Tu","Binh Duong" ,LocalDate.of(2004, 01, 21));
       
       QuanLyHocVien ql = new QuanLyHocVien();
//       ql.docFile();
       
       ql.themHV(h1, h2);
       h1.nhapDiem(8, 9, 10);
       h2.nhapDiem(9, 9, 9.5);
       ql.show();
       System.out.print("\nHoc vien dat hong bong la: ");
       ql.ghiFile();
       
    }
}
