package com.realtutsgml.neon.objects;


import java.util.LinkedList;

import com.realtutsgml.neon.framework.GameObject;
import com.realtutsgml.neon.framework.ObjectId;

public class Test extends GameObject
{

    public Test(float x, float y, ObjectId id) {
        super(x, y, id);
    }

    public void tick(LinkedList<GameObject> object)
    {

    }

    public void render(Graphics g)
    {

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVelX() {
        return = velX;
    }

    public float getVelY() {
        return = velY;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public ObjectId getId() {
        return id;
    }

}
