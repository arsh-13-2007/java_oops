import java.util.* ; 
// differnce between next and nextline ; 

/*(next) keyword only take one word of string in input 
 else nexline take full string  as input 
*/


// # string  is object in java not we not able to use (==) to compare to string 
// string are inmutable 
public class string {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in) ;
        // string function 
        // 1. concatenation
          
        String firstname = sc.nextLine() ; 
        String lastname = sc.nextLine() ; 
        System.out.println(firstname +" "+ lastname) ; 

        String fullname = firstname +" "+ lastname ; 
        System.out.println(fullname.length()) ; 

        //2. charat 

        for ( int i = 0 ; i<fullname.length() ; i++){
            System.out.println(fullname.charAt(i)) ; 
        }
        
       String str1 = "arsh" ; 
       String str2 = "arsh" ; 

       if (str1.compareTo(str2)==0 ) {
        System.out.println("this string are equal") ; 
       }
       else {
         System.out.println("this string are not equal") ; 
       }
        
       String sentence = "i am arsh from haryana and i complete my schooling from sd public school yamuna nagar"; 
       String newsubstring = sentence.substring(11 , sentence.length()) ; 
       System.out.println(newsubstring.length()) ; 
       System.out.println(newsubstring) ; 

        sc.close(); 

    }
}
