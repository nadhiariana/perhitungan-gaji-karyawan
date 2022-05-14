package com.company;
import java.util.Scanner;

public class tugasAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int gol;
        int gapok = 0;
        int tunj_transport = 0;
        int totalTHP;
        int jamlembur;
        int tunj_lembur;
        System.out.println("PERHITUNGAN GAJI KARYAWAN");
        System.out.println("==========================");
        System.out.print("Masukkan Nama Anda : ");
        nama=input.nextLine();
        System.out.print("Masukkan Golongan Anda (1 - 3) : ");
        gol=input.nextInt();
        while(gol>3){
            System.out.println("Golongan antara 1 - 3");
            System.out.print("Masukkan Golongan Anda : ");
            gol=input.nextInt();
        }
        if (gol==1) {
            gapok=3000000;
            tunj_transport = 500000;
        }
        else if (gol==2){
            gapok=4000000;
            tunj_transport = 1000000;
        }
        else if (gol==3){
            gapok=5000000;
            tunj_transport = 1500000;
        }

        System.out.print("Masukkan Jam lembur Anda : ");
        jamlembur= input.nextInt();
        while (jamlembur>20) {
            System.out.println("jam lembur maksimal 20 jam");
            System.out.print("Masukkan Jam lembur Anda : ");
            jamlembur= input.nextInt();
        }
        tunj_lembur = jamlembur*50000;
        totalTHP=gapok+tunj_transport+tunj_lembur;

        System.out.println("\nRINCIAN GAJI KARYAWAN");
        System.out.println("==========================");
        System.out.println("Nama                    : "+nama);
        System.out.println("Golongan                : "+gol);
        System.out.println("Jam lembur              : "+jamlembur+" Jam");
        System.out.println("Gaji pokok              : Rp. "+gapok);
        System.out.println("Tunjangan Transportasi  : Rp. "+tunj_transport);
        System.out.println("Tunjangan Lembur        : Rp. "+tunj_lembur);
        System.out.println("Total THP               : Rp. "+totalTHP);
    }
}