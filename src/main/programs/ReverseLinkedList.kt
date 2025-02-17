class ListNode(var data: Int) {
    var next: ListNode? = null
}

// Function to reverse a linked list
fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head
    while (current != null) {
        val next = current.next  // Store next node
        current.next = prev  // Reverse pointer
        prev = current  // Move prev to current
        current = next  // Move current to next
    }
    return prev  // New head of reversed list
}

// Function to print the linked list
fun printList(head: ListNode?) {
    var temp = head
    while (temp != null) {
        print("${temp.data}")
        temp = temp.next
    }
    //println("null")
}

// Java.Main function to test
fun main() {

    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)

    println("Original List:")
    printList(head)

    // Reversing the list
    val reversedHead = reverseList(head)

    println("Reversed List:")
    printList(reversedHead)
}