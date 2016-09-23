package com.baijia.noendlessli.tinyioc;

import lombok.Data;

import javax.xml.bind.annotation.XmlInlineBinaryData;

/**
 * Created by douxinchun on 16/9/22.
 *
 */

@Data
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private String beanClassName;

    public BeanDefinition() {}

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
