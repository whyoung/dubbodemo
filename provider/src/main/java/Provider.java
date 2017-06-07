import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(new String[]
                {"applicationContext.xml"});
        context.start();
        //阻塞线程
        System.in.read();
    }
}