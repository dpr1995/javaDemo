import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FansheDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        DemoUser demoUser = new DemoUser();
        Class c = demoUser.getClass();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }

        Method setName = c.getDeclaredMethod("setName", String.class);
        setName.invoke(demoUser,"dpr");
        Method getName = c.getDeclaredMethod("getName",null);
        System.out.println(getName.invoke(demoUser,null));
        Field[] fields = c.getFields();
        System.out.println(fields.length);
        for (Field item : fields){
            System.out.println(item.get(demoUser));
        }
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.getName()+"   "+name.get(demoUser));
    }
}
