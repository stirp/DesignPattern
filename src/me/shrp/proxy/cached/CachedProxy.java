package me.shrp.proxy.cached;

import me.shrp.proxy.ProxiedBean;

/**
 * Description
 * Created by lynxs on 2018/1/30.
 */
public class CachedProxy extends ProxiedBean{

    private ProxiedBean proxied;

    public CachedProxy(ProxiedBean proxied) {
        this.proxied = proxied;
    }

    @Override
    public String getName() {
        return proxied.getName();
    }

    @Override
    public void setName(final String name) {
        proxied.setName(name);
    }
}
