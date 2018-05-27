package consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ruin.dubbo.demo.DemoService;

public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(4L));
        demoService.sayHello("Ruin");
    }
}