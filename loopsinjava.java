import java.util.Scanner;

public class loopsinjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        // for loop 
        int n = sc.nextInt() ; 
        for ( int i = 1 ;i  <= n ; i ++){
            System.out.println("helllo ladale") ; 
        }
        ///  while loop 
        int i = 0 ; 
        while( i <n ){
            System.out.println("hello to system") ;
            i= i+1 ;  
        }
        // do while loop 
        int j = 0 ; 
        do { 
            System.out.println("kaise hai bhai ladale") ;
            j = j + 1 ; 
            } while ( j <n );

    }
}
