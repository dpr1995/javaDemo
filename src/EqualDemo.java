public class EqualDemo {
    public static void main(String[] args) {
        String a = "dpr";
        String b = "dpr";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String c = new String("dpr");
        String d = new String("dpr");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        String j = a+b;
        String k = a+c;
        System.out.println(j==k);
    }
}
