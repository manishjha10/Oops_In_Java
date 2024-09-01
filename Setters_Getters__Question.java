class manish{       //  Worker Details  .
    int n ;
    String name ;
    int salary ;
    String inf ;

  public void printdetails() {   //  Declare a Function - 1 .
    System.out.println(n);
    System.out.println(name) ; 
  } 
  public int getSalary() {
        return salary ;
  } 
  public String get() {
    return inf ;
  }

}


public class customClass {
    public static void main(String[] args) { 
        // Atributes of manish
       manish d = new manish() ;
       manish d1 = new manish() ;
       d.n =25 ;
       d.name  ="manish jha" ;
       d.salary = 25; 
       d.inf = "great" ;
       // System.out.println(d.name); 
       //  Attributes of John .

       d1.n =  22 ;
       d1.salary = 63 ;
       d1.name = "John" ;
       System.out.println(d.n);
       System.out.println(d.name); 

    d1.printdetails() ; //  John  details 
    d.printdetails();    // manish   details 

    int salary  = d1.getSalary() ;
    System.out.println("Salary of john " + salary); 
    System.out.println("salry of manish jha " + d.salary); 
     
    
    String inform =  d.get() ;
    System.out.println(inform); 

    }
} 
