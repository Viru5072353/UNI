import java.util.Scanner;

public class P3 {
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
        System.out.println("to end the process please insert 0 as the final product");
        int i = 1;
        double sum = 0; 
        while (i!=0){
            
            System.out.print("°"+i+" product: $");
            
            double imp = sc.nextDouble();
            
            sum = sum + imp;
            
            i=i+1;
            
            if (imp == 0){
                i=0;
            }
        }
        System.out.println("Sum: $"+sum);
        sc.close();
    }
    
  }