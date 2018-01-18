package com.sean.src;

import javax.swing.JFrame;

public class MainClass {

    public static final int WIDTH=640, HEIGHT= 480;
    public static final String TITLE = "Sean";

    public static void main(String args[]){

        JFrame frame = new JFrame();
        frame.pack();
        frame.setSize(640, 480);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Game());

        frame.setVisible(true);




    }

}
