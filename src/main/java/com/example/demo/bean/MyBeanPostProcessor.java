package com.example.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**初始化对象前后执行
 * @author qinyl
 * @Description
 * @Date: 2018-08-30 10:14
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor() {
        super();
        System.out.println("这是BeanPostProcessor实现类构造器！！");
    }



    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！" 
            + "bean:" + bean + " beanName:" + beanName);
        return bean;
    }

    //postProcessAfterInitialization

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改" 
        		+ "bean:" + bean + " beanName:" + beanName);

        return bean;
    }
}
