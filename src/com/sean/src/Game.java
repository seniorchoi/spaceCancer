package com.sean.src;

import com.sean.src.input.Controller;
import com.sean.src.input.KeyInput;
import com.sean.src.objects.Enemy;
import com.sean.src.objects.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {


    private static final long serialVersionUID = 1L;

    private String background = "/images/background.png";

    Timer gamelooptimer;

    //objects
    Player p;
    Controller c;



    public Game(){
        setFocusable(true);

        gamelooptimer = new Timer(10,this);
        gamelooptimer.start();

        p = new Player(100,100);
        c = new Controller();

        addKeyListener(new KeyInput(p));



    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(getBackgroundImage(),0,0,this);

        p.draw(g2d);
        c.draw(g2d);




    }


    public Image getBackgroundImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();

    }



    public void actionPerformed(ActionEvent ee) {

        repaint();

        p.update();
        c.update();



    }
}
