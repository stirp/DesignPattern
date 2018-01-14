package me.shrp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * Created by lynxs on 2018/1/15.
 */
public class CompositeTreeNode extends CompositeNode{
    List<CompositeNode> nodes = new ArrayList<>(10);
    private String name;

    public void addNode(CompositeNode node){
        nodes.add(node);
    }

    public CompositeTreeNode(String name){
        super();
        this.name = name;
    }

    @Override
    public void treeFuncA() {
        System.out.println(name + " tree node Func A");
    }

    @Override
    public void treeFuncB() {
        System.out.println( name + " tree node Func B");
    }

    @Override
    public void leafFuncC() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clientFunc() {
        treeFuncA();
        treeFuncB();
        for (final CompositeNode node : nodes) {
            node.clientFunc();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
