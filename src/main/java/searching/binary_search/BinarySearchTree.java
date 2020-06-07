package searching.binary_search;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(Integer data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public Integer smallest() {
        if (root != null) {
            return root.smallest();
        }
        return null;
    }

    public Integer largest() {
        if (root != null) {
            return root.largest();
        }
        return null;
    }

    public TreeNode find(Integer data) {
        if (root != null) {
            return root.find(data);
        }
        return null;
    }

    public void delete(Integer data) {
        TreeNode toDelete = find(data);
        toDelete.delete();
    }

    //    public void delete(Integer data) {
    //        TreeNode current = root;
    //        TreeNode parent = root;
    //        boolean isLeftChild = false;
    //
    //        if (current == null) {
    //            return;
    //        }
    //
    //        while (current != null && current.getData() != data) {
    //            parent = current;
    //
    //            if (data < current.getData()) {
    //                current = current.getLeftChild();
    //                isLeftChild = true;
    //            } else {
    //                current = current.getRightChild();
    //                isLeftChild = false;
    //            }
    //        }
    //
    //        if (current == null) {
    //            return;
    //        }
    //
    //        if (current.getLeftChild() == null && current.getRightChild() == null) {
    //            if (current == root) {
    //                root = null;
    //            } else {
    //                if (isLeftChild) {
    //                    parent.setLeftChild(null);
    //                } else {
    //                    parent.setRightChild(null);
    //                }
    //            }
    //        } else if (current.getRightChild() == null) {
    //            if (current == root) {
    //                root = current.getLeftChild();
    //            } else if (isLeftChild) {
    //                parent.setLeftChild(current.getLeftChild());
    //            } else {
    //                parent.setRightChild(current.getLeftChild());
    //            }
    //        } else if (current.getLeftChild() == null) {
    //            if (current == root) {
    //                root = current.getRightChild();
    //            } else if (isLeftChild) {
    //                parent.setLeftChild(current.getRightChild());
    //            } else {
    //                parent.setRightChild(current.getRightChild());
    //            }
    //        } else {
    //            TreeNode successor = getSuccessor(current);
    //            if (current == root) {
    //                root = successor;
    //            } else if (isLeftChild) {
    //                parent.setLeftChild(successor);
    //            } else {
    //                parent.setRightChild(successor);
    //            }
    //            successor.setLeftChild(current.getLeftChild());
    //        }
    //    }
    //
    //    private TreeNode getSuccessor(TreeNode node) {
    //        TreeNode parentOfSuccessor = node;
    //        TreeNode successor = node;
    //        TreeNode current = node.getRightChild();
    //        while (current != null) {
    //            parentOfSuccessor = successor;
    //            successor = current;
    //            current = current.getLeftChild();
    //        }
    //        if (successor != node.getRightChild()) {
    //            parentOfSuccessor.setLeftChild(successor.getRightChild());
    //            successor.setRightChild(node.getRightChild());
    //        }
    //        return successor;
    //    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
        System.out.println();
    }
}
