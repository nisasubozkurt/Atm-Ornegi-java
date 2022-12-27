/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmornegi;

public class Atm {
    public int paraToplam = 0;
    
    public void paraÇek(int para){
        paraToplam -= para;
        System.out.println("Paranız çekilmiştir.. Kalan para: " + paraToplam );
    }
    public void paraYatır(int para){
        paraToplam += para;
        System.out.println("Paranız yatırılmıştır.. Toplam para: " +paraToplam);
    }
    public void kalanPara(){
        System.out.println("Kalan paranız: " +paraToplam);
    }
}
