/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Tugas03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args)throws Exception{
   
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
         String tipe = "";
         double suhu;
         double konversi_hasil=0;
         double konversi_sementara=0;
         int pilih;
         int konversi;
       
         System.out.println("Masukkan suhu :");
         suhu=Double.parseDouble(input.readLine());
       
         System.out.println("Suhu yang anda masukkan dalam skala apa?");
         System.out.println("========================================");
         System.out.println("1 = celcius");
         System.out.println("2 = farenheit");
         System.out.println("Pilihan :");
         pilih=Integer.parseInt(input.readLine());
       
         System.out.println("========================================");
         System.out.println("Suhu akan dikonversikan dalam skala apa?");
         System.out.println("1 = celcius");
         System.out.println("2 = farenheit");
         System.out.println("Pilihan :");
         konversi=Integer.parseInt(input.readLine());
       
         if((pilih==1) &&(konversi==2)){
             konversi_hasil=suhu+32;
         }else if((pilih==2)&&(konversi==1)){
             konversi_hasil=suhu-32;
         }else if ((pilih==1)&&(konversi==2)){
             konversi_sementara=suhu-32;
             konversi_hasil=1.8*konversi_sementara;
         }else if((pilih==2)&&(konversi==1)){
             konversi_sementara=0.555555556*suhu;
             konversi_hasil=konversi_sementara+273;
         }else {
             konversi_hasil=0;
         }
       
         if (konversi == 1){
             tipe="celcius";
         }else if(konversi==2){
             tipe="farenheit";
         }
         System.out.println("Maka hasil konversi suhu adalah : " + konversi_hasil + " " + tipe );   
    }}
    


   
    

