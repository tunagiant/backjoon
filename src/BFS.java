import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	public static void main(String args[]) {
		Graph2 graph = new Graph2(4);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);

		graph.BFS(2);
	}
}

class Graph2 {
	private int N;
	private LinkedList<Integer> adj[];

	Graph2(int N) {
		this.N = N;
		adj = new LinkedList[N];
		for (int i = 0; i < N; i++)
			adj[i] = new LinkedList();
	}

	void addEdge(int a, int b) {
		adj[a].add(b);
	}

	void BFS(int a) {
		boolean visited[] = new boolean[N];

		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[a] = true;
		queue.add(a);

		while (queue.size() != 0) {
			a = queue.poll();
			System.out.print(a + "->");

			Iterator<Integer> i = adj[a].listIterator();
			while (i.hasNext()) {
				int b = i.next();
				if (!visited[b]) {
					visited[b] = true;
					queue.add(b);
				}
			}
		}

	}

}
