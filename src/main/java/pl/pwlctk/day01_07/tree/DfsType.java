package pl.pwlctk.day01_07.tree;

enum DfsType {
    PRE_ORDER {
        @Override
        public void showTree(Node node) {
            if (node != null) {
                visit(node);
                showTree(node.getLeftChild());
                showTree(node.getRightChild());
            }
        }
    },

    IN_ORDER {
        @Override
        public void showTree(Node node) {
            if (node != null) {
                showTree(node.getLeftChild());
                visit(node);
                showTree(node.getRightChild());
            }
        }
    },

    POST_ORDER {
        @Override
        public void showTree(Node node) {
            if (node != null) {
                showTree(node.getLeftChild());
                showTree(node.getRightChild());
                visit(node);
            }
        }
    };

    private static void visit(Node node) {
        System.out.print(node.getValue() + " ");
    }

    public abstract void showTree(Node node);
}
