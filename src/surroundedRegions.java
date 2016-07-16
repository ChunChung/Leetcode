import java.util.ArrayList;
import java.util.List;

public class surroundedRegions {
    static int m,n;
    static public char[][] solve(char[][] board) {
        m = board.length;
        if(m==0) return null;
        n = board[0].length;
        
        for(int i=0;i<m;++i) 
            for(int j=0;j<n;++j) {
                dfs(board, i, j);
            }
        return board;
    }
    
    static private boolean dfs(char[][] board, int i, int j) {
        if(board[i][j] == 'X') return true;
        if(i==0||j==0||i==m-1||j==n-1)
            return false; 
        boolean union = true;
        board[i][j]='X';
        if(i>0) union = union && dfs(board, i-1, j);
        if(i<m-1) union = union && dfs(board, i+1,j);
        if(j>0) union = union && dfs(board, i, j-1);
        if(j<n-1) union = union && dfs(board,i,j+1);
        
        return union;
    }

    static public void main(String argv[])
	{

    	//["OXXOX","XOOXO","XOXOX","OXOOO","XXOXO"]
    	char[][] q = {{'O','X','X','O'},{'X','O','O','X'},{'X','O','X','O'},{'O','X','O','O'},{'X','X','O','X'}};
    	solve(q);
    	for(int i=0;i<q.length;i++) {
    		System.out.println(new String(q[i]));
    	}
	}  
}


