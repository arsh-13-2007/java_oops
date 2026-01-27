
public class typecasting {
    public static void main(String args[]){
        // 1. implicit type casting 
        // Done automatically by Java
        //  no Data loss

        int number1 = 12 ; 
        double number2 = number1 ; 
        System.out.println(number2) ;

        // explicit typecasting 
        // Done manually by the programmer
        // Data loss may occur
        double number3 = 11.3456543 ; 
        int number4 = (int ) number3 ; 
        System.out.println(number4) ; 

    }
}
