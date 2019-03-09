import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MianShiTiDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        for (String str : list){
            System.out.println(str);
        }
        for (int a = 0 ; a<list.size();a++){
            System.out.println(list.get(a));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
