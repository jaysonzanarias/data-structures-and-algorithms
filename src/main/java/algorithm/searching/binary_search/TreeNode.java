package algorithm.searching.binary_search;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isDeleted = false;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public Integer smallest() {
        if (leftChild == null) {
            return data;
        } else {
            return leftChild.smallest();
        }
    }

    public Integer largest() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.smallest();
        }
    }

    public void traverseInOrder() {
        if (this.leftChild != null) {
            this.leftChild.traverseInOrder();
        }
        System.out.print(this + " ");
        if (this.rightChild != null) {
            this.rightChild.traverseInOrder();
        }
    }

    public TreeNode find(Integer data) {
        if (this.data == data && !isDeleted) {
            return this;
        }

        if (data < this.data && leftChild != null) {
            return leftChild.find(data);
        }

        if (rightChild != null) {
            return rightChild.find(data);
        }

        return null;
    }

    public void insert(Integer data) {
        if (data >= this.data) {
            if (rightChild == null) {
                rightChild = new TreeNode(data);
            } else {
                rightChild.insert(data);
            }
        } else {
            if (leftChild == null) {
                leftChild = new TreeNode(data);
            } else {
                leftChild.insert(data);
            }
        }
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void delete() {
        isDeleted = true;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}
