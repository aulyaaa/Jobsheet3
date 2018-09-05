/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpraktikum;

/**
 *
 * @author user
 */
public class tesmain {
    public static void main(String[] args){
        jurusan myjurusan = new jurusan();
        System.out.println("-----------------------------------------");
        myjurusan.cetakSekolah("SMK Telkom Malang");
        myjurusan.cetakGuru("Pak Arifin");
        myjurusan.cetakJurusan("Rekayasa Perangkat Lunak");
        myjurusan.cetakMapel("OOP");
        myjurusan.cetakKelas("XIR5");
        System.out.println("-----------------------------------------");
    }
}
