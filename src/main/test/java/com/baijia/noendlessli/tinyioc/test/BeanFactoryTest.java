package com.baijia.noendlessli.tinyioc.test;

import com.baijia.noendlessli.tinyioc.BeanDefinition;
import com.baijia.noendlessli.tinyioc.BeanFactory;
import org.junit.Test;

/**
 * Created by douxinchun on 16/9/22.
 *
 */

public class BeanFactoryTest {

    @Test
    public void test() {

        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new BeanDemo());

        beanFactory.registerBeanDefinition("beanDemo", beanDefinition);

        BeanDemo beanDemo = (BeanDemo)beanFactory.getBean("beanDemo");

        beanDemo.print();
    }
}
