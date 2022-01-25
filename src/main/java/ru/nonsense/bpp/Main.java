package ru.nonsense.bpp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nonsense.bpp.configs.MyConfig;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        while (true) {
            Thread.sleep(1000);
            context.getBean(Quoter.class).sayQuoter();
        }
    }
}
