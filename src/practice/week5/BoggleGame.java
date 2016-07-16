package practice.week5;


public class BoggleGame{
	boolean solution(char [][] map, String target) {
		if (map == null || map.length == 0 ) {
			return false;
		}
		
		boolean [][] visited= new boolean[map.length][map[0].length];
		
		boolean result = false;
		for (int  i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == target.charAt(0)) {
					result = helper(map, target, i, j, 1, visited);
				}
			}
		}
		return result;
	}
	
	boolean helper(char [][] map, String target, int i, int j, int targetIndex, boolean[][] visited) {

		if (targetIndex == target.length()) {
			return true;
		}
		
		if (i != 0 && visited[i-1][j] != true && map[i-1][j] == target.charAt(targetIndex)) {
			visited[i-1][j] = true;
			if (helper(map, target, i - 1, j, targetIndex + 1, visited)) {
				return true;
			}
			visited[i-1][j] = false;

		}
		
		if (j != map[0].length - 1 && visited[i][j+1] != true && map[i][j+1] == target.charAt(targetIndex)) {
			visited[i][j+1] = true;
			if (helper(map, target, i, j + 1, targetIndex + 1, visited)) {
				return true;
			}
			visited[i][j+1] = false;

		}
		
		if (j != 0 && visited[i][j-1] != true && map[i][j-1] == target.charAt(targetIndex)) {
			visited[i][j-1] = true;
			if (helper(map, target, i, j - 1, targetIndex + 1, visited)) {
				return true;
			}
			visited[i][j-1] = false;
		}
		
		if (i != map.length - 1 && visited[i+1][j] != true && map[i+1][j] == target.charAt(targetIndex)) {
			visited[i+1][j] = true;
			if (helper(map, target, i + 1, j, targetIndex + 1, visited)) {
				return true;
			}
			visited[i+1][j] = false;
		}
		return false;
	}
	
	
	public static void main(String[] argv) {
		char[][] map= new char[][]{ {'A','B','C','D'}, {'D','E','F','G'}, {'F','I','H','I'}, {'J','K','L','M'}};
		BoggleGame obj = new BoggleGame();
		System.out.println(obj.solution(map, "ABEF"));
	}
}