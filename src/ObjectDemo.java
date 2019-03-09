import java.io.*;
import java.util.*;

public class ObjectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("G:\\demo\\a.txt"));
        DemoUser demo = new DemoUser();
        DemoUser demo1 = new DemoUser();
        List<DemoUser> list = new ArrayList<DemoUser>();
        demo.setName("dpr");
        demo1.setName("dpr1");
        demo.setPassWord("1995");
        list.add(demo);
        demo1.setPassWord("54646");
        list.add(demo1);
        os.writeObject(list);


        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("G:\\demo\\a.txt"));
        List<DemoUser> demoUser = (List<DemoUser>) oi.readObject();
        for (DemoUser item : demoUser){
            System.out.println(item.toString());
        }

        Collections.sort(list, new Comparator<DemoUser>() {
            @Override
            public int compare(DemoUser o1, DemoUser o2) {
                return o2.getPassWord().length()-o1.getPassWord().length();
            }
        });

        for (DemoUser item : list){
            System.out.println(item.toString());
        }

        os.close();
        oi.close();
    }
}
