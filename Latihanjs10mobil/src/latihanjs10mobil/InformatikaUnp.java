/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanjs10mobil;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
public class InformatikaUnp {
   
    public static void main(String[] args) {
		
		Mahasiswajs10 informatika = new Mahasiswajs10();
		Mahasiswajs10 elektronika= new Mahasiswajs10();
		
		informatika.nama = "Happy Alicia";
		informatika.nim = 1;
		informatika.jur = "S1 Elektronika";
		informatika.univ= "Universitas Negeri Padang";
		
		elektronika.nama="wilson";
		elektronika.nim=2;
		elektronika.jur="S1 Elektronika";
		elektronika.univ="Universitas Negeri Padang";
		
		System.out.println("Data Mahasiswa Informatika");
		System.out.println("Nama : " +informatika.nama);
		System.out.println("NIM : " +informatika.nim);
		System.out.println("Jurusan : " +informatika.jur);
		System.out.println("Status : " +informatika.univ);
		System.out.println();
		
		System.out.println("*****************************");
		
		System.out.println();
		System.out.println("Data Mahasiswa Informatika");
		System.out.println("Nama : " +informatika.nama);
		System.out.println("NIM : " +informatika.nim);
		System.out.println("Jurusan : " +informatika.jur);
		System.out.println("Status : " +informatika.univ);
	}
 
}

    

