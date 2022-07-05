import ajs.printutils.PrettyPrintTree;

public class NodeExample {
    public static void main(String[] args) {

        Node<Integer> root = new Node<>(111);
        root.setLeft(new Node<>(222));
        root.setRight(new Node<>(333));

        root.getLeft().setLeft(new Node<>(444));
        root.getRight().setLeft(new Node<>(555));
        root.getRight().setRight(new Node<>(777));

        PrettyPrintTree<Node<Integer>> nodePrettyPrintTree = new PrettyPrintTree<Node<Integer>>(
                Node::getChildren,
                 n -> String.valueOf(n.getValue())
        );

        nodePrettyPrintTree.display(root);
    }
}
