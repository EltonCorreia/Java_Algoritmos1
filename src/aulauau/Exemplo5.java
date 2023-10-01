
package aulauau;
import java.util.Scanner;

public class Exemplo5 {
    
    public static void main(String args[]){
        
        int num;
        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = sc1.nextInt();
        
        if(num % 2==0){
            System.out.println(num + " é Par");
        }
        else{

            System.out.println(num + " é Ímpar");
        
        }
    }
    
}
