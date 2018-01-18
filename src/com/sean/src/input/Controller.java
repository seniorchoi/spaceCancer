package com.sean.src.input;

import com.sean.src.objects.Enemy;

import java.awt.*;
import java.util.LinkedList;

public class Controller {

    static LinkedList<Enemy> e = new LinkedList<Enemy>();

    Enemy TempEnemy;

    public Controller(){

        addEnemy(new Enemy(123,423));

        addEnemy(new Enemy(523,142));

        addEnemy(new Enemy(564,243));

        addEnemy(new Enemy(352,412));

        addEnemy(new Enemy(123,523));

    }


    public void draw(Graphics2D g2d){
        for(int i = 0; i < e.size(); i++){
            TempEnemy = e.get(i);

            TempEnemy.draw(g2d);


        }


    }

    public void update() {

        for(int i =0 ; i<e.size(); i++) {
            TempEnemy = e.get(i);


            TempEnemy.update();

        }
    }

    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }

    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }


    public static LinkedList<Enemy> getEnemyBounds(){

        return e;
    }




}
