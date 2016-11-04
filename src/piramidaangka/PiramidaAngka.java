
package piramidaangka;

import java.util.Scanner;

public class PiramidaAngka {
    int n;
    
    // segitiga kiri bawah
    public void segitigaSikuKiriBawah(){
        System.out.println("Segitiga Siku Kiri Bawah");
        for (int i=1;i<=n;i++){
        for (int k=0;k<i;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
    
    // segitiga kiri atas
    public void segitigaSikuKiriAtas(){
        System.out.println("Segitiga Siku Kiri Atas");
        for (int i=n;i>0;i--){
        for (int k=0;k<i;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
    
    // segitiga kanan atas
    public void segitigaSikuKananAtas(){
        System.out.println("Segitiga Siku Kanan Atas");
        for (int i=n;i>0;i--){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
        for (int k=0;k<i;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
    
    // segitiga kanan bawah
    public void segitigaSikuKananBawah(){
        System.out.println("Segitiga Siku Kanan Bawah");
        for (int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
        for (int k=0;k<i;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
    
    // segitiga sama kaki
    public void segitigaSamaKaki(){
        System.out.println("Segitiga Sama Kaki");
        for (int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
        for (int k=0;k<=(i*2)-2;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        PiramidaAngka tampil = new PiramidaAngka();
        
        System.out.print("Masukkan jumlah karakter segitiga : ");
        tampil.n = input.nextInt();        
        tampil.segitigaSikuKiriBawah();
        tampil.segitigaSikuKiriAtas();
        tampil.segitigaSikuKananAtas();
        tampil.segitigaSikuKananBawah();
        tampil.segitigaSamaKaki();
    }
    
}