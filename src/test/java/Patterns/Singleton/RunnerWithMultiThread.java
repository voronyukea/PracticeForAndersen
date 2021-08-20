package Patterns.Singleton;

public class RunnerWithMultiThread {
    public static void main(String[] args) {
        Thread firstTread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());

        firstTread.start();
        secondThread.start();

    }

    static class FirstThread implements Runnable{
        @Override
        public void run() {
        Preconditions firstRunSetup = Preconditions.getInstance("Firefox", true, false);
            System.out.println(firstRunSetup);
    }
    }

    static class SecondThread implements Runnable{
        @Override
        public void run() {
            Preconditions secondRunSetup = Preconditions.getInstance("Chrome", false, false);
            System.out.println(secondRunSetup);
        }
    }
}
