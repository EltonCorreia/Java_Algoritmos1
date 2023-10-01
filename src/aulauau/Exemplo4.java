
package aulauau;
import java.util.Scanner;

public class Exemplo4 {

    public static void main(String args[]){
    
        String nome, sobrenome;
        Scanner sc1 = new Scanner(System.in,"latin1");
        
        System.out.print("Digite seu nome mané: ");
        nome = sc1.nextLine();
        
        System.out.print("Digite seu sobrenome agora otário: ");
        sobrenome = sc1.next();
        
        System.out.println("O nome do mané é: " + nome + " " + sobrenome);
        
    }
    
}
