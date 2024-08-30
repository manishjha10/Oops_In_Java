class circle  {   // Question - 1 
  int radius  ;
  int area ;
  circle(int radius){ 
    this.radius = radius ;
    this.area = (int)((Math.PI)*(radius*radius)) ;
    System.out.println("I am aConstructor of a Circle class , radius "+ radius);
  }

  circle(){
    System.out.println(" I am a secondConstructor of a circle ..");
   }
  int getarea()
   {
    return area ;
    } 
    
}

class Cyclinder extends circle{ 
    int height  ;
    int radius  ;
    int volume ;
    Cyclinder(int radius  , int height){
       super(radius) ;

       this.height  = height ;
       this.volume  = (int)((Math.PI)*(radius*radius)*height) ;
       System.out.println(" I am A constuvtor of a circle , radius  " + radius+ " Height is  " + height ) ;   
    }
    int getVolume() {
     return volume ; }
}

 public static void main(String[] args) {
        circle c  = new circle(5) ;
        Cyclinder cyc = new Cyclinder(2,3);
        System.out.println("Area of a circle " + cyc.getarea());
        System.out.println(cyc.getVolume());

