# Dictionary_DATA-STRUCTURE

class Node:
    key
    value
    left_child
    right_child

class Dictionary:
    root

    method put(key, value):
        root = put_helper(root, key, value)

    method put_helper(node, key, value):
        if node is null:
            create a new node with key and value
            return the new node
        if key < node.key:
            node.left_child = put_helper(node.left_child, key, value)
        else if key > node.key:
            node.right_child = put_helper(node.right_child, key, value)
        else:
            node.value = value
        return node

    method get(key):
        node = get_helper(root, key)
        if node is null:
            return null
        else:
            return node.value

    method get_helper(node, key):
        if node is null:
            return null
        if key < node.key:
            return get_helper(node.left_child, key)
        else if key > node.key:
            return get_helper(node.right_child, key)
        else:
            return node

    method print():
        print_inorder(root)

    method print_inorder(node):
        if node is not null:
            print_inorder(node.left_child)
            print node.key + " -> " + node.value
            print_inorder(node.right_child)
