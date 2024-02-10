package Graph;

import java.util.*;


public class Questions_graph1 {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info {
        int depth;
        Node node;

        public Info(Node node, int depth) {
            this.depth = depth;
            this.node = node;
        }
    }

    public static int minDepth(Node root) {

        if (root == null) {
            return 0;
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 1));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            Node node = curr.node;
            int depth = curr.depth;

            if (node.left == null && node.right == null) {
                return depth;
            }

            if (node.left != null) {
                q.add(new Info(node.left, depth + 1));
            }

            if (node.right != null) {
                q.add(new Info(node.right, depth + 1));
            }
        }
        return 0;
    }

    // public static int minDepth(Node root) {
    // if (root == null)
    // return 0;

    // int depth = 1;
    // Queue<Node> q = new LinkedList<Node>();
    // q.offer(root);

    // // Level order traversal
    // while (!q.isEmpty()) {
    // int size = q.size();
    // for (int i = 0; i < size; i++) {
    // Node node = q.poll();

    // // If a leaf node is found just return depth
    // if (node.left == null && node.right == null) {
    // return depth;
    // }
    // if (node.left != null) {
    // q.offer(node.left);
    // }
    // if (node.right != null) {
    // q.offer(node.right);
    // }
    // }
    // depth++;
    // }
    // return depth;
    // }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i] && isCycleUtil(graph, vis, i)) {
                return true;
            }
        }

        return false;

    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], boolean vis[], int start) {
        int parent[] = new int[graph.length];
        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();
        vis[start] = true;
        q.add(start);

        while (!q.isEmpty()) {

            int curr = q.remove();
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                if (!vis[e.dest]) {
                    vis[e.dest] = true;
                    q.add(e.dest);
                    parent[e.dest] = curr;

                } else if (parent[curr] != e.dest) {
                    return true;
                }

            }

        }
        return false;

    }

    public static int rottenTomato(int tomato[][]) {

        if (tomato.length == 0) {
            return 0;
        }

        int rows = tomato.length;
        int cols = tomato[0].length;
        int fresh_count = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (tomato[i][j] == 2) {
                    q.add(new int[] { i, j });
                } else if (tomato[i][j] == 1) {
                    fresh_count++;
                }
            }
        }

        int count = 0;
        int dirs[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!q.isEmpty()) {
            count++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr[] = q.remove();

                for (int d[] : dirs) {
                    int x = curr[0] + d[0];
                    int y = curr[1] + d[1];

                    if (x < 0 || y < 0 || x >= rows || y >= cols || tomato[x][y] == 2 || tomato[x][y] == 0) {
                        continue;
                    }

                    tomato[x][y] = 2;
                    q.add(new int[] { x, y });
                    fresh_count--;
                }
            }
        }
        return fresh_count == 0 ? count - 1 : -1;
    }

    static int count = 0;

    public static boolean isSafe(int matrix[][], int rows, int cols, boolean vis[][]) {

        return ((rows >= 0) && (cols >= 0) && (rows < matrix.length) && (cols < matrix[0].length)
                && (matrix[rows][cols] == 1) && (!vis[rows][cols]));
    }

    public static void dfs(int matrix[][], int rows, int cols, boolean vis[][]) {

        int newRow[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int newCol[] = { -1, 0, 1, -1, 1, -1, 0, 1 };

        // int newRow[] = {0,0,-1,1};
        // int newCol[] = {-1,1,0,0};

        vis[rows][cols] = true;
        // to traverse all 8 sides of a elemnt
        for (int k = 0; k < 8; k++) {
            if (isSafe(matrix, rows + newRow[k], cols + newCol[k], vis)) {

                count++;

                dfs(matrix, rows + newRow[k], cols + newCol[k], vis);
            }
        }
    }

    public static int largest(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean vis[][] = new boolean[rows][cols];
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1 && !vis[i][j]) {
                    count = 1;
                    dfs(matrix, i, j, vis);
                    // maximum region
                    result = Math.max(count, result);
                    // System.out.println(result);
                }
            }
        }

        return result;
    }

    // int time;

    // public void dfs(int g[][] ,int i , int j){
    // if(i< 0 || j<0 || i>= g.length || j>= g[0].length || g[i][j] == 0 ){
    // return ;
    // }

    // g[i][j] = 0;
    // time++ ;

    // dfs(g , i+1 , j);
    // dfs(g, i-1, j);
    // dfs(g , i, j-1);
    // dfs(g , i, j+1);

    // }
    // public int maxAreaOfIsland(int[][] matrix) {

    // int result = 0;
    // for(int i = 0 ; i < matrix.length ; i++){
    // for(int j = 0 ; j < matrix[0].length; j++){

    // if(matrix[i][j] ==1){
    // time = 0;
    // dfs(matrix , i , j);
    // result = Math.max(result , time);
    // }
    // }
    // }
    // return result;
    // }

    static class Pair {
        String first;
        int second;

        public Pair(String first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        Set<String> st = new HashSet<>();
        int len = wordList.size();
        for (int i = 0; i < len; i++) {
            st.add(wordList.get(i));
        }

        st.remove(beginWord);
        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();

            if (word.equals(endWord)) {
                return steps;
            }

            for (int i = 0; i < word.length(); i++) {
                // word = hit
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    // ait , bit , cit , dit , ... zit
                    char replacedWordArr[] = word.toCharArray();
                    replacedWordArr[i] = ch;
                    String newWord = new String(replacedWordArr);

                    if (st.contains(newWord)) {
                        st.remove(newWord);
                        q.add(new Pair(newWord, steps + 1));
                    }
                }
            }
        }

        // System.out.println(st);
        return 0;

    }


   
    public static void main(String[] args) {
        // int V = 4;
        // ArrayList<Edge> graph[] = new ArrayList[V];
        // createGraph(graph);
        // System.out.println(isCycle(graph));

        // Node root = new Node(0);
        // root.left = new Node(1);
        // root.right = new Node(2);
        // root.left.left = new Node(3);
        // root.left.right = new Node(4);
        // root.right.left = new Node(5);

        // System.out.println(minDepth(root));

        // int tomato[][] = {{0,0,1},
        // {0,1,2},
        // {0,1,1}};
        // System.out.println(rottenTomato(tomato));

        int matrix[][] = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        // System.out.println(largest(matrix));


        // Word ladder 
        List<String> wordList = new ArrayList<>();
        // "hot","dot","dog","lot","log","cog"
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        // wordList.add("cog");

        String beginWord = "hit";
        String endWord = "cog";

        // System.out.println(wordList.size());
        System.out.println(ladderLength(beginWord, endWord, wordList));





    }
}
