# Python3 program to print DFS traversal
# from a given given graph
from collections import defaultdict


# This class represents a directed graph using
# adjacency list representation
class Graph:

    # Constructor
    def __init__(self):

        # default dictionary to store graph
        self.graph = defaultdict(list)

        # function to add an edge to graph

    def addEdge(self, u, v):
        self.graph[u].append(v)

        # A function used by DFS

    def DFSUtil(self, v, visited):

        # Mark the current node as visited
        # and print it
        visited[v] = True
        print(v, end=' ')
        #print(self.graph[v])

        # Recur for all the vertices
        # adjacent to this vertex
        for i in self.graph[v]:
            if visited[i] == False:
                self.DFSUtil(i, visited)

                # The function to do DFS traversal. It uses

    # recursive DFSUtil()
    def DFS(self, v):

        # Mark all the vertices as not visited
        visited = [False] * (len(self.graph))

        # Call the recursive helper function
        # to print DFS traversal
        self.DFSUtil(v, visited)

    # Driver code
g = Graph()
dic = {}
dicValues = {}
dicKeys = {}
index = 0
indexOfValuesDic = 0
sondanIndexOfEdge = 3
sondanIndexOfCost = -3

file = open("graph.txt", "r")
line = file.readline()
while line:
    vertex = str(line[0])
    dicKeys[vertex] = index
    print(vertex)
    while line[sondanIndexOfCost]:
        try:
            edge = str(line[sondanIndexOfEdge])
            dicValues[edge] = indexOfValuesDic
            costOfEdge = int(line[sondanIndexOfCost])
            if costOfEdge > 0:
                g.addEdge(index, dicValues[edge])
                print(costOfEdge)
            indexOfValuesDic += 1
        except:
            index += 1
            break
        sondanIndexOfEdge += 5
        sondanIndexOfCost -= 5
    indexOfValuesDic = 0
    sondanIndexOfEdge = 3
    sondanIndexOfCost = -3
    line = file.readline()
file.close()
print(dicValues)
g.DFS(dicKeys["A"])
# Create a graph given
# in the above diagram
