import java.util.Scanner;

public class Exer3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1; i<11; i++){
            System.out.printf("%d X %d = %d\n", N, i, N*i);
        }
    }
}
