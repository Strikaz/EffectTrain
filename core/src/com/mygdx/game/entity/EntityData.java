package com.mygdx.game.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.constants.Constants;

public abstract class EntityData {
    protected double speed;
    protected double hp;

    public EntityData(double speed, double hp) {
        this.speed = speed;
        this.hp = hp;
    }

    public EntityData() {
        this.speed = Constants.SPEED_STANDART;
        this.hp = Constants.HP_STANDART;
    }

    public boolean isAlive() {
        return hp > 0;
    }


    public double getHp() {
        return hp;
    }

    public void decreaseHP(double damage) {
        hp -= damage;
    }

    public double getSpeed() {
        return speed;
    }

    public void kill() {
        hp = -1;
    }


}
