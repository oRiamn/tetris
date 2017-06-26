package com.example.oriamn.tetris.piece;

/**
 * Created by oriamn on 26/06/17.
 */

public class IPiece extends Piece {

    private static int[][] FORME = {
            {0, 0, 0, 0},
            {1, 1, 1, 1},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public IPiece() {
        super(IPiece.FORME);
    }
}