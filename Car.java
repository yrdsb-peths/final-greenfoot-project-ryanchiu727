import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(3);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(3);
        }
    }    
}
