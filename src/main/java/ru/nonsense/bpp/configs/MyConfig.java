package ru.nonsense.bpp.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.nonsense.bpp.AssignRandomIntAnnotationBeanPostProcessor;
import ru.nonsense.bpp.ProfilingHandlerBeanPostProcessor;
import ru.nonsense.bpp.Quoter;
import ru.nonsense.bpp.TerminateQuoterImpl;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;

@Configuration
public class MyConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Quoter terminateQuoterImpl(){
        return new TerminateQuoterImpl();
    }

    @Bean
    public AssignRandomIntAnnotationBeanPostProcessor assignRandomIntAnnotationBeanPostProcessor(){
        return new AssignRandomIntAnnotationBeanPostProcessor();
    }

    @Bean
    public ProfilingHandlerBeanPostProcessor profilingHandlerBeanPostProcessor() throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        return new ProfilingHandlerBeanPostProcessor();
    }
}
