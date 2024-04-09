package binary_tree

class BinaryTreeMain2 {
    class Node(data: Int) {
        var data = data;
        var left: Node? = null
        var right: Node? = null
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val root = Node(1)
            root.left = Node(2)
            root.right = Node(3)
            root.left?.left = Node(4)
            root.left?.right = Node(5)
            root.right?.left = Node(6)
            root.right?.right = Node(7)

            println("In-order traversal:")
            inOrderTraversal(root)
        }

        fun inOrderTraversal(node: Node?) {
            if (node != null) {
                inOrderTraversal(node.left)
                println(node.data)
                inOrderTraversal(node.right)
            }
        }
    }
}
