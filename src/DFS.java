import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	public static void main(String args[]) {
		Graph graph = new Graph(4);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);

		graph.DFS(2);
	}
}

class Graph {
	private int N;
	private LinkedList<Integer> adj[];

	Graph(int N) {
		this.N = N;
		adj = new LinkedList[N];
		for (int i = 0; i < N; i++)
			adj[i] = new LinkedList();
	}

	void addEdge(int a, int b) {
		adj[a].add(b);
	}

	void DFSUtil(int a, boolean visited[]) {
		visited[a] = true;
		System.out.print(a + "->");

		Iterator<Integer> i = adj[a].listIterator();
		while (i.hasNext()) {
			int b = i.next();
			if (!visited[b])
				DFSUtil(b, visited);
		}
	}

	void DFS(int a) {
		boolean visited[] = new boolean[N];

		DFSUtil(a, visited);
	}

}
