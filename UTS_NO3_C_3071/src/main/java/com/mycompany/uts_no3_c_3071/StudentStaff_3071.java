/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3071;

/**
 *
 * @author badnoby
 */
public class StudentStaff_3071 extends Mahasiswa_3071 {
    int jamKerja_3071;
    String unitKerja_3071;
    
    public double totalPendapatan_3071(){
        return (jamKerja_3071 * 30000);
    }
    public void tampilDataStudentStaff_3071(){
        super.tampilDataMhs_3071();
        System.out.println(" Unit Kerja : " + unitKerja_3071);
        System.out.println(" Jam Kerja : " +jamKerja_3071);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan_3071());
    }
}
