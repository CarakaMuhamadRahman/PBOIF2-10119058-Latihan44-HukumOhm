/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung beda potensial.
 */
public class PBOIF210119058Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3,12);
        System.out.println("Kuat Arus      : " + baterai1.getKuatArus() + " ampere ");
        System.out.println("Hambatan       : " + baterai1.getHambatan() + " ohm ");
        System.out.println("Hasil Tegangan : " + baterai1.hitungTegangan() + " volt ");
    }
    
}
