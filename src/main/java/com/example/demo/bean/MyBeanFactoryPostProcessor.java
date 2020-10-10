package com.example.demo.bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**容器接口BootBeanFactoryPostProcessor，可以在这里修改bean的属性值
 * @author qinyl
 * @Description
 * @Date: 2018-08-30 10:17
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        System.out.println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
//        BeanDefinition bd = arg0.getBeanDefinition("person");
//        bd.getPropertyValues().addPropertyValue("phone", "110");
    }
}
