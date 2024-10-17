class degree{
    public void getdegree(){
        System.out.println("I got degree");
    }
}
class undergrad extends degree{
    public void dis(){
        System.out.println("I am an undergrad");
    }
}
class postgrad extends degree{
    public void dis(){
        System.out.println("I am a postgrad");
    }
}

public class p21 {
    public static void main(String[] args) {
        degree a = new degree();
        undergrad b = new undergrad();
        postgrad c = new postgrad();
        a.getdegree();
        b.dis();
        c.dis();
    }
}
