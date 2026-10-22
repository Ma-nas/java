/**
 * Binary Search Tree (BST) implementation.
 * Supports insertion, key lookup, height calculation, and tree traversals.
 */
public class BinarySearchTree {

    public static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            this.key = item;
            left = right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node current, int key) {
        if (current == null) {
            return new Node(key);
        }
        if (key < current.key) {
            current.left = insertRec(current.left, key);
        } else if (key > current.key) {
            current.right = insertRec(current.right, key);
        }
        return current;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node current, int key) {
        if (current == null) return false;
        if (current.key == key) return true;
        return key < current.key ? searchRec(current.left, key) : searchRec(current.right, key);
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.key + " ");
            inOrderRec(node.right);
        }
    }

    public int height() {
        return calculateHeight(root);
    }

    private int calculateHeight(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int v : values) {
            tree.insert(v);
        }

        System.out.println("In-order traversal (sorted):");
        tree.inOrder();

        System.out.println("Search 40: " + tree.search(40));
        System.out.println("Search 99: " + tree.search(99));
        System.out.println("Tree height: " + tree.height());
    }
}