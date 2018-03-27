package me.shrp.proxy.virtual;

import me.shrp.proxy.ProxiedBean;
import me.shrp.proxy.ProxiedInterface;

import java.util.concurrent.TimeUnit;

/**
 * Description
 * Created by lynxs on 2018/3/12.
 */
public class VirtualProxy implements ProxiedInterface{

    private ProxiedBean bean;

    public VirtualProxy(ProxiedBean bean){
        final VirtualProxy proxy = this;
        new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                proxy.bean = bean;
            }
        }.start();
    }

    @Override
    public String getName() {
        if (bean == null) {
            return "not loaded!";
        }
        return bean.getName();
    }

    @Override
    public void setName(final String name) {
        if (bean == null){
            throw new IllegalStateException("bean not loaded!");
        }
        bean.setName(name);
    }
}
