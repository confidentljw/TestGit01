/**
 * Created by Administrator on 2017/5/10.
 */
public class Navigates {
    private static Navigates ourInstance = new Navigates();

    public static Navigates getInstance() {
        return ourInstance;
    }

    private Navigates() {
        System.out.println("Navigate 导航");

    }
}
