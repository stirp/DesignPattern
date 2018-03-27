package me.shrp.proxy;

import me.shrp.proxy.cached.CachedProxy;
import me.shrp.proxy.protect.ProtectProxy;
import me.shrp.proxy.virtual.VirtualProxy;

import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

/**
 * Description
 * Created by lynxs on 2018/3/12.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Protect Proxy");
        final ProxiedBean proxiedBean = new ProxiedBean();
        proxiedBean.setName("test");
        final ProxiedInterface protetProxy = (ProxiedInterface) Proxy.newProxyInstance(ProxiedBean.class.getClassLoader(), ProxiedBean.class.getInterfaces(), new ProtectProxy(proxiedBean));
        System.out.println(protetProxy.getName());
        try {
            protetProxy.setName("test123");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(protetProxy.getName());
        System.out.println("Virtual Proxy");
        final VirtualProxy virtualProxy = new VirtualProxy(proxiedBean);
        System.out.println(virtualProxy.getName());
        TimeUnit.SECONDS.sleep(3);
        System.out.println(virtualProxy.getName());
        System.out.println("Cache Proxy");
        final CachedProxy cachedProxy = new CachedProxy(proxiedBean);
        System.out.println(cachedProxy.getName());
    }
}
