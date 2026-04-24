class ThreadA extends Thread {
    public void run() {
        System.out.println("Thread A is running");
    }
}

class ThreadB extends Thread {
    public void run() {
        System.out.println("Thread B is running");
    }
}

public class MultithreadDemo {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();   // starts Thread A
        b.start();   // starts Thread B
    }
}