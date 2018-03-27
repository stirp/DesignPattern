package me.shrp.proxy;

/**
 * Description
 * Created by lynxs on 2018/1/30.
 */
public class ProxiedBean implements ProxiedInterface{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }
}
