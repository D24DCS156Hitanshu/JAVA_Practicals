
class test123 {
    public static void main(String[]args){
        int[] arr = {20,40,60,80,100};
        int expense =0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            expense=expense+arr[i];
        }
        System.out.println("expense = "+expense);
    }
}