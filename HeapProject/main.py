import heapq

listOfName = []
file = open("data.txt", "r")
line = file.readline()
line = line.strip().split()

line = line.pop(0)
while line:
    listOfName.append(line)
    line = file.readline()
    line = line.strip().split()
    if len(line) != 0:
        line = line.pop(0)

print(listOfName)
heapq.heapify(listOfName)
print(listOfName)
heapq.heappush(listOfName, 'Banu')
print(listOfName)
heapq.heapify(listOfName)
print(listOfName)
heapq.heappush(listOfName, 'Ahmet')
print(listOfName)
