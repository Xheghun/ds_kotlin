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

    fun isEmpty(): Boolean = size == 0

    override fun toString(): String = if (isEmpty()) "Empty list" else head.toString()

}