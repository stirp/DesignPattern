package me.shrp.composite;

/**
 * Description
 * Created by lynxs on 2018/1/15.
 */
public class CompositeLeafNode extends CompositeNode{

    private String name;

    public CompositeLeafNode(String name){

        this.name = name;
    }

    @Override
    public void treeFuncA() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void treeFuncB() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void leafFuncC() {
        System.out.println(name + " leafFuncC");
    }

    @Override
    public void clientFunc() {
        leafFuncC();
    }

    @Override
    public String getName() {
        return name;
    }
}
