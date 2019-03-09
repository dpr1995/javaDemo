import java.util.Date;

/**
 * 单例模式 饿汉模式 在程序初始化的时候就加载实例对象
 */
public class DanLi2 {
    private DanLi2(){};
    //final 修饰 只能赋值一次
    private static final Date date = new Date();

    public Date getDate(){
        return date;
    }
}
