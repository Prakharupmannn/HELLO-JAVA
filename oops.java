// class Pen {
//     String color;
//     String type;

//     public void write() {
//         System.out.println("write something");
//     }
//     public void color() {
//         System.out.println(this.color);
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";

//         Pen pen2 = new Pen();
//         pen2.color = "black";
//         pen2.type = "ballpen";

//         pen1.color();
//         pen2.color();
//     }
// }


class Shape {  // inheritance example 
    //String color;
    public void area() { //////base class
        System.out.println("display areaa");
    }
}
class triangle extends Shape {
    public void area(int l, int h) {////derived class
        System.out.println(1/2*l*h);
    }
}
class EquilateralTiangle extends triangle {  ////derived class
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape {   ////hierarchial inheritance
    public void area(int r) {   ///derived class (linked with shape class)
        System.out.println(3.14*r*r);
    }
}
public class oops {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        //t1.color = "blue";
    }
}
