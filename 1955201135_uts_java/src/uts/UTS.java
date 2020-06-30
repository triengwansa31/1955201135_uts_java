/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;


/**
 *
 * @author Toshiba
 */
public class UTS {

    public static void main(String[] args){
        System.out.println("Paket Cukur Rambut");
        int paket = 0;
        
        //perulangan
        for(int i = 1; i <=4; i++){
            System.out.println("Pilih Paket Cukur " +i);
        
        //input-output
        System.out.println("Pilih Paket Yang Sesuai Dengan Kebutuhan Anda :");
        Scanner inputUser = new Scanner(System.in);
        paket = Integer.parseInt(inputUser.nextLine());

        //percabangan
        if (paket == 1){
            System.out.printf("Paket " +paket);
            System.out.println(" = Cukur");
            System.out.println("- Biaya Rp.10.000");
        }
            
        else if (paket == 2){
            System.out.printf("Paket " +paket);
            System.out.println(" = Semir");
            System.out.println("- Biaya Rp.4.000 - Rp.10.000");
        }
        
        else if (paket == 3){
            System.out.printf("Paket " +paket);
            System.out.println(" = Keramas ");
            System.out.println("- Biaya Rp.4.000");
        }
        
        else if (paket == 4){
            System.out.printf("Paket " +paket);
            System.out.println(" = Pijat Kepala");
            System.out.println("- Biaya Rp.5.000");
        }
        else{
           System.out.printf("Paket " +paket);
           System.out.println(" = Mohon Maaf, Kami Hanya Menyediakan Paket 1-4");     
       }
            System.out.println("");
        }
        System.out.println("Total Pembayaran Bisa Dilakukan Di Kasir");
    }
}

