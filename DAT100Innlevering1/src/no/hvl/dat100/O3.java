import java.util.Scanner;
public class O3 {
    public static void main(String[] args) {
   
    int n = 0;
    for (int i = 0; i <= n; i++) {
    System.out.println("Tall?");
    Scanner userInput = new Scanner(System.in);
    int tall = userInput.nextInt();
    int fact = 1;

    if (tall < 0) {
    System.out.println("Skriv på nytt"); 
    i--;
    } else {
        for(i=1;i<=tall;i++){    
            fact=fact*i;  
            System.out.println("Svar" + " " + fact);
    }   
    
}
}
}
}   

