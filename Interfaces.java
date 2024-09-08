interface  machine {
    int a = 45;   
    void recovery_parts(int prize_required) ;              //  non abtract  declaration
    abstract  void  machine_oil(String name ) ; //  Interface contain abstract declaration 

//    public void hamara(int n){
//     System.out.println();           //  Not contain methods and constructors in interface 
//    }

}

interface  Machinery{
   
    void r(int n);
}

class Modify_Machine implements machine , Machinery {       //  Multiple  interaces contain but not in abstraction 

    public void machine_oil(String name ){
        System.out.println("Castrol oil TIkka Chalega  .."+ name) ;
    }
    public void r(int n){
        System.out.println(n);
     }
    
     public void recovery_parts(int prize_required){
        System.out.println(prize_required);
    }
}

   
public class Interfaces{ 
    public static void main(String[]  args) { 

      Modify_Machine  m = new Modify_Machine()  ;          //  Reference of machine create [Objects not creates in interference but we create references .]
      m.machine_oil("TypeDesel");
      m.recovery_parts(560);
      m.r(564);
      System.out.println(m.a); 


       // You cannot  Mofiyed the properties in interfacess as they are final. 
      // m.a = 66 ;
      // System.out.println(m.a);
    

    }
}
