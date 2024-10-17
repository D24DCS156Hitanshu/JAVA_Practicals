import java.util.Random;

public class p34 {

    public static void main(String[] args) throws InterruptedException {
        
        
        for (int i = 0; i < 100; i++) {

            Task1 t1 = new Task1();
              
            t1.start();
            t1.join();  // Waits for the current thread to be executed.

            if(t1.randomNumber % 2 == 0)
            {
                new Task2(t1.randomNumber).start();
            }
            else
            {
                new Task3(t1.randomNumber).start();
            }

            
        }
        
    }

}

class Task1 extends Thread
{
    int randomNumber;

    public void run()
    {
        randomNumber = new Random().nextInt(1,10);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Task2 extends Thread
{
    int number;

    Task2(int number)
    {
        this.number = number;
    }

    public void run()
    {
        System.out.println(number * number);
    }
}

class Task3 extends Thread
{
    int number;

    Task3(int number)
    {
        this.number = number;
    }

    public void run()
    {
        System.out.println(number * number * number);
    }
}