import java.util.ArrayList;

public class Node<E> {
    E element;
    Node<E> prev;
    Node<E> next;

    public Node(Node<E> prev, E element, Node<E> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public Node getFirstNode() {
        Node currentNode = this;
        while (currentNode.prev != null) {
            currentNode = currentNode.prev;
        }
        return currentNode;
    }

    /**
     * 从头节点开始输入整个链表,先找到头节点，当一个节点的prev为空的时候即为头节点
     **/
    public void showAll() {
        Node firstNode = this.getFirstNode();
        while (firstNode.getNext() != null) {
            System.out.println(firstNode.getElement());
            firstNode = firstNode.next;
        }
        System.out.println(firstNode.getElement());
    }


    /**
     * 在当前节点的后面插入一个新的节点，将要插入节点的prev指向当前节点，将要插入节点的next指向当前节点的next
     *
     * @param insertNode 要插入的值
     * @return 返回插入是否成功
     */
    public Node addAfter(Node insertNode) {
        if (this.next == null) {
            this.next = insertNode;
            insertNode.prev = this;
            insertNode.next = null;
            return this;
        }
        Node nextNode = this.next;
        this.next = insertNode;
        insertNode.prev = this;
        insertNode.next = nextNode;
        nextNode.prev = insertNode;
        return this;
    }

    public E getElement() {
        return this.element;
    }

    public Node getPrev() {
        return this.prev;
    }

    public Node getNext() {
        return this.next;
    }

    public static void main(String args[]) {
        Node node1 = new Node(null, "1", null);
        Node node2 = new Node(node1, "2", null);
        node1.next = node2;
        Node node3 = new Node(null, "3", null);
        node2.addAfter(node3);


    }
}