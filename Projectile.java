import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends SpaceObjects
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        Actor rocks = getOneIntersectingObject(Rocks.class);
        Actor debris = getOneIntersectingObject(Debris.class);
        Actor debris2 = getOneIntersectingObject(Debris.class);
        if (rocks != null)
        {
            getWorld().removeObject(rocks);
            getWorld().addObject(new Debris(), getX(), getY());
            getWorld().addObject(new Debris(), getX(), getY());
            getWorld().addObject(new Debris(), getX(), getY());
            getWorld().addObject(new Debris(), getX(), getY());
            MyWorld myWorld = (MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        
        else if (debris != null)
        {
            getWorld().removeObject(debris);
            MyWorld myWorld = (MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            counter.addScore();
            getWorld().removeObject(this);
        }

        else if (getX() == 0)
        {
            getWorld().removeObject(this);
        }
        
        else if (getY() == 0)
        {
            getWorld().removeObject(this);
        }
        
        else if (getX() == 1199)
        {
            getWorld().removeObject(this);
        }
        
        else if (getY() == 899)
        {
            getWorld().removeObject(this);
        }
    }
}

