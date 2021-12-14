/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk_kasir;

import java.util.Scanner;

public class MainProgram {
    double harga, total, bayar, kembalian;
    int phil, jumlah;
    
    double hitungTotal(int jml){
        jumlah = jml;
        switch(phil){
            case 0:
                System.exit(0);
                break;
            case 1:
                harga = 20000;
                total = total+(harga*jml);
                break;
            case 2:
                harga = 2500;
                total = total+(harga*jml);
                break;
            case 3:
                harga = 23000;
                total = total+(harga*jml);
                break;
            case 4:
                harga = 18000;
                total = total+(harga*jml);
                break;
            case 5:
                harga = 5000;
                total = total+(harga*jml);
                break;
            case 6:
                break;
        
        }
            return total;
    }
    
    void viewTotal(){
        System.out.println("======Pembayaran=======");
        System.out.println("total : Rp. " + total);
    }
    
    double hitungKembalian(double byr){
        bayar = byr;
        kembalian = byr-total;
        return kembalian;
    }
    
    void viewKembalian(){
        System.out.println("Kembalian : Rp. " + kembalian);
        System.out.println("======Terima kasih=======");
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         MainProgram in = new MainProgram();
         System.out.println("========Selamat Datang di kasir imwimart=======");
         do{
            System.out.println("===========Menu============");
            System.out.println("1. Susu UHT Rp. 20.000");
            System.out.println("2. Mie Goreng Rp. 2.500");
            System.out.println("3. Kopi kapal api 380gr Rp. 23.000");
            System.out.println("4. Chocolate silver queen Rp. 18.000");
            System.out.println("5. Es krim Rp. 5000");
            System.out.println("\n6. Selesai dan mulai pembayaran ");
            System.out.println("7. Logout");
            System.out.println("===========================");
            System.out.print("Masukan pilihan :");
            in.phil = input.nextInt();
            if(in.phil>=1 && in.phil<=5){
                System.out.print("masukan jumlah beli :");
                in.jumlah = input.nextInt();
            }else{
                
            }
            in.hitungTotal(in.jumlah);
         }while(in.phil!=6);
         in.viewTotal();
         System.out.print("bayar : Rp. ");
         in.bayar = input.nextDouble();
         in.hitungKembalian(in.bayar);
         in.viewKembalian();
         
    }
    
}
