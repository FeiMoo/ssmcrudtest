package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan
public class ApplicationSpring {
    public static void main(String[] args){
        System.out.println("apllcationspring...");
        //初始化spring容器
//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        //xml配置形式初始化spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MessageService service = context.getBean(MessageService.class);
//        printer.setService(service);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
