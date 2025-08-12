import java.util.Scanner;

public class Exer2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma nota de 0 a 10:");
        double Nota = sc.nextDouble();
        
        while(Nota < 0 || Nota > 10){
            System.out.println("Nota invalida!!");
            Nota = sc.nextDouble();
        }

        if(Nota < 5){
            System.out.println("Reprovado");
        }
        else if(Nota < 7){
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("Aprovado");
        }

    }
}
