/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilganjilgenap;

import java.util.Scanner;

/**
 *
 * @author dahal
 */
public class BilGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.printf("Input sebuah bilangan : ");
        int bilangan=s.nextInt();
        if (bilangan % 2 == 1) {
            System.out.printf(bilangan+" Adalah bilangan GANJIL ");
        }
        else
            System.out.printf(bilangan+" Adalah bilangan GENAP ");
    }
}
    

