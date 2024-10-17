class rectangle {
    float length;
    float breadth;

    public rectangle(float length , float breadth){
        this.length = length;
        this.breadth = breadth;
    }
      

    public void area() {
        System.out.println("Area : "+length*breadth);
    }

    public void perimeter(){
        System.out.println("Perimeter:  "+2*(length+breadth));
    }
  }


class square extends rectangle{
    public square (float side){
        super(side , side);

    }

}

public class p19 {
    public static void main(String[] args) {
        rectangle[] shapes = new rectangle[2];
        shapes[0] = new rectangle(10 , 15);
        shapes[1] = new square(10);
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].area();
            shapes[i].perimeter();
            }


    }

}