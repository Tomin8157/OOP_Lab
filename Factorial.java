/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,fact=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            
        }
        System.out.println("Factorial is: "+fact);
    }
    
}
