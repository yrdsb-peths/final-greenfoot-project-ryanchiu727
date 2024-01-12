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
        if (rocks != null)
        {
            getWorld().removeObject(rocks);
            getWorld().addObject(new Debris(), getX(), getY());
            getWorld().addObject(new Debris(), getX(), getY()); 
            getWorld().removeObject(this);
        }
        Actor debris = getOneIntersectingObject(Debris.class);
        if (debris != null)
        {
            getWorld().removeObject(debris);
            getWorld().removeObject(this);
        }
    }
}
