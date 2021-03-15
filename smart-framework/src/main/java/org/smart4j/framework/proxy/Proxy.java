package org.smart4j.framework.proxy;

/**
 * @ClassName: Proxy
 * @Description: 代理接口
 * @Author: zsk
 * @Date: 2021/3/14 20:11
 * @Version: v1.0
 */
public interface Proxy {
    /**
     * 执行链式代理
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
