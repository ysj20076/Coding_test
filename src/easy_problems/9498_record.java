import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int record = s.nextInt();
        
        if(record > 89) {
            System.out.println("A");
        }
        
        else if (record > 79) {
            System.out.println("B");
        }
        
        else if (record > 69) {
            System.out.println("C");
        }
        
        else if (record > 59) {
            System.out.println("D");
        }
        
        else {
            System.out.println("F");
        }
        
        s.close();
    }
}
