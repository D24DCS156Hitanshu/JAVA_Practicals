class test1234 {
    public static void main(String[]args){
        String[] arr = {"a","b","c"};
        String[] arr2 = {"d","e","f"};
        String[] books= new String[arr.length+arr2.length];
        int i;
        for(i=0;i<arr.length;i++)
        {
            books[i]=arr[i];
        }
        for(i=0;i<arr2.length;i++)
        {
            books[i+arr.length]=arr2[i];
        }
         for(i=0;i<books.length;i++)
         {
             System.out.println(books[i]);
         }
        
    }
}