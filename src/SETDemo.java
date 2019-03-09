import java.util.HashSet;
import java.util.Set;

public class SETDemo {
    public static void main(String[] args) {
        User user1 = new User("dpr","123");
        User user2 = new User("dpr","123");
        Set<User> set = new HashSet<User>();
        set.add(user1);
        set.add(user2);
        for (User item : set){
            System.out.println(item.toString());
        }
    }
}
class User{
    String name;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    User(String name,String password){
        this.setName(name);
        this.setPassword(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
