import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
       
        Scanner leitor = new
            Scanner(System.in);
        
        int numero1;
        
        System.out.println("Digite um numero: ");
        numero1 = leitor.nextInt();
        
        if (numero1 % 2 ==0) {
            System.out.println("O numero é multiplo de 2.");
        } else {
            System.out.println("O numero nao é multiplo de 2.");
        }
        
        leitor.close();
    }
}
