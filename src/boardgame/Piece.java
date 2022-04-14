package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board boar) {
		this.board = boar;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
