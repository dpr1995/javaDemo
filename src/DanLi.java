import java.util.Date;

/**
 * 单例模式：懒汉模式 在需要的时候才会实例化对象
 */
public class DanLi {
    private DanLi(){};  //private 构造函数 防止外部实例化
    private static Date date;   //静态对象

    //实例化创建方法
    public Date getDate(){
        if (date==null){
            date = new Date();
        }
        return date;
    }
}
