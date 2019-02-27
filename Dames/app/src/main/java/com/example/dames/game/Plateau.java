package com.example.dames.game;

import java.util.ArrayList;

public class Plateau {

    private ArrayList<Pawn> pawns;
    private int h;
    private int l;

    public Plateau(ArrayList<Pawn> pawns) {
        this.pawns = pawns;
        this.h = 10;
        this.l = 10;
    }

    public Plateau() {
    }

    public ArrayList<Pawn> getPawns() {
        return pawns;
    }

    public void setPawns(ArrayList<Pawn> pawns) {
        this.pawns = pawns;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
}
