class Node:
    def __init__(self, id, data):
        self.id = id
        self.data = data
        self.next = None

    def traverse(self):
        node = self
        while node != None:
            print(node.data)
            node = node.next

node1 = Node("a", 2)
node2 = Node("b", 3)
node3 = Node("c", 4)

node1.next = node2
node2.next = node3
node1.traverse()