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
dic = {}
dicValues = {}
dicKeys = {}
index = 12
sondanIndex = -3
diziValues = []
diziKeys = []

file = open("graph.txt","r")
line = file.readline()
while line:

    #values = line.split(":",1)

    #dic[values[0]] = values[1]
    #print(line[-3])
    print(sondanIndex)

    while line[sondanIndex]:
        print(line[sondanIndex])
        try:
            diziValues.append(int(line[sondanIndex]))
        except:
            diziKeys.append(str(line[sondanIndex]))
            break
        sondanIndex -= 5
    sondanIndex = -3
    line = file.readline()

    #Keys = str(dic.keys())
    #print(Keys[index])
    #keyOfKeys = Keys.split(":")
    #dicKeys[keyOfKeys[0]] = keyOfKeys[1]

    #Values = str(dic.values())
    #Values.replace('}', '", "')
    #Values.rstrip()
    #print(Values[14:-6])

    #index += 6
file.close()

print(diziKeys)
print(diziValues)
# Create a graph given
# in the above diagram
g = Graph()
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 2)
g.addEdge(2, 0)
g.addEdge(2, 3)
g.addEdge(3, 3)

print("Following is DFS from (starting from vertex 2)")
g.DFS(2)