import java.util.Scanner;

public class Exer4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String Nome = sc.nextLine();
        
        System.out.print("Digite sua idade: ");
        int Idade = sc.nextInt();
        
        System.out.print("Digite sua altura: ");
        double Altura = sc.nextDouble();

        System.out.printf("Dados: %s de %d anos e %.2f altura\n",Nome, Idade, Altura);
    }
}
