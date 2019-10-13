# Python3 program to print DFS traversal
# from a given given graph
from collections import defaultdict
import sys


# This class represents a directed graph using
# adjacency list representation
class GraphDepthFirstSearch:

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

    # This class represents a directed graph
    # using adjacency list representation


class GraphBreathFirstSearch:

        # Constructor
        def __init__(self):

            # default dictionary to store graph
            self.graph = defaultdict(list)

            # function to add an edge to graph

        def addEdge(self, u, v):
            self.graph[u].append(v)

            # Function to print a BFS of graph

        def BFS(self, s):

            # Mark all the vertices as not visited
            visited = [False] * (len(self.graph))

            # Create a queue for BFS
            queue = []
            pathOfBFS = []

            # Mark the source node as
            # visited and enqueue it
            queue.append(s)
            visited[s] = True

            while queue:

                # Dequeue a vertex from
                # queue and print it
                s = queue.pop(0)
                #print(s, end=" ")
                pathOfBFS.append(s)

                # Get all adjacent vertices of the
                # dequeued vertex s. If a adjacent
                # has not been visited, then mark it
                # visited and enqueue it
                for i in self.graph[s]:
                    if visited[i] == False:
                        queue.append(i)
                        visited[i] = True
            return pathOfBFS

    # Driver code
graphDFS = GraphDepthFirstSearch()
graphBFS = GraphBreathFirstSearch()
dic = {}
dicValues = {}
dicKeys = {}
index = 0
indexOfValuesDic = 0
fromLastIndexOfEdge = -5
fromLastIndexOfCost = -3
fromFirstIndexOfCost = 3
fileName = sys.argv[1]
file = open(fileName, "r")
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
                graphDFS.addEdge(index, dicValues[edge])
                graphBFS.addEdge(index, dicValues[edge])
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

startState = input("Please enter the start state : ")
goalState = input("Please enter the goal state : ")
startState = startState.upper()
goalState = goalState.upper()
pathOfDFS = graphDFS.DFS(dicKeys[startState])
pathOfBFS = graphBFS.BFS(dicKeys[startState])
resultOfDFS = ""
resultOfBFS = ""

for iBFS in pathOfBFS:
    if startState == list(dicValues.keys())[list(dicValues.values()).index(iBFS)]:
        resultOfBFS = "BFS : " + list(dicValues.keys())[list(dicValues.values()).index(iBFS)] + ' - '
    elif goalState != list(dicValues.keys())[list(dicValues.values()).index(iBFS)]:
        resultOfBFS += list(dicValues.keys())[list(dicValues.values()).index(iBFS)] + ' - '
    else:
        resultOfBFS += list(dicValues.keys())[list(dicValues.values()).index(iBFS)]
        break

print(resultOfBFS)

for iDFS in pathOfDFS:
    if startState == list(dicValues.keys())[list(dicValues.values()).index(iDFS)]:
        resultOfDFS = "DFS : " + list(dicValues.keys())[list(dicValues.values()).index(iDFS)] + ' - '
    elif goalState != list(dicValues.keys())[list(dicValues.values()).index(iDFS)]:
        resultOfDFS += list(dicValues.keys())[list(dicValues.values()).index(iDFS)] + ' - '
    else:
        resultOfDFS += list(dicValues.keys())[list(dicValues.values()).index(iDFS)]
        break
print(resultOfDFS)