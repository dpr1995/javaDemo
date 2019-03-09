import java.util.Date;

public class DanLi3 {
    //volatile 关键字修饰保证date只要发生了变化会立即刷新
    private static volatile Date date = null;
    private DanLi3(){}

    public Date getDate(){
        if (date==null){
            synchronized (date){
                //判断之前先获得date为锁 再重新进行一次null判断
                // 由于date有volatile修饰 所以就算是多个线程在这里竞争 也不会出现重复实例化的情况
                if (date==null){
                    date = new Date();
                }
            }
        }
        return date;
    }

}
