import java.util.Scanner;

public class OppgaveB6 {
    public static void main(String[] args) {
        System.out.println("penger?");
        Scanner userInput = new Scanner(System.in);
        long penger = userInput.nextInt();

        if (penger < 208050) {
            System.out.println("Under trinnskatt");
        }
        if (penger > 208051 && penger < 292850) {
            System.out.println("1.7%");
            System.out.println("Skatten å betale"+ " " + (Math.round(0.017*penger)) + "kr");
        }
        if (penger > 292851 && penger < 670000) {
            System.out.println("4%");
            System.out.println("Skatten å betale"+ " " + (Math.round(0.04*penger)) + "kr");
        }
        if (penger > 670001 && penger < 937900) {
            System.out.println("13.6%");
            System.out.println("Skatten å betale"+ " " + (Math.round(0.136*penger)) + "kr");
        }
        if (penger > 937901 && penger < 1350000) {
            System.out.println("16.6%");
            System.out.println("Skatten å betale"+ " " + (Math.round(0.166*penger)) + "kr");
        } 
        if (penger > 1350001) {
            System.out.println("17.6%");
            System.out.println("Skatten å betale"+ " " + (Math.round(0.176*penger)) + "kr");
        }
        }      
    }

