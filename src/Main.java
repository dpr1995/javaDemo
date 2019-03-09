import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
    public static Integer i2;

    public static void main(String[] args){

        i2=0;
        ThreadTest threadTest = new ThreadTest(i2);
        Thread a = new Thread(threadTest);
        Thread b = new Thread(threadTest);
        a.run();
        b.run();
        System.out.println(i2);

    }
}


