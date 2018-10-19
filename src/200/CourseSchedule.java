public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //construct graph matrix
        int[][] matGraph = new int[numCourses][numCourses];
        for (int i = 0; i< prerequisites.length; i++) {
            matGraph[prerequisites[i][0]][prerequisites[i][1]] = 1;
        }
        int[] visited = new int[numCourses]; //0 / 1 / 2: not visited / visiting / visited
        //detect cycle in each connected component
        for (int node = 0; node < numCourses; node++) {
            if (visited[node] == 0){
                if (DFS(node, matGraph, visited)) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    
    public boolean DFS(int node, int[][] matGraph, int[] visited) {
        visited[node] = 1; //1: visiting
        for (int otherNode = 0; otherNode < matGraph.length; otherNode++) {
            if (matGraph[node][otherNode] == 1) {
                if (visited[otherNode] == 1) {
                    //cycle
                    return false;
                }
                if (visited[otherNode] == 0 && !DFS(otherNode, matGraph, visited)) {
                    return false;
                }
            }
        }
        visited[node] = 2; //2: visit done
        return true;
    }
}
