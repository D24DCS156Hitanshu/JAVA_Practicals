import java.util.Scanner;

class area{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length");
        int l=input.nextInt();
        System.out.println("Enter the breadth ");
        int b=input.nextInt();

        area a1=new area(l,b);
        System.out.println(a1.returnarea(a1.length,a1.breath));

    }

    int length,breath;

    public area(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }


    int returnarea(int l,int b){
        return  l*b;

    }
}