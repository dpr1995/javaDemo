public class FinalDemo {
    private final DemoUser demoUser = new DemoUser();

    public DemoUser getDemoUser() {
        return demoUser;
    }

    public void change(){
        demoUser.setName("dpr");
    }
}
