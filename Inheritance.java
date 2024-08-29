
class  box{ 
    int x  ;

    public int get(){
       return x  ;
    }
    public void set(int x){
       this.x = x ;
    }
    public void printMe(){
        System.out.println("I am a COnstructor");
    } 
 }  

   class derived extends box{  //  extends for the inheritance all the methos inside the box are in derives with the extends .
     int y  ;
     public int getY() {
        return y ;
     }
     public void setY(int y){
        this.y = y ;
     }
   }


public class Inheritance { 
    public static void main(String[] args) {
        box x = new box() ;
        x.set(5) ; //  derived cannot excess in base x
        System.out.println(x.get());



        derived d = new derived() ;
        d.set(10); // it is for the base x , we  excess the base method inside  the derived method .
        d.setY(55);     //  it is fot the derives y
        System.out.println(d.getY());

    }
}
