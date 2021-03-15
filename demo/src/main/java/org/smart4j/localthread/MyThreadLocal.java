package org.smart4j.localthread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MyThreadLocal
 * @Description: 自己实现ThreadLocal
 * @Author: zsk
 * @Date: 2021/3/14 21:52
 * @Version: v1.0
 */
public class MyThreadLocal<T> {

    private Map<Thread, T> container = Collections.synchronizedMap(new HashMap<Thread, T>());

    public void set(T value) {
        container.put(Thread.currentThread(), value);
    }

    public T get() {
        Thread thread = Thread.currentThread();
        T value = container.get(thread);
        if (value == null && !container.containsKey(thread)) {
            value = initialValue();
            container.put(thread, value);
        }
        return value;
    }
    public void remove() {
        container.remove(Thread.currentThread());
    }

    private T initialValue() {
        return null;
    }
}
