import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends SpaceObjects
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int horizontalSpeed = 0;
    int verticalSpeed = 0;
    public Rocket()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    public void act()
    {
        turnCommand();
        moveOnCommand();
        setLocation(getX() + horizontalSpeed, getY() + verticalSpeed);
    }
    public void turnCommand()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
                if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
                if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
    }
    public void moveOnCommand()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            if (getRotation() == 0)
            {
                horizontalSpeed++;
            }
                        if (getRotation() == 180)
            {
                horizontalSpeed--;
            }
                        if (getRotation() == 90)
            {
                verticalSpeed++;
            }
                        if (getRotation() == 270)
            {
                verticalSpeed--;
            }
        }
    }
}
