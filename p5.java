
class test12345 {
    public static void main(String[]args){
       int code[]={1,2,3,4,5};
       int price[]={10,20,30,40,60};
       double temp=0;
       int n=1;
       switch(n){
           case 1:
                temp=price[n-1]%8;
                System.out.println(price[n-1]+temp);
               break;
            case 2:
               temp=price[n-1]%12;
               System.out.println(price[n-1]+temp);
               break;
            case 3:
               temp=price[n-1]%5;
               System.out.println(price[n-1]+temp);
               break;
             
            case 4:
               temp=price[n-1]%7.5;
               System.out.println(price[n-1]+temp);
               break;
             case 5:
               temp=price[n-1]%3;
               System.out.println(price[n-1]+temp);
               break;
               
             default:
                System.out.println("not valid case");
                
                
       }
    }
}