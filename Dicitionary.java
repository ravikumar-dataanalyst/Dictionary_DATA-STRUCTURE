class Dictionary {
    // Define the Node class to represent a node in the BST
    private static class Node {
        String key;      // key of the node
        String value;    // value associated with the key
        Node left, right;  // left and right subtrees of the node

        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;  // root of the BST

    // put() method to insert a new key-value pair into the BST
    public void put(String key, String value) {
        root = put(root, key, value);
    }

    // Helper method to recursively insert a new node into the BST
    private Node put(Node node, String key, String value) {
        // If the node is null, create a new node with the given key and value
        if (node == null) {
            return new Node(key, value);
        }

        // Compare the key with the current node's key to decide whether to go left or right
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key, value);  // go left if key is less than current node's key
        } else if (cmp > 0) {
            node.right = put(node.right, key, value);  // go right if key is greater than current node's key
        } else {
            node.value = value;  // update the value if the key already exists in the BST
        }
        return node;
    }

    // get() method to retrieve the value associated with a given key from the BST
    public String get(String key) {
        Node node = get(root, key);
        return node == null ? null : node.value;  // return the value associated with the key, or null if the key is not found
    }

    // Helper method to recursively search for a node with the given key in the BST
    private Node get(Node node, String key) {
        if (node == null) {
            return null;  // key not found
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);  // go left if key is less than current node's key
        } else if (cmp > 0) {
            return get(node.right, key);  // go right if key is greater than current node's key
        } else {
            return node;  // key found
        }
    }

    // print() method to print the contents of the BST in sorted order
    public void print() {
        System.out.println("Dictionary contents:");
        printInOrder(root);  // call the recursive helper method with the root node
    }

    // Recursive helper method to print the contents of the BST in sorted order
    private void printInOrder(Node node) {
        if (node != null) {  // if node is not null, recursively visits the left subtree, print the current node, and then visit the right subtree
            printInOrder(node.left);
            System.out.println(node.key + " -> " + node.value);
            printInOrder(node.right);
        }
    }
}