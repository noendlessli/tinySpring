package com.baijia.noendlessli.tinyioc.exceptions;

/**
 * Created by douxinchun on 16/9/22.
 *
 */
public class BeanNotExistException extends RuntimeException {

    public BeanNotExistException(String msg) {
        super(msg);
    }
}
