package linkedlist

fun main() {
    "Creating and linking nodes" example {
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3

        println(node1)


        "push" example {
            val list = LinkedList<Int>()

            list.push(3)
                .push(2)
                .push(1)

            println(list)
        }

        "append" example {
            val list = LinkedList<Int>()

            list.append(3)
                .append(2)
                .append(1)

            println(list)
        }
    }
}