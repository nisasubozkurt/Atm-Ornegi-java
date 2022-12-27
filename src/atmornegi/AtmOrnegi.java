/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmornegi;

import java.util.Scanner;

public class AtmOrnegi {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen çekmek istediğiniz para türünü seçin (dolar ise 1 , euro ise 2): ");
        int türü = giris.nextInt();
        if (türü == 1) {
            System.out.println("Dolar türü seçildi..");
        } else if (türü == 2) {
            System.out.println("Euro türü seçildi..");
        } else {
            System.out.println("Hatalı tuşa bastınız,lütfen tekrar deneyin.");
        }

        System.out.println("Para yatırmak için 1'e , para çekmek için 2'ye , kalan parayı öğrenmek için 3'e basın.");
        Atm atm = new Atm();
        int tus = giris.nextInt();
        int sayac = 4;
        while (tus < sayac) {
            if (tus == 1) {
                atm.paraYatır(500);
            } else if (tus == 2) {
                atm.paraÇek(200);
            } else if (tus == 3) {
                atm.kalanPara();
            } else {
                System.out.println("Hatalı tuşlama yaptınız, lütfen tekrar deneyin.");
            }
            tus++;
        }

    }

}
