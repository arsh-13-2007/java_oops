import java.util.*;
//StringBuilder is a mutable class in Java used to create and modify strings efficiently.
public class stringsbuilder {
     public static void main (String arsg[]){
        Scanner sc = new Scanner (System.in) ; 
        StringBuilder sb = new StringBuilder("this  side arsh"); 
        System.out.println(sb) ;

        // charAt 
        System.out.println(sb.charAt(12)) ;

        // setCharAt
        sb.setCharAt(4 , 's') ; 
        System.out.println(sb) ; 

        // if we want to insert any think 
        sb.insert(3, "s") ; 
        System.out.println(sb) ; 

        // delete the extra character
        sb.delete(3, 5  ) ; 
        System.out.println(sb) ; 
        // append 
        sb.append(" aggarwal") ; 
        System.out.println(sb) ; 
      
         

        System.out.print("enter small string: ");
        String str = sc.nextLine();
        System.out.println(str);

        // question reverse the string 
        StringBuilder sentence = new StringBuilder("") ; 
        sentence.append(sc.nextLine()) ;
        // // for ( int i = n-1  ; i>= 0 ; i--){

        // // }
          sc.close() ;  
     }
}
