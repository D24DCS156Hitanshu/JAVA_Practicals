import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter the distance in meters");
        float distance = sc.nextFloat();

        
        System.out.println("Enter the hours");
        float hr = sc.nextFloat();
        
        System.out.println("Enter the mins");
        float min = sc.nextFloat();
        
        System.out.println("Enter the sec");
        float sec = sc.nextFloat();
        
        hr=hr*3600;
        min=min*60;
        
        float time=hr+min+sec;
        
        System.out.println("Speed ="+distance/time+" m/s");
        
         float dis3 = distance/1000;
        float t3=(time/3600);
        
        System.out.println("Speed="+dis3/t3+" km/hr");
        
        
        float dis2 = distance/1609;
        float t2=(time/3600);
        
        System.out.println("Speed="+dis2/t2+" miles/hr");
    }
}