import java.util.Scanner;

public class pattern {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("number of rows:") ; 
        int n = sc.nextInt() ;
        // System.out.print("\n number of stars in each row:") ; 
        // int m = sc.nextInt() ; 

       //                                  pattern 1 :empty square 

        // for ( int i = 1 ; i <= n ; i++){
        //     for ( int j = 1 ; j <= m ; j ++) {
        //         if(j == 1 || i == 1 || i == n || j== m ) {
        //         System.out.print("*") ; 
        //         }
        //         else {
        //             System.out.print(" ") ; 
        //         }
        //     }
        //     System.out.println() ;
        // }


       //                                       pattern 2: right angle triangle

    //    for ( int i = 1  ; i <=n ; i++){
    //     for ( int j = 1 ; j<=i ; j++){
    //         System.out.print("*") ; 
    //     }
    //     System.out.println() ; 
    //    }

    //                                          pattern 3:ulta right angle triangle
    //  for ( int i =1 ; i<= n ; i++){
    //     for ( int j=n ; j >= i ; j-- ){
    //         System.out.print("*") ; 
    //     }
    //     System.out.println() ; 
    //  }      
     
    //                                          pattern 4:side wala right angle triangle
    
    //  for ( int i = 1 ; i <= n ; i++){
    //     for( int j =1  ; j <=n-i ; j++ ){
    //         System.out.print(" ") ; 
    //     }
    //     for( int k = 1  ;k <= i-1  ; k++){
    //         System.out.print("*") ; 

    //     }
    //     System.out.println() ; 
    //  }
    //                                          pattern 5
    // for ( int i =1 ; i <= n ; i++){
    //     for( int j = 1 ; j <= i ; j++){
    //         System.out.print(j) ; 
    //     }
    //     System.out.println() ; 
    // }   
    //                                          pattern 6 
    //  for ( int i = 1 ; i <= n ; i++){
    //     for( int j = 1 ; j <= n-i+1 ; j++){
    //         System.out.print(j) ; 
    //     }
    //     System.out.println(); 
    //  }
    //                                          pattern 7
    // int num =1 ; 
    // for ( int i =1 ; i <= n ; i++){
    //     for (int j = 1 ; j <= i ; j ++ ){
    //         System.out.print(num + " ") ; 
    //         num = num+ 1 ; 
    //     }
    //     System.out.println() ; 
    // }
    //                                         pattern 8 
    // for ( int i =1 ; i<= n ; i++){
    //     for (int j =1 ; j<=i ; j ++){
    //         int sum = i + j ; 
    //         if(sum  %2 == 0 ){
    //             System.out.print("1") ; 
    //         }
    //         else {
    //             System.out.print("0") ; 
    //         }
    //     }
    //     System.out.println() ; 
    // }
    //                                           advance pattern  1 
    // int j  , m ; 
    // for ( int i = 1 ; i <= n ; i++){
    //     for (  j =1 ; j <= i ; j ++){
    //         System.out.print("*") ; 
    //     }
    //     for (  m = j ; m  <= j ; m++){
    //         System.out.print(" ") ; 
    //     }
    //     for( int l =  m ; l <= n - i ; l++){
    //         System.out.print(" ") ; 
    //     }
    //     for ( int k = 1 ; k <= i ; k ++){
    //         System.out.print("*") ; 
    //     }
    //     System.out.println() ; 
    // }
    // // for ( int i = 1 ; i <= n ; i++){
    // //     for ( int j =n; j >= i  ; j --){
    // //         System.out.print("*") ; 
    // //     }
    // //     System.out.println() ; 
    // // }
    // for ( int i = 1 ; i <= n ; i++){
       
    // }
    // // for ( int i = 1 ; i <=n ; i ++){
    // //     for ( int j = 2;j <= i ; j++){
    // //         System.out.print(" ") ; 
    // //     }
    // //     for (int k = 1 ; k<= n - i+ 1  ; k++){
    // //         System.out.print("*") ; 
    // //     }
    // //     System.out.println() ; 
    // // }
    //                              advance pattern 2 
    //   for ( int i = 1 ; i <= n ; i++){
    //      for ( int j = n ; j> i ; j--){
    //         System.out.print(" ") ;
    //      }
    //      for ( int k = 1 ; k <= 5 ; k ++){
    //         System.out.print("*"); 
    //      }
    //      System.out.println() ; 
    //     }
    //                            advance pattern 3 
    // int num = 1 ; 
    // for(  int i = 1 ; i <= n ; i++ ){
    //     for ( int j = 1 ; j < n-i+1 ; j++ ){
    //         System.out.print(" ");
    //     }

    //     for ( int k=1 ; k<= 2*i ; k++){
    //         if (k % 2 != 0 ) {
    //         System.out.print(num); } 
    //         else {
    //         System.out.print(" ") ; 
    //         }
    //     }
    //     num  = num + 1  ; 
    //     System.out.println() ; 
    // }
    //                         advance pattern 4 
    for(  int i = 1 ; i <= n ; i++ ){
        for ( int j = 1 ; j < n-i+1 ; j++ ){
            System.out.print(" ");
        }
        for ( int k=1 ; k<= 2*i - 1  ; k++){
            System.out.print("*") ; 
            }
            System.out.println();  
    }
        for(  int i = n  ; i >= 1 ; i-- ){
        for ( int j = 1 ; j < n-i+1 ; j++ ){
            System.out.print(" ");
        }
        for ( int k=1 ; k<= 2*i - 1  ; k++){
            System.out.print("*") ; 
            }
            System.out.println();  
    }
    }
    }
