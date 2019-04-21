package hello;

import org.springframework.stereotype.Component;

//@Component
public class MessageService {
    public MessageService() {
        super();
        System.out.println("messageservice...");
    }

    /**
     * 打印服务
     * @return
     */
    public String getMessage(){
        return "hello world";
    }
}
