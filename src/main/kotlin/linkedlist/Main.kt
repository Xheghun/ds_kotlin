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


        "inserting at a particular index" example {
            val list = LinkedList<Int>()
            list.push(3)
                .push(2)
                .push(1)

            println("Before inserting: $list")

            var middleNode = list.nodeAt(1)!!
            for (i in 1..3) {
                middleNode = list.insert(-1 * i, middleNode)
            }
            println("after inserting: $list")
        }

        "pop" example {
            val list = LinkedList<Int>()
            list.push(3)
                .push(2)
                .push(1)

            println("before popping list: $list")
            val poppedValue = list.pop()

            println("after popping list: $list")
            println("popped value $poppedValue")

        }

        "removing the last node" example {
            val list = LinkedList<Int>()

            list.push(3)
                .push(2)
                .push(1)

            println("before removing last node: $list")
            val removedValue = list.removeLast()

            println("after removing last node: $list")
            println("removed value: $removedValue")
        }

        "removing a node after a particular node " example {
            val list = LinkedList<Int>()

            list.push(3)
                .push(2)
                .push(1)

            println("before removing at particular index: $list")

            val index = 1
            val node = list.nodeAt(index - 1)!!

            val removedValue = list.removeAfter(node)

            println("after removing at index $index $list")
            println("removed value $removedValue")
        }
    }
}