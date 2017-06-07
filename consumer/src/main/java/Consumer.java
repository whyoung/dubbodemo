import com.ProviderService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    @Test
    public void dubboTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        context.start();
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        System.out.println(providerService.sayHello("world"));

    }
}
