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

    def DFSUtil(self, v, visited, path):

        # Mark the current node as visited
        # and print it
        visited[v] = True
        path.append(v)

        # Recur for all the vertices
        # adjacent to this vertex
        for i in self.graph[v]:
            if visited[i] == False:
                self.DFSUtil(i, visited, path)

                # The function to do DFS traversal. It uses

    # recursive DFSUtil()
    def DFS(self, v):

        # Mark all the vertices as not visited
        visited = [False] * (len(self.graph))
        path=[]
        # Call the recursive helper function
        # to print DFS traversal
        self.DFSUtil(v, visited,path)
        return path

    # Driver code
g = Graph()
dic = {}
dicValues = {}
dicKeys = {}
index = 0
indexOfValuesDic = 0
fromLastIndexOfEdge = -5
fromLastIndexOfCost = -3
fromFirstIndexOfCost = 3
file = open("graph.txt", "r")
line = file.readline()
while line:
    vertex = str(line[0])
    dicKeys[vertex] = index
    while line[fromLastIndexOfCost]:
        try:
            costOfEdge = int(line[fromLastIndexOfCost])
            edgeForDic = str(line[fromFirstIndexOfCost])
            if edgeForDic not in dicValues:
                dicValues[edgeForDic] = indexOfValuesDic
                indexOfValuesDic += 1
            if costOfEdge > 0:
                edge = str(line[fromLastIndexOfEdge])
                g.addEdge(index, dicValues[edge])
        except:
            index += 1
            break
        fromLastIndexOfEdge -= 5
        fromLastIndexOfCost -= 5
        fromFirstIndexOfCost += 5
    indexOfValuesDic = 0
    fromLastIndexOfEdge = -5
    fromLastIndexOfCost = -3
    fromFirstIndexOfCost = 3
    line = file.readline()
file.close()
counter = 0
pathOut = g.DFS(dicKeys["D"])
destination = "A"
beginning = "D"
result = ""
for i in pathOut:
    if beginning == list(dicValues.keys())[list(dicValues.values()).index(i)]:
        result = "DFS : " + list(dicValues.keys())[list(dicValues.values()).index(i)] + ' - '
    elif destination != list(dicValues.keys())[list(dicValues.values()).index(i)]:
        result += list(dicValues.keys())[list(dicValues.values()).index(i)] + ' - '
    else:
        result += list(dicValues.keys())[list(dicValues.values()).index(i)]
print(result)
