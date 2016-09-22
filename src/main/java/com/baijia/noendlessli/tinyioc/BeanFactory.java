package com.baijia.noendlessli.tinyioc;

import com.baijia.noendlessli.tinyioc.exceptions.BeanNotExistException;
import com.baijia.noendlessli.tinyioc.exceptions.BeanNotFundException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by douxinchun on 16/9/22.
 *
 */


public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name) throws BeanNotFundException {

        if (beanDefinitionMap != null && beanDefinitionMap.size() != 0) {
            if (beanDefinitionMap.get(name) != null) {
                return beanDefinitionMap.get(name).getBean();
            }
        }
        throw new BeanNotFundException("have not find bean by name:" + name);
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {

        if (beanDefinitionMap.get(name) != null) {
            throw new BeanNotExistException("bean has register, name:" + name);
        }

        beanDefinitionMap.put(name, beanDefinition);
    }
}
