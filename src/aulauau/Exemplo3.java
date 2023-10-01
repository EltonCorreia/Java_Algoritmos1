
package aulauau;
import java.util.Scanner;

public class Exemplo3 {
    
    public static void main(String args[]){//a, um comentario
        
       double num1, num2; 
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Digite um número:");
       num1 = sc.nextDouble();
       
       System.out.print("Digite outro número:");
       num2 = sc.nextDouble();
       
       System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
       System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
       System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
       System.out.println(num1 + "÷" + num2 + "=" + (num1/num2));
    }
}
