
import java.util.Scanner;

public class ifandelseandswitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter number:") ; 
        int num  = sc.nextInt(); 
        if ( num  % 2  == 0  && num != 0  ){
            System.out.println("num is even") ; 
        }
        else if ( num  == 0 ){
            System.out.println("number if not even and not odd") ; 
        }
        else {
            System.out.println("number is odd") ;
        
        }
    System.out.println("enter value of button:") ; 
    int button = sc.nextInt() ; 
    // switch 
    switch (button) {
        case 1: 
            System.out.println("hello") ; 
            break;
        case 2: 
            System.out.println("namaste") ; 
            break;
        case 3: 
            System.out.println("bonjour") ; 
            break;
        default:
            System.out.println("invalid button") ; 
            break;
            
    }
    }
}
