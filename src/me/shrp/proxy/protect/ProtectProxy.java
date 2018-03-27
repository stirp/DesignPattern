package me.shrp.proxy.protect;

import me.shrp.proxy.ProxiedInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description
 * Created by lynxs on 2018/3/12.
 */
public class ProtectProxy implements InvocationHandler{

    private final ProxiedInterface proxied;

    public ProtectProxy(ProxiedInterface proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        if (method.getName().contains("set")){
            throw new IllegalAccessException("forbid " + method.getName());
        }
        return method.invoke(proxied,args);
    }
}
