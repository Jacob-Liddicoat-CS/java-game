package com.realtutsgml.neon.window;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable
{
    private static final long serialVersionUID = -6261436164361361187L;

    public void run()
    {

    }

    public static void main(String args[]){
      new Window(800, 600, "Neon Platform Game Prototype", new Game());
    }
}
