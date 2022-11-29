/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3071;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author badnoby
 */
public class UTS_NO3_C_3071 {

    public static void main(String[] args) {
        //Membuat object menggunakan array
        AsistenPraktikum_3071[] AsPrak_3071 = new AsistenPraktikum_3071[1];
        StudentStaff_3071[] StuStaff_3071 = new StudentStaff_3071[1];
        
        AsPrak_3071[0] = new AsistenPraktikum_3071();
        StuStaff_3071[0] = new StudentStaff_3071();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data nelayan
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                AsPrak_3071[i].nim_3071 = br.readLine();
                System.out.print("Nama             : ");
                AsPrak_3071[i].nama_3071 = br.readLine();
                System.out.print("Jurusan          : ");
                AsPrak_3071[i].jurusan_3071 =br.readLine();
                System.out.print("IPK              : ");
                AsPrak_3071[i].ipk_3071 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                AsPrak_3071[i].mkAsisten_3071 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                AsPrak_3071[i].jmlPertemuan_3071 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data nelayan
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3071 AP : AsPrak_3071){
                AP.tampilDataAsistenPraktikum_3071();
                System.out.println("");
            }

            //mengisi data ke array pada data dokter
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                StuStaff_3071[i].nim_3071 = br.readLine();
                System.out.print("Nama        : ");
                StuStaff_3071[i].nama_3071 = br.readLine();
                System.out.print("Jurusan     : ");
                StuStaff_3071[i].jurusan_3071 =br.readLine();
                System.out.print("IPK         : ");
                StuStaff_3071[i].ipk_3071 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                StuStaff_3071[i].unitKerja_3071 = br.readLine();
                System.out.print("Jam Kerja   : ");
                StuStaff_3071[i].jamKerja_3071 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data dokter
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3071 SS : StuStaff_3071){
                SS.tampilDataStudentStaff_3071();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}
