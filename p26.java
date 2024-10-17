import java.io.*;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}


class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class p26 {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (CustomCheckedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            throwAnotherCheckedException();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        throwUncheckedException();
        throwAnotherUncheckedException();
    }


    public static void throwCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("This is a custom checked exception.");
    }

    
    public static void throwAnotherCheckedException() throws IOException {
        throw new IOException("This is a built-in checked exception.");
    }

    
    public static void throwUncheckedException() {
        throw new CustomUncheckedException("This is a custom unchecked exception.");
    }

    
    public static void throwAnotherUncheckedException() {
        throw new NullPointerException("This is a built-in unchecked exception.");
    }
}