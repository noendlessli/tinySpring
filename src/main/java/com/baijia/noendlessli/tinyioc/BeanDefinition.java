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

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
}
