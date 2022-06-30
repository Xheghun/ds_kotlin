package linkedlist

class Node<T : Any>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        // hello world
        return if (next != null)
            "$value -> ${next.toString()}"
        else "$value"
    }
}