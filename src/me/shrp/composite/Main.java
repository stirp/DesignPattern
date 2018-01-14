package me.shrp.composite;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Composite Pattern violate Single Duty But Increase Client Transparency.
 * Created by lynxs on 2018/1/15.
 */
public class Main {
    public static void main(String[] args) {
        final Random random = new Random(47);

        final CompositeTreeNode root = new CompositeTreeNode("root");
        final Holder<CompositeTreeNode> lastTreeNode = new Holder<>(root);

        IntStream.range(1,10).forEach(i ->{
            if (random.nextInt() % 2 == 0 ) {
                final CompositeTreeNode compositeNode = new CompositeTreeNode(lastTreeNode.value.getName() + '.' + i);
                lastTreeNode.value.addNode(compositeNode);
                lastTreeNode.value = compositeNode;
            } else {
                final CompositeNode compositeNode = new CompositeLeafNode(lastTreeNode.value.getName() + '.' + i);
                lastTreeNode.value.addNode(compositeNode);
            }
        });

        root.clientFunc();
    }

    public static final class Holder<T> {

        /**
         * The value contained in the holder.
         */
        public T value;

        /**
         * Creates a new holder with a {@code null} value.
         */
        public Holder() {
        }

        /**
         * Create a new holder with the specified value.
         *
         * @param value The value to be stored in the holder.
         */
        public Holder(T value) {
            this.value = value;
        }
    }
}
