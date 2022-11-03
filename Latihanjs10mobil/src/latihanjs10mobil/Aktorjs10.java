/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanjs10mobil;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
public class Aktorjs10 {
    String nama;
	int umur;
	
	Aktorjs10 (String n, int u){
		nama=n;
		umur=u;
	}
	
	void tampilAktor() {
		System.out.println("Namaku : " +nama);
		System.out.println("Umurku : " +umur+ "Tahun");
	}
	
	public static void main(String args[]) {
		Aktorjs10 a;
		
		a=new Aktorjs10 ("Ronaldo", 33);
		a.tampilAktor();
		System.out.println("============");
		
		a=new Aktorjs10("Messi", 34);
		a.tampilAktor();
		System.out.println("=============");
	}
    
}
