import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo {
    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(0);
        Object lock = new Object();
        Thread t1 = new Thread(new Demo(num,"1",lock));
        Thread t2 = new Thread(new Demo(num,"2",lock));
        t1.start();
        t2.start();
        System.out.println(num);
    }
}

class Demo implements Runnable{
    private AtomicInteger num;
    private String string;
    private Object lock;

    Demo(AtomicInteger integer,String s,Object o){
        System.out.println("create!!");
        this.num = integer;
        this.string = s;
        this.lock = o;
    }
    public void setObject(Object o){
        this.lock = o;
    }

    @Override
    public void run() {
        for (int a = 0;a<100;a++){
            synchronized (lock){
                num.addAndGet(1);
                System.out.println(string+" 操作 结果为 "+num);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
