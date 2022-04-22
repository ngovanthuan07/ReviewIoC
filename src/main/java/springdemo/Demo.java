package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld h = (HelloWorld) context.getBean("hello");
        h.hello();

        HelloWorld h2 = (HelloWorld) context.getBean("hello2");
        h2.hello();
    }
}
