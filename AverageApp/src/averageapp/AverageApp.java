    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageapp;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class AverageApp {
    
     
    public static void main(String[] args) {
        
       System.out.print("Please enter the first Integer: ");
       Scanner console= new Scanner(System.in);
       int integer1= console.nextInt();
    
       System.out.print("Please enter the second Integer: ");
       int integer2= console.nextInt();
    
       System.out.print("Please enter the third Integer: ");
       int integer3= console.nextInt();
       int y=average3(integer1, integer2, integer3);
    
       System.out.println("The average of Interger1, Integer2, and Integer3 is " + y);
    
    
   
    }
 public static int average3(int integer1, int integer2,int integer3){
 int z= (integer1+ integer2+ integer3)/3 ;
 return z;       
 
 }   
}
