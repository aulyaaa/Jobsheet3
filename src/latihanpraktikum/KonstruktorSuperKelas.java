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
public class KonstruktorSuperKelas {
    public static void main(String[] arga)
    {
        Employ programer1 = new Employ ("12345678", "Yanto", 32);
        programer1.info();
        Person aku = new Person ("Aulya", 16);
        aku.info();
    }
}
