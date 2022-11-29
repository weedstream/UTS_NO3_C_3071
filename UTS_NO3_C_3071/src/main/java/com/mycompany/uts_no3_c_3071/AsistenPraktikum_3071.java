/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3071;

/**
 *
 * @author badnoby
 */
public class AsistenPraktikum_3071 extends Mahasiswa_3071 {
    String mkAsisten_3071;
    int jmlPertemuan_3071;
    
    public double totalPendapatan_3071(){
        return(jmlPertemuan_3071 * 50000);
    }
    public void tampilDataAsistenPraktikum_3071() {
        super.tampilDataMhs_3071();
        System.out.println(" Mata Kuliah    : " + mkAsisten_3071);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan_3071);
        System.out.println(" Total Pendapatan : " + totalPendapatan_3071());
        
        
    }
}
