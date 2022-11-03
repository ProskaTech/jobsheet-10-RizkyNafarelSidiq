/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanjs10mobil;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
public class latihanMobilUtama {
    public static void main (String [] args) {
        Latihanjs10mobil Honda = new Latihanjs10mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;
        System.out.println("Merek\t: " + Honda.merk);
        System.out.println("Warna\t: " + Honda.warna);
        System.out.println("Tahun\t: " + Honda.tahunproduksi);
        Honda.maju();
        Honda.maju();
        Honda.mundur();
    }
    
}
