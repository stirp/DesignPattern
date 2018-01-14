package me.shrp.composite;

/**
 * Description
 * Created by lynxs on 2018/1/15.
 */
public abstract class CompositeNode {
    /**
     * a function that only tree node can be invoke
     */
    public abstract void treeFuncA();

    /**
     * a function that only tree node can be invoke
     */
    public abstract void treeFuncB();
    /**
     * a function that only leaf node can be invoke
     */
    public abstract void leafFuncC();
    /**
     * a function that only tree node always invoked by client
     */
    public abstract void clientFunc();

    public abstract String getName();
}
