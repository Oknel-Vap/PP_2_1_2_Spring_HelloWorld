import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat firstCat = applicationContext.getBean(Cat.class);
        System.out.println(firstCat.getVoice());
        Cat secondCat = applicationContext.getBean(Cat.class);
        System.out.println(secondCat.getVoice());

        System.out.println(bean == bean2);
        System.out.println(firstCat == secondCat);
    }
}