package Benjo;

public class TicTacToeLogic {

	private int[][] table;
	private int numEmptyFileds;
	private String winner;
	private boolean player;
	private boolean gameOver;

	public TicTacToeLogic(int size) {
		int[][] table = new int[size][size];
		initTable();
		this.numEmptyFileds = size * size;
		this.winner = "Tie";
		this.player = true;
		this.gameOver = false;

	}

	private void initTable() {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = -1;
			}
		}

	}

	public boolean setCell(int x, int y) {
		if (x < 0 || x > table.length || y < 0 || y > table[x].length)
			throw new IndexOutOfBoundsException("Koordinate nisu validne!");
		if (table[x][y] != -1)
			throw new IllegalArgumentException("Polje zauzeto!");
		int value;
		if (player == true) {
			value = 1; // x
		} else {
			value = 2; // o
		}

		table[x][y] = value;
		numEmptyFileds--;

		player = !player; // ako player = true postaje false
		gameOver = isOver();

		return gameOver;

	}

	private boolean isOver() {
		if (checkRows() == true) {
			return true;
		}
		if (checkColumns() == true) {
			return true;
		}
		if (checkDiagonals() == true) {
			return true;
		}
		
		if (freeFields == 0) {
			return true;
		}
		return false;
	}

	private boolean checkDiagonals() {
		boolean allEqualDiagonal =true;
		boolean allConEqualDiagonal = true;
		
		
		if( table[0][0]==-1)
			return false;
		return false;
	}

	private boolean checkColumns() {
	for (int i = 0; i < table[0].length; i++) {
			if (checkColumn(i) == true)
				return true;
		}
		return false;
	}

	private boolean checkColumn(int index) {
		if ( table[0][index] ==-1)
			return false;
		for (int i = 1; i < table[0].length; i++) {
			if (table[i][index] != table[i - 1][index])
				return false;
		}
		setWinner( table[0][index]);
		return true;
	}

	private boolean checkRows() {
		for (int i = 0; i < table.length; i++) {
			if (checkRow(i) == true)
				return true;
		}
		return false;
	}

	private boolean checkRow(int index) {
		int[] row = table [index];
		if( row[0] == -1)
			return false;
		
		for (int i = 1; i < table.length; i++) {
			if (table[i] != table[i - 1])
				return false;
		}
		
		setWinner(row[0]);
		return true;
	}

	private void setWinner(int cellValue) {
		if ( cellValue ==1)
			winner ="Player 1";
		else
			winner ="Player 2";
		
	}

}
