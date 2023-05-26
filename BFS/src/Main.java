import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


    }

    private int V;
    private LinkedList<Integer>[] adj;

    void BFS(int s, boolean[] visited) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
