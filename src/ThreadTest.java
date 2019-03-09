public class ThreadTest extends Thread{

    public ThreadTest(Integer i){
        setI(i);
    }

    private static Integer i = null;

    public void setI(Integer i) {
        this.i = i;
    }

    public void run(){

        i++;
        System.out.println(i);
    }
}
