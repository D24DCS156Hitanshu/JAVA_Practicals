
import java.util.Arrays;

class p10 {

    public static void main(String[] args) {
        String a = "aed";
        int i ;
        System.out.println("Og :"+ a);
        System.out.println("Length: "+ a.length());
        System.out.println("Lowercase :"+ a.toLowerCase());
        System.out.println("Uppercase: " + a.toUpperCase());
        char[] charArr = a.toCharArray();
        System.out.print("Reversed: ");
        for (i=a.length() -1; i>=0; i--) {

            System.out.print(charArr[i]);
            
        }
        System.out.println("\n");
        Arrays.sort(charArr);
         String sorted = new  String(charArr);
         System.out.println("Sorted : "+sorted);
        
        
    }
}