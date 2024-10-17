
class shape{
    public void sh()
    {
        System.out.println("this is shape");
    }
}
class rec extends shape{
    public void dis(){
        System.out.println("this is rectangle");
    }
}
class circ extends shape{
    public void dis1(){
        System.out.println("this is circle");
    }
}
class sq extends rec{
    public void dis2(){
        System.out.println("this is square from rectangle");
    }
}
public class p20 {
    public static void main(String[] args) {
        shape s = new shape();
        rec r = new rec();
        circ c = new circ();
        sq saq = new sq();
        s.sh();
        r.dis();
        c.dis1();
        saq.dis2();
    }

    
}
