
import java.util.Scanner;
public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter an sap id: ");
        int number = sc.nextInt();

  
        System.out.print("Enter a float: ");
        float floatNumber = sc.nextFloat();

 
        System.out.print("Enter a double: ");
        double doubleNumber = sc.nextDouble();

      
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);


        System.out.print("Enter a boolean (true/false): ");
        boolean isJavaFun = sc.nextBoolean();
        sc.nextLine(); 
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

     
        System.out.println("\n--- Output ---");
        System.out.println("sap id: " + number);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Character: " + ch);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + text);


        Integer x = 10;
        System.out.println(text.getClass().getName()); 
        System.out.println(x.getClass().getName()); 


        sc.close();
    }
}
