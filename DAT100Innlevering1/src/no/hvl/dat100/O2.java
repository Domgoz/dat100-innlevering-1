package no.hvl.dat100;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
    
        int[] F = new int[40];
        int[] E = new int[10]; 
        int[] D = new int[10];
        int[] C = new int[20];
        int[] B = new int[10];
        int[] A = new int[11];
        
        for (int i = 0; i < F.length; i++) {
            F[i] = i;
        }
        for (int i = 0; i < E.length; i++) {
            E[i] = i + 40;
        }
        for (int i = 0; i < D.length; i++) {
            D[i] = i + 50;
        }
        for (int i = 0; i < C.length; i++) {
            C[i] = i + 60;
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = i + 80;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 90;
        }

        int n = 9;
        for (int i = 0; i <= n; i++) {
            System.out.println("poeng?");
            Scanner userInput = new Scanner(System.in);
            int poeng = userInput.nextInt();

            if (poeng > 100 || poeng < 0) {
                System.out.println("Feil Poeng verdi!");
                System.out.println("Skriv inn på nytt.");
                i--;
                }
            if (poeng >= F[0] && poeng <= F[F.length - 1]) {
                    System.out.println("F");
                }
            if (poeng >= E[0] && poeng <= E[E.length - 1]) {
                    System.out.println("E");
                }
            if (poeng >= D[0] && poeng <= D[D.length - 1]) {
                    System.out.println("D");
                }
            if (poeng >= C[0] && poeng <= C[C.length - 1]) {
                    System.out.println("C");
                }
            if (poeng >= B[0] && poeng <= B[B.length - 1]) {
                    System.out.println("B");
                }
            if (poeng >= A[0] && poeng <= A[A.length - 1]) {
                    System.out.println("A");
                }
            }
        }
}
