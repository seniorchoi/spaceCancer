package com.sean.src.objects;

import com.sean.src.GlobalPosition;
import com.sean.src.MainClass;
import com.sean.src.input.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Player extends GlobalPosition{

        private String playerimage = "/images/Rafa.png";

        private LinkedList<Enemy> e = Controller.getEnemyBounds();



        int velX=0;
        int velY=0;

        public Player(int x, int y){
            super(x,y);

        }

        public void update (){

            x+=velX;
            y+=velY;

            //collision with outline
            if(x<0){
                    x=0;
                }
            if(y<0){
                y=0;
            }
            if(x>590){
                x=590;
            }
            if(y>406){
                y=406;
            }


            Collision();

        }





    public void Collision(){

            for(int i = 0; i<e.size();i++) {

                if(getBounds().intersects(e.get(i).getBounds())){

                    x=+10;
                    y=10;
                    JOptionPane.showMessageDialog(null, "you got cancer!", "gg!", JOptionPane.ERROR_MESSAGE);



                }

            }

        }

        public void keyPressed(KeyEvent e){

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_RIGHT ){
                velX=5;
            }else if(key == KeyEvent.VK_LEFT){
                velX=-5;
            }else if(key == KeyEvent.VK_DOWN){
                velY=5;
            }else if(key == KeyEvent.VK_UP){
                velY=-5;
            }

        }
        public void keyReleased(KeyEvent e){

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_RIGHT ){
                velX=0;
            }else if(key == KeyEvent.VK_LEFT){
                velX=0;
            }else if(key == KeyEvent.VK_DOWN){
                velY=0;
            }else if(key == KeyEvent.VK_UP){
                velY=0;
            }

        }



        public Rectangle getBounds(){
            return new Rectangle(x,y,50,51);
        }


        public void draw(Graphics2D g2d){
            g2d.drawImage(getPlayerImage(), x, y, null);



        }

        public Image getPlayerImage(){
            ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
            return i.getImage();


        }

}
