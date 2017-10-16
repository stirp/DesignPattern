package me.shrp.facade;

/**
 * Description
 * Created by lynxs on 2017/10/17.
 */
public class Main {
    public static void main(String[] args) {
        final ABFacade abFacade = new ABFacade(new ClassA(), new ClassB());
        System.out.println(abFacade.firstFunction());
        System.out.println(abFacade.secondFunction());
    }
}
