import ajs.printutils.Color;
import ajs.printutils.PrettyPrintTree;

public class MultiNodeExample {
    public static void main(String[] args) {
        MultiNode<String> root = new MultiNode<>("auuauuu");
        root.addChildren(
                new MultiNode<>("duuuuda"),
                new MultiNode<>("rymcym\ncym").addChildren(
                        new MultiNode<>("liscie"),
                        new MultiNode<>("spadają"),
                        new MultiNode<>("kluczem").addChildren(
                                new MultiNode<>("twoja mama"),
                                new MultiNode<>("szybko jedzie")
                        )
                ),
                new MultiNode<>("jaki").addChildren(
                        new MultiNode<>("taki 7")
                )
                );

        PrettyPrintTree<MultiNode<String>> multiNodePrettyPrintTree = new PrettyPrintTree<>(
                MultiNode::getChildren,
                MultiNode::getValue
        );

//        multiNodePrettyPrintTree.setTrim(3);
        multiNodePrettyPrintTree.setMaxDepth(4);
//        multiNodePrettyPrintTree.setEscapeNewline(true);
        multiNodePrettyPrintTree.setColor(Color.YELLOW);

        multiNodePrettyPrintTree.display(root);
    }
}
