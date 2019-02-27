package com.example.dames.game;


//equipe blanche en haut
//equipe noir en bas
public class Pawn {
    private int x;
    private int y;
    private boolean equipe;//true b, false n
    private boolean reine;

    public Pawn() {
    }

    public Pawn(int x, int y, boolean equipe, boolean reine) {
        this.x = x;
        this.y = y;
        this.equipe = equipe;
        this.reine = reine;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEquipe() {
        return equipe;
    }

    public void setEquipe(boolean equipe) {
        this.equipe = equipe;
    }

    public boolean isReine() {
        return reine;
    }

    public void setReine(boolean reine) {
        this.reine = reine;
    }

    public void move(int distance,String direction){
        if(reine){

        }
        else{
            if(distance>1 || distance<1){
                System.out.print("erreur distance deplacement");
            }
            else{
                if(direction.equals("droite")){
                    if(equipe){
                        //equipe blanche
                        if(testDeplacement(1,1)){
                            x++;
                            y++;
                        }
                        else{
                            System.out.print("erreur de deplacement bordure");
                        }
                    }
                    else{
                        //equipe noire
                    }
                }
                else {
                    if(direction.equals("gauche")){
                        if(equipe){
                            //equipe blanche
                        }
                        else{
                            //equipe noir
                        }
                    }
                    else{
                        System.out.print("erreur direction");
                    }
                }

            }
        }
    }

    public boolean testDeplacement(int a,int b){
        return x+a<=10 && x+a>=0 && y+b<=10 && y+b>=10;
    }
}
