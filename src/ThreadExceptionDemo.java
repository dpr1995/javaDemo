public class ThreadExceptionDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadM());
        t.setUncaughtExceptionHandler(new ThreadException());
        t.start();
    }

    public static class ThreadM implements Runnable{
        @Override
        public void run() {
            while (true){
                System.out.println("线程执行了一次");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                throw new RuntimeException();
            }
        }
    }
}

