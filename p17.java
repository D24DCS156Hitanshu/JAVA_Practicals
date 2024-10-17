public class p17 {
    public void printParent() {
        System.out.println("This is parent class");
    }
}
 class Child extends p17 {
    public void printChild() {
        System.out.println("This is child class");
    }
}
 class Main {
    public static void main(String[] args) {
        p17 parentObj = new p17();

        Child childObj = new Child();

        parentObj.printParent();

        childObj.printParent();

        childObj.printChild();
    }
}