
class pen {
    String color ; 
    String type ; 
    public void write() {
        System.out.println("hilllo this side arsh ewwwwwww") ; 
    }
    public void printcolor (){
        System.out.println(this.color) ; 
    }
    public void printtype (){
        System.out.println(this.type) ; 
    }
}

class Student {
    int age ; 
    String  name ; 
    public void info(){
       System.out.println(this.name) ; 
       System.out.println(this.age) ; 
    }

    // Student(String name , int age){  // parameterized constructor 
    //    this.name = name;
    //    this.age = age  ; 
        
    // }

    Student( Student s1 ){    // copy constructor 
        this.name = s1.name ; 
        this.age= s1.age ; 
    }
    
    Student(){        // non - parameterized constructor 

    }
}

public class oops {
    public static void main (){
    //                                  class 1 
    
    // object  1 
    pen pen1 = new pen() ; 
    pen1.color = "red"  ; 
    pen1.type = "gel" ;
    pen1.write() ; 
    System.out.println(pen1.color) ;  
    

    // object 2             
    pen pen2 = new pen() ; 
    pen2.color = "black" ; 
    pen2.type = "ballpoint" ; 

    pen2.write() ; 
    pen2.printcolor();
    pen2.printtype() ;
    System.out.println(pen2.color) ;  
    System.out.println(pen2.type) ;  


    //                            class 2 

    // object 1 


    Student s1 = new Student(); 
    s1.name ="arsh" ; 
    s1.age = 19 ; 
    s1.info() ; 

    Student s2 = new Student(s1) ; 
    s2.info();
    // s1.info() ;     
    // Student s2 = new Student("anurag" ,20) ; 
    // s2.info(); 

    }
}