import heapq


class Node:
    def __init__(self, value=None):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self):
        self.value = None


listOfName = []
fileForHeap = open("data.txt", "r")
lineForHeap = fileForHeap.readline()
lineForHeap = lineForHeap.strip().split()

lineForHeap = lineForHeap.pop(0)
while lineForHeap:
    listOfName.append(lineForHeap)
    lineForHeap = fileForHeap.readline()
    lineForHeap = lineForHeap.strip().split()
    if len(lineForHeap) != 0:
        lineForHeap = lineForHeap.pop(0)

print(listOfName)
heapq.heapify(listOfName)
print(listOfName)
heapq.heappush(listOfName, 'Banu')
print(listOfName)
heapq.heapify(listOfName)
print(listOfName)
heapq.heappush(listOfName, 'Ahmet')
print(listOfName)

fileForLinkedList = open("data.txt", "r")
lineForLList = fileForLinkedList.readline()
lineForLList = lineForLList.strip().split()
lineForLList = lineForLList.pop(0)

linkedList = LinkedList()
linkedList.value = Node(lineForLList)
lineForLList = fileForLinkedList.readline()
lineForLList = lineForLList.strip().split()
item = Node(lineForLList)
linkedList.value.next = item
while lineForLList:
    tempValue = item
    lineForLList = fileForLinkedList.readline()
    lineForLList = lineForLList.strip().split()
    if len(lineForLList) != 0:
        lineForLList = lineForLList.pop(0)
        item = Node(lineForLList)
        tempValue.next = item

print(linkedList.value)
