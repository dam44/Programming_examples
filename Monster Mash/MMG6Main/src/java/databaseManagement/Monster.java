/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseManagement;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Dan
 */
@Entity
public class Monster {

    @Id
    @GeneratedValue
    private int Id;
    private String name;
    private int height;
    private int age;
    private int maxAge;
    private int strength;
    private int aggression;
    private int worth;
    private boolean isDead;
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getStrength() {
        return strength;
    }

    public int getAggression() {
        return aggression;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public int getWorth() {
        return worth;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public boolean isIsDead() {
        return isDead;
    }
}