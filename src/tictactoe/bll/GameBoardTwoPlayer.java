package tictactoe.bll;

/**
 * The GameBoardTwoPlayer class is the mandatory implementation for the TicTacToe assignment.
 * It is used for games where there are two human players.
 */
public class GameBoardTwoPlayer implements IGameModel {

    private int currentPlayer = 0;
    private int winner = -1;

    private boolean gameOver = false;

    private int[][] fields = {
            {-1, -1, -1},
            {-1, -1, -1},
            {-1, -1, -1}
    };

    protected GameBoardTwoPlayer() {

    }

    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    @Override
    public int getNextPlayer() {
        return currentPlayer;
    }

    /**
     * Attempts to let the current player play at the given coordinates. It the
     * attempt is successful the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver ==
     * true this method will always return false.
     */
    @Override
    public boolean play(int col, int row) {
        // Check if the field is not occupied
        if(fields[col][row] == -1 && isGameOver() != true) {
            // Set the selected row to be owned by the current player
            fields[col][row] = currentPlayer;

            //Switch current player
            if (currentPlayer == 0) {
                currentPlayer = 1;
            } else {
                currentPlayer = 0;
            }

            // Return true because the move was allowed
            return true;
        }

        // We return false if the selected row and column is occupied
        return false;
    }

    /**
     * Tells us if the game has ended either by draw or by meeting the winning
     * condition.
     *
     * @return true if the game is over, else it will retun false.
     */
    @Override
    public boolean isGameOver() {
        //Horizontal
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == 0 && fields[i][1] == 0 && fields[i][2] == 0) {
                winner = 0;
                return true;
            } else if (fields[i][0] == 1 && fields[i][1] == 1 && fields[i][2] == 1) {
                winner = 1;
                return true;
            }
        }

        //Vertical
        for (int i = 0; i < fields.length; i++) {
            if (fields[0][i] == 0 && fields[1][i] == 0 && fields[2][i] == 0) {
                winner = 0;
                return true;
            } else if (fields[0][i] == 1 && fields[1][i] == 1  && fields[2][i] == 1) {
                winner = 1;
                return true;
            }
        }

        //Diagonal
        if (fields[0][0] == 0 && fields[1][1] == 0 && fields[2][2] == 0) {
            winner = 0;
            return true;
        } else if (fields[2][0] == 0 && fields[1][1] == 0 && fields[0][2] == 0) {
            winner = 0;
            return true;
        }

        //Diagonal
        if (fields[0][0] == 1 && fields[1][1] == 1 && fields[2][2] == 1) {
            winner = 1;
            return true;
        } else if (fields[2][0] == 1 && fields[1][1] == 1 && fields[0][2] == 1) {
            winner = 1;
            return true;
        }

        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                if (fields[i][j] == -1) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Gets the id of the winner, -1 if its a draw.
     *
     * @return int id of winner, or -1 if draw.
     */
    @Override
    public int getWinner() {
        return winner;
    }

    /**
     * Resets the game to a new game state.
     */
    @Override
    public void newGame() {
        currentPlayer = 0;
        winner = -1;
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                fields[i][j] = -1;
            }
        }
    }

}