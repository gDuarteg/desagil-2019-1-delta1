package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Target extends Element {
    private final Board board;
    private final Random mov = new Random();

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    // Ele sai da zona do jogo, porem ta movimentando. Merece um D :)
    public void move() {
        if (this.col <= 19 && this.row <= 9) {
            this.row = this.row - mov.nextInt(2);
            this.col = this.col - mov.nextInt(2);
        } else if (this.col >= 0 && this.row >= 0) {
            this.row = this.row + mov.nextInt(2);
            this.col = this.col + mov.nextInt(2);
        }
    }
}
