package linkedlist

class LinkedList<T : Any> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0


    fun push(value: T): LinkedList<T> = apply {
        head = Node(value = value, next = head)
        if (tail == null)
            tail = head
        size++
    }

    fun append(value: T): LinkedList<T> = apply {
        if (isEmpty()) {
            push(value)
        } else {
            val newNode = Node(value = value)

            tail!!.next = newNode
            tail = newNode
            size++
        }
    }

    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T> {
        if (tail == afterNode) {
            append(value)
            return tail!!
        }
        val newNode = Node(value, afterNode.next)

        afterNode.next = newNode
        size++
        return newNode
    }

    fun pop(): T?  {
        if (isEmpty()) return null

        val result = head?.value
        head = head?.next
        size--

        if (isEmpty()) {
            tail = null
        }
       return result
    }

    private fun isEmpty(): Boolean = size == 0

    override fun toString(): String = if (isEmpty()) "Empty list" else head.toString()

}