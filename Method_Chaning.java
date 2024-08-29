
// Second example of Methos Chanining  ;
class Rectangle {
    int length  ;
    int width  ;
    int height  ;

    Rectangle area(int length , int width ){  //  Rectangle to return this object of the class  [Means return to the this Rectangle object]
        this.length = length ;
        this.width = width ;
        return this ;

    }
    Rectangle volume(int length ,int width ,int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        return this;
    }

    public int getVolume() {
        return length*width*height;  //  to print thte volume
    }
    public int getArea() {
        return length*width;
    }
}

public class methodChaning_in_opps {
    public static void main(String[] args) {
      Rectangle  r = new Rectangle() ;
      r.volume(1,5,3).area(9,14) ;
        System.out.println(r.getVolume());
        System.out.println(r.getArea());
        
    }
}
