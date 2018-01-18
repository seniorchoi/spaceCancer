package com.sean.src.objects;

import com.sean.src.GlobalPosition;
import com.sean.src.MainClass;

import javax.swing.*;
import java.awt.*;

public class Enemy extends GlobalPosition {


    private String image = "/images/Dylan.png";


    int speed = 3;


    public Enemy(int x, int y) {
        super(x, y);
    }

    public void update(){
        x+=speed;
        if(x> MainClass.WIDTH-32){
            speed= -3;
        }
        if(x<0){
            speed= 3;
        }

    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(getEnemyImage(), x, y, null);


    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,30,29);

    }


    public Image getEnemyImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(image));
        return i.getImage();


    }



}
