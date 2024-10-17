class CharDoubler {
    public static String doubleChar(String input) {
        StringBuilder doubledString = new StringBuilder();
        for (char c : input.toCharArray()) {
            doubledString.append(c).append(c);
        }
        return doubledString.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The")); 
        System.out.println(doubleChar("AAbb"));     
        System.out.println(doubleChar("Hi-There")); 
    }
}
