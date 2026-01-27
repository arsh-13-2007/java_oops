class Student {
    String name ; 
    int age ; 

    public void printinfo(String name){
        System.out.println(name) ; 
       
    }
    public void printinfo(int age ){
        
        System.out.println(this.age);
    }
    
    public void printinfo(String name , int age ){
       
        System.out.println("name :"+name+"and age :"+age);
    }
    

    Student(String name , int age ){
        this.name = name ; 
        this.age= age ; 
    }
}

public class oopstwo {
    public static void main (String args[]){
      Student s1 = new Student("arsh" , 19 ) ; 
      s1.printinfo("arsh" ,19) ; 
    }
}
