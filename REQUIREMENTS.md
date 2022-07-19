# BFS
## Shortest Reach in a Graph

### Algorithmic Description

### Deliverable

Graph class with the necessary methods to return a list of distances.

### Input Description Format

The first line contains an integer, <em>q</em>, the number of queries.

Each of the following <em>q</em> sets of lines is as follows:<br>
(1) The first line contains two space seperated integers, <em>n</em> and <em>m</em>,
number of nodes and the number of edges, respectfully.<br>
(2) Each of the next <em>m</em> lines contains two space-seperated integers, <em>u</em> and <em>v</em>,
describing an edge connecting node <em>u</em> to node <em>v</em>.<br>
(3)The last line contains a single integer, <em>s</em>, the index of the starting node.<br>

### Constraints
<li>
<item><em>q</em> is an integer between one and ten, inclusive.</item>
<item><em>n</em> is an integer between two and 1 thousand, inclusive.</item>
<item><em>m</em> is GEQ to one, but LEQ to <em>n(n-1)/2</em></item>
<item><em>u, v, s</em> are GEQ to 1, but LEQ to <em>n</em></item>
</li>

### Output Format

For each of the <em>q</em> queries, print a single line of <em>n-1</em> space seperated integers denoting the 
shortest distances to each of the <em>n-1</em> other nodes from the starting position, <em>s</em>. These distances 
should be listed sequentially by node number but should not include node <em>s</em>. If a given node is unreachable 
from <em>s</em>, set the distance to -1. 
