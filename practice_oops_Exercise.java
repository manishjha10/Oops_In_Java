import java.util.Scanner;
class square {
    int side  ;
    public int perimeter(int side ) {
    return 4 * side ;
    }
} 
class rectangle {
   int length  ;
   int breath  ;
   public void areaOfRectangle(int length ,  int breath) {
    System.out.printf("Area of Rectagle is %d whose length is %d and breath is %d ",(length* breath ) ,length ,  breath);
   }

  public int perimeterRectangle(int length   , int breath) {
    return 2*(length* breath) ;
  }
} 


public class Practice { 
   public static void main(String[] args) {
   square sq = new square() ; 
   Scanner sc = new Scanner(System.in) ; 
   System.out.println("Enter the side of the square :");
   sq.side  = sc.nextInt() ;
   int n =  sq.side; 
   System.out.println("Area odf square " + n * n); 
   System.out.println("Perimetr od Square is  :" + sq.perimeter(sq.side));


    //  rectangle  
    rectangle r =  new rectangle() ;
    System.out.println("Enter the length and breath of a rectangle :");
    r.length  = sc.nextInt() ;
    r.breath = sc.nextInt() ;   
    r.areaOfRectangle(r.length, r.breath) ;
    System.out.println();

    r.areaOfRectangle(r.length, r.breath) ;
    System.out.println();
    System.out.println("Perimetre of Rectangle is  "+ r.perimeterRectangle(r.length, r.breath));
}
}


