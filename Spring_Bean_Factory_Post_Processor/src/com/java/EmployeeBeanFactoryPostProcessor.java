
package com.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class EmployeeBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {
        System.out.println("before intitialize  "+string);
        return o;  
    }

    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        System.out.println("after intitialize  "+string);
        return o;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory clbf) throws BeansException {
        System.out.println("Factory post processor");    
    }
    
}
