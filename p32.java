public class p32 {
    public static void main(String[] args) {
        thr t=new thr();

        runna r=new runna();
        r.start();
        t.run();
    }
}

class thr implements Runnable{
    @Override
    public void run() {
        System.out.println("hello world");
    }
}

class runna extends Thread{
    @Override
    public void start() {
        System.out.println("hello world2");
    }
}